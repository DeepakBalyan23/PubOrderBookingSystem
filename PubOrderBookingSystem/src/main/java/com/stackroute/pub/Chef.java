package com.stackroute.pub;

public class Chef implements PubWorker{

	public Order prepareOrder(Order order) {
		order.setOrderReadyStatus(true);
		System.out.println("Food Ready");
		return order;
	}

}
