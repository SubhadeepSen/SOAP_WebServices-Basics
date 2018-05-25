package com.publisher;

import javax.xml.ws.Endpoint;

import com.service.HelloWorldService;

public class Publisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/helloworld", new HelloWorldService());
		//for WSDL file  ==> http://localhost:8080/helloworld?wsdl
	}
}
