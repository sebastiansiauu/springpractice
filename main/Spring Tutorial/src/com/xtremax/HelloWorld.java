package com.xtremax;

public class HelloWorld {
	
	private String message;
	
	HelloWorld() {
		
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public void init() {
		System.out.println("Hello World is initializing");
	}
	
	public void destroy() {
		System.out.println("Hello World is destroying");
	}

}
