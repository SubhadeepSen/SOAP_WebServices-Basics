package com.publisher;

import javax.xml.ws.Endpoint;

import com.ws.ShoppingCartImpl;

public class Publisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/shoppingCart", new ShoppingCartImpl());
		//for WSDL file  ==> http://localhost:8080/shoppingCart?wsdl
	}
}
