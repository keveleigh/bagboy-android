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
		categories.add("Wine");
		categories.add("Bread");
		categories.add("Baked Goods");
		categories.add("Beer");
		categories.add("Bakery");
		categories.add("Deli");
		categories.add("Syrup");
		categories.add("Peanut Butter");
		categories.add("Cereals");
		categories.add("Coffee/Tee");
		categories.add("Powdered Drinks");
		categories.add("Spices/Extract");
		categories.add("Cake Mix")
		categories.add("Sugar");
		categories.add("Soup");
		categories.add("Pickles/Olives");
		categories.add("Canned Veggies");
		categories.add("Pasta");
		categories.add("Spaghetti/Sauces");
		categories.add("Rice/Dry Beans");
		categories.add("Cookies");
		categories.add("Bathroom Tissue");
		categories.add("Paper Towels");
		categories.add("Snacks");
		categories.add("Cola");
		categories.add("Potato Chips"):
		categories.add("Pet Food");
		categories.add("Charcoal");
		categories.add("Candles");
		categories.add("Laundry Detergent");
		categories.add("Dishwashing Detergent");
		categories.add("Medicines");
		categories.add("Baby Products");
		categories.add("Deodorant");
		categories.add("Hair Care");
		categories.add("Bar Soap");
		categories.add("Cards");
		categories.add("Water");
		categories.add("Cheese");
		categories.add("Milk");
		categories.add("Vitamins");
		categories.add("Frozen Breakfast");
		categories.add("Frozen Meats");
		categories.add("Frozen Juices");
		categories.add("Bacon");
		categories.add("Ice Cream");
		categories.add("Frozen Dessert");
		categories.add("Frozen Seafood");
		categories.add("Frozen Potatoes");
		categories.add("Novelties");
		categories.add("Frozen Dinners");
		categories.add("Frozen Veggies");
		categories.add("Frozen Entrees");
		categories.add("Frozen Food");
		categories.add("Frozen Pizza");
		categories.add("Fruits");
		categories.add("Produce");
		categories.add("Meats");
		categories.add("Seafood");
		categories.add("Produce");
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
