package com.transfomer;

import com.models.Item;

public class TransfomerUtil {

	public Item transformToItemObject(Item item, int size) {
		Item newItem = new Item();
		newItem.setId(size + 1);
		if(item.getName().equals("") || item.getName().equals("?"))
			throw new NullPointerException();
		else
			newItem.setName(item.getName());
		
		if(item.getPrice() == 0.0)
			throw new NullPointerException();
		else
			newItem.setPrice(item.getPrice());
		
		return newItem;
	}
}
