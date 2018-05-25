package com.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

//@WebService: declares a java class as web service
	//endpointInterface: refers to an interface (having the service methods) known as SEI.
	//name: name of the port type, by default it is the class name
	//portName: name of the binding, by default it is the class name
	//serviceName: name of the service, by default it is the class name
	//targetNamespace: name of the target namespace
//@WebMethod: declares a java method as web service method
	//action: defines SOAP action
	//exclude: exclude a method to be exposed as a service method
	//operationName: name of the operation
//@WebResult: defines the response
	//name: name of the result tag
//@WebParam: defines the configuration related method parameter
	//name: defines the name of the parameter

@WebService
public class HelloWorldService {

	@WebMethod
	public String sayHelloWorld() {
		return "Hello World";
	}
	
	@WebMethod
	@WebResult(name = "message")
	public String sayName(@WebParam(name = "name") String nameVar) {
		return "Hi! " + nameVar + "\nWelcome to SOAP Web Services";
	}
}
