package com.stackroute.pub;

public class Server {
	
	private Order order;

	public Server(Order order) {
		this.order = order;
	}

	public void setOrderDetails() {
		order.setOrderNumber(2);
		order.setAlcoholicDrink(true);
	}
	
	public void notifyPubWorker() {
		if(order.getOrderType()=="Drinks") {
			if(order.isAlcoholicDrink()&&order.getUserAge()<18) {
				order.setServeStatus("Can't serve alcoholic drinks to less than 18");
			}else {
				PubWorker pubworker = new Bartender();
				pubworker.prepareOrder(order);
			}
		} else {
			PubWorker pubworker = new Chef();
			pubworker.prepareOrder(order);
		}
		
		if(order.getOrderReadyStatus()) {
			serveOrder();
		} else if(!order.isAlcoholicDrink()){
			order.setServeStatus("Order is not ready.");
		}
	}
	
	public void serveOrder() {
		order.setServeStatus("Order is Ready.");
	}
	
}
