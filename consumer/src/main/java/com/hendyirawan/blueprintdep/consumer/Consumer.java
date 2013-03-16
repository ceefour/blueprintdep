package com.hendyirawan.blueprintdep.consumer;

import com.hendyirawan.blueprintdep.dep.HelloService;

public class Consumer {
	
	private final HelloService hello;
	
	public Consumer(HelloService hello) {
		super();
		this.hello = hello;
	}

	public void init() {
		System.out.println("Consumer created");
	}
	
	public void destroy() {
		System.out.println("Consumer destroyed");
	}

}
