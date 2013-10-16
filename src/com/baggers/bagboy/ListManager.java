package com.baggers.bagboy;

import java.util.ArrayList;

public class ListManager {

	private static String listName;
	private static ArrayList<String> productList;
	private static DatabaseConnection db = new DatabaseConnection();
	
	public ListManager() {
		
	}
	
	public static void createList() {
		db.createList();
	}
	
	public static void addToList(String newProduct) {
		db.addToList(listName, newProduct);
	}
	
}
