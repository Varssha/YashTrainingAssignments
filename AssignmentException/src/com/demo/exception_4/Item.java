package com.demo.exception_4;

public class Item {
	
	private String itemName;
	private double price;
	private int maximumNumberOfItem;
	
	Object[] itemList = { itemName, price, maximumNumberOfItem };

	public Item(String itemName, double price, int maximumNumberOfItem) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.maximumNumberOfItem = maximumNumberOfItem;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", price=" + price + ", maximumNumberOfItem=" + maximumNumberOfItem + "]";
	}




}
