package com.example.demo.stream;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

class Item {
	
	private int itemid;
	private String iname;
	private LocalDateTime date_of_manufacturing, date_of_expiry;
	private float price;
	
	
	public Item(int itemid, String iname, LocalDateTime date_of_manufacturing, LocalDateTime date_of_expiry,
			float price) {
		super();
		this.itemid = itemid;
		this.iname = iname;
		this.date_of_manufacturing = date_of_manufacturing;
		this.date_of_expiry = date_of_expiry;
		this.price = price;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public LocalDateTime getDate_of_manufacturing() {
		return date_of_manufacturing;
	}

	public void setDate_of_manufacturing(LocalDateTime date_of_manufacturing) {
		this.date_of_manufacturing = date_of_manufacturing;
	}

	public LocalDateTime getDate_of_expiry() {
		return date_of_expiry;
	}

	public void setDate_of_expiry(LocalDateTime date_of_expiry) {
		this.date_of_expiry = date_of_expiry;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	

	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", iname=" + iname + ", date_of_manufacturing=" + date_of_manufacturing
				+ ", date_of_expiry=" + date_of_expiry + ", price=" + price + "]";
	}


}

 public class ItemTest{

	public static void main(String[] args) {
		List<Item> items = Arrays.asList(
				new Item(1, "milk", LocalDateTime.of(2022, 10, 1, 0, 0, 0), LocalDateTime.of(2022, 10, 3, 0, 0, 0), 25),
				new Item(
						2, "bread", LocalDateTime.of(2022, 9, 25, 0, 0, 0), LocalDateTime.of(2022, 9, 29, 0, 0, 0), 15),
				new Item(3, "waterbottle", LocalDateTime.of(2022, 10, 1, 0, 0, 0), null, 20),
				new Item(4, "oil", LocalDateTime.of(2022, 01, 13, 0, 0, 0), LocalDateTime.of(2022, 06, 13, 0, 0, 0),
						96),
				new Item(5, "apple", LocalDateTime.of(2022, 04, 11, 0, 0, 0), LocalDateTime.of(2022, 04, 18, 0, 0, 0),
						120),
				new Item(6, "soap", LocalDateTime.of(2022, 01, 13, 0, 0, 0), LocalDateTime.of(2022, 06, 13, 0, 0, 0),
						96),
				new Item(7, "clothes", LocalDateTime.of(2022, 10, 1, 0, 0, 0), null, 250));

		
		// 1. WAP to find the average price of item from the list of given items.
		
		System.out.println("WAP to find the average price of item from the list of given items.");
		System.out.println("\n=============================================");
		Double averagePrice = items.stream().collect(Collectors.averagingDouble(i -> i.getPrice()));
		System.out.println("The average price of item from the list of given items => " + averagePrice);

		
		// 2. WAP to print detail of item which is having highest and lowest price.
	
		System.out.println(" WAP to print detail of item which is having highest and lowest price.");
		System.out.println("\n=============================================");
		Optional<Item> highestPriceItem = items.stream().max((i1, i2) -> (int) i1.getPrice() - (int) i2.getPrice());
		System.out.println("Item with Highest Price => " + highestPriceItem);
		Optional<Item> lowestPriceItem = items.stream().min((i1, i2) -> (int) i1.getPrice() - (int) i2.getPrice());
		System.out.println("Item with Lowest Price => " + lowestPriceItem);

		// 3. WAP to print the item with maximum price and not having any expiry
		// date(item like water bottle, and dresses not having any expiry date)
	
		System.out.println(
				" WAP to print the item with maximum price and not having any expiry date(item like water bottle, and dresses not having any expiry date)");
		System.out.println("\n=============================================");
		Optional<Item> highestPriceItemWithNoExpiryDate = items.stream().filter(i -> i.getDate_of_expiry() == null)
				.max((i1, i2) -> (int) i1.getPrice() - (int) i2.getPrice());
		System.out.println(
				"The item with maximum price and not having any expiry date => " + highestPriceItemWithNoExpiryDate);

		// 4. WAP to store item name and price from list to set.
		
		System.out.println("WAP to store item name and price from list to set.");
		System.out.println("\n=============================================");
		
		items.stream().collect(Collectors.toSet())
				.forEach(i -> System.out.println("Item name = " + i.getIname() + " price = " + i.getPrice()));

		// 5. WAP to remove duplicate prices from the list of the items.

		
		System.out.println(" WAP to remove duplicate prices from the list of the items.");
	    System.out.println("\n=============================================");

//		Set<Entry<String, Float>> distinctPriceItems = items.stream()
//				.collect(Collectors.toMap(Item::getIname, Item::getPrice)).entrySet();
//		for (Entry<String, Float> entry : distinctPriceItems)
//			System.out.println("Item name = " + entry.getKey() + " price = " + entry.getValue());


	}
	
 }
 
