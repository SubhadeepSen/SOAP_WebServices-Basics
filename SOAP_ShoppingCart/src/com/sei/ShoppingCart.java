package com.sei;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.models.Item;

@WebService(name = "cart", portName = "cartPort", serviceName = "myCart", targetNamespace = "http://www.buynow.com")
public interface ShoppingCart {

	@WebMethod
	@WebResult(name = "item")
	public List<Item> getItems();

	@WebMethod
	@WebResult(name = "message")
	public String addItem(@WebParam(name = "item") Item item);
	
	@WebMethod
	@WebResult(name = "message")
	public String removeItem(@WebParam(name = "itemId") int id);
}
