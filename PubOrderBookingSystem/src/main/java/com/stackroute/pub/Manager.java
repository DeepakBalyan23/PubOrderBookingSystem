package com.stackroute.pub;

public class Manager {

	private Order order;
	
	public Manager(Order order) {
		this.order = order;
	}
	
	public void assignServer() {
		Server server = new Server(order);
		server.setOrderDetails();
		server.notifyPubWorker();
	}
}
