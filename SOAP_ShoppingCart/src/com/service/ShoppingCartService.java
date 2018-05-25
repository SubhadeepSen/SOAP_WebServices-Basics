package com.service;

import java.util.ArrayList;
import java.util.List;

import com.models.Item;
import com.transfomer.TransfomerUtil;

public class ShoppingCartService {

	private List<Item> itemList;

	private TransfomerUtil transfomerUtil;

	public ShoppingCartService() {
		createItemList();
		transfomerUtil = new TransfomerUtil();
	}

	public List<Item> getItems() {
		return itemList;
	}

	public boolean addItem(Item item) {
		boolean isAdded = false;
		try {
			item = transfomerUtil.transformToItemObject(item, itemList.size());
			isAdded = itemList.add(item);
		}catch(NullPointerException e) {
			isAdded = false;
		}
		return isAdded;
	}

	private void createItemList() {
		itemList = new ArrayList<>();
		itemList.add(new Item(1, "Lenovo Y472", 45348));
		itemList.add(new Item(2, "Redmi Y1", 14586));
		itemList.add(new Item(3, "Towel", 599));
		itemList.add(new Item(4, "Spinner", 299));
	}

	public boolean removeItem(int id) {
		return itemList.removeIf((item) -> item.getId() == id);
	}
}
