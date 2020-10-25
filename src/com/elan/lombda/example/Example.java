package com.elan.lombda.example;
public class Example {

	   public static void main(String args[]) {
	        // lambda expression
	    	MyFunctionalInterface msg = () -> {
	    		return "Hello";
	    	};
	        System.out.println(msg.sayHello());
	    }
	}
