package com.stackroute.pub;

public class User {

	public static void main(String args[]) {
		Order order = new Order("Vodka", "Drinks", 17);
		Manager manager = new Manager(order);
		manager.assignServer();
		System.out.println(order.getServeStatus());
	}
}
