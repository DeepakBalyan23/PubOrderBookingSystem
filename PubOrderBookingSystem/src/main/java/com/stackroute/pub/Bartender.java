package com.stackroute.pub;

public class Bartender implements PubWorker{

	public Order prepareOrder(Order order) {
		order.setOrderReadyStatus(true);
		System.out.println("Drinks Ready");
		return order;
	}

}
