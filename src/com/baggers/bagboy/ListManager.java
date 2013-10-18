package com.baggers.bagboy;

import java.util.ArrayList;

public class ListManager {

	static String currListName;
	static ArrayList<String> currProductList;
	static String currStore;
	static String currCategory;
	static String currItem;
	static DatabaseConnection db = new DatabaseConnection();
	
	public ListManager() {
		
	}
	
	public static void createList(String listName) {
		String currUser = LoginManager.currUserEmail;
		db.createList(currUser, listName);
	}
	
	public static void addToList(String newProduct) {
		db.addToList(currListName, newProduct);
	}
	
	public static ArrayList<String> loadLists() {
		String currUser = LoginManager.currUserEmail;
		//gets all the lists based on the current user
		return db.loadLists(currUser);
	}
	
	public static ArrayList<String> loadStores() {
		//gets all the stores
	
		return db.loadStores();
	}
	
	public static ArrayList<String> loadCategories() {
		return db.loadCategories();
	}
	
	public static ArrayList<String> loadItemsFromCategory (String categoryName) {
		return db.loadItemsFromCategory(categoryName);
	}
	
	
	
}
