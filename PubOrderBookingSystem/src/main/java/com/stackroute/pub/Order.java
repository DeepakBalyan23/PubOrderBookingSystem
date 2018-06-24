package com.stackroute.pub;

public class Order {

	private String dishName;
	private String orderType;
	private int userAge;
	
	private boolean orderReadyStatus;
	
	private int orderNumber;
	private boolean isAlcoholicDrink;
	private String serveStatus;
	
	public Order(String dishName, String orderType, int userAge) {
		this.dishName = dishName;
		this.orderType = orderType;
		this.userAge = userAge;
	}
	
	public String getServeStatus() {
		return serveStatus;
	}

	public void setServeStatus(String serveStatus) {
		this.serveStatus = serveStatus;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public boolean getOrderReadyStatus() {
		return orderReadyStatus;
	}

	public void setOrderReadyStatus(boolean isOrderReady) {
		this.orderReadyStatus = isOrderReady;
	}

	public boolean isAlcoholicDrink() {
		return isAlcoholicDrink;
	}

	public void setAlcoholicDrink(boolean isAlcoholicDrink) {
		this.isAlcoholicDrink = isAlcoholicDrink;
	}
}
