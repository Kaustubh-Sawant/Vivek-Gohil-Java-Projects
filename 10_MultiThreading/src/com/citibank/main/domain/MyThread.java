package com.citibank.main.domain;

public class MyThread implements Runnable {

	private Resource resource;
	private String textMessage;

	public MyThread(Resource resource, String textMessage) {
		super();
		this.resource = resource;
		this.textMessage = textMessage;
	}

	@Override
	public void run() {
		resource.message(textMessage);
	}

}
