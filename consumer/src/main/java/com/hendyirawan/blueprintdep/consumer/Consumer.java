package com.hendyirawan.blueprintdep.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hendyirawan.blueprintdep.dep.HelloService;

public class Consumer {
	
	private static final Logger log = LoggerFactory.getLogger(Consumer.class);
	private final HelloService hello;
	
	public Consumer(HelloService hello) {
		super();
		this.hello = hello;
	}

	public void init() {
		System.out.println("Consumer created");
		log.warn("Consumer created");
	}
	
	public void destroy() {
		System.out.println("Consumer destroyed");
		log.warn("Consumer destroyed");
	}

}
