package com.ws;

import java.util.List;

import javax.jws.WebService;

import com.models.Item;
import com.sei.ShoppingCart;
import com.service.ShoppingCartService;

@WebService(endpointInterface = "com.sei.ShoppingCart")
public class ShoppingCartImpl implements ShoppingCart {

	private ShoppingCartService shoppingCartService = new ShoppingCartService();

	@Override
	public List<Item> getItems() {
		return shoppingCartService.getItems();
	}

	@Override
	public String addItem(Item item) {
		String message = "";
		if (shoppingCartService.addItem(item))
			message = "Successfully added to cart";
		else
			message = "Unable to add";
		return message;
	}

	@Override
	public String removeItem(int id) {
		String message = "";
		if (shoppingCartService.removeItem(id))
			message = "removed from cart";
		else
			message = "Unable to remove";
		return message;
	}

}
