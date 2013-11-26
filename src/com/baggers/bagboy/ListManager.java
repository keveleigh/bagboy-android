package com.baggers.bagboy;

import java.util.ArrayList;

public class ListManager {

	//static String currListName;
	static ArrayList<String> currProductList;
	static String currStore;
	static String currCategory;
	static String currItem;
	static DatabaseConnection db = new DatabaseConnection();
	
	public ListManager() {
		
	}
	
	public static void createList(String listName) {
		currProductList = new ArrayList<String>();
		
		//db.createList(LoginManager.currUserEmail, listName);
	}
	
	
	public static void addToList(String newProduct) {
		currProductList.add(newProduct);
		
	}
	
	public static ArrayList<String> loadLists() {
		String currUser = LoginManager.currUserEmail;
		//gets all the lists based on the current user
		return db.loadLists(currUser);
	}
	
	public static ArrayList<String> loadStores() {
		//gets all the stores
		ArrayList<String> stores = new ArrayList<String>();
		//a bunch of statements adding strings to the categories list 
		stores.add("Publix");
		stores.add("Kroger");
		
		return stores; 
	}
	
	public static ArrayList<String> loadCategories() {
		//return db.loadCategories();
		ArrayList<String> categories = new ArrayList<String>();
		//a bunch of statements adding strings to the categories list 
		return categories;
	}
	
	public static ArrayList<String> loadItemsFromCategory (String categoryName) {
		//return db.loadItemsFromCategory(categoryName);
		ArrayList<String> items = new ArrayList<String>();
		//a bunch of if statements for the different categories
		//need to look at database for this info
		
		return items;
	}
	
	public static ArrayList<String> loadItemsFromList () {
		//return db.loadItemsFromList(listName);
		return currProductList;
		
	}
	
}
