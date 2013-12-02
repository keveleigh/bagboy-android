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
		if (categories.equal("Wine"){
			items.add("Cabernet");
			items.add("White Wine");
			items.add("Dessert Wine");
			items.add("Red Wine");
			items.add("Chardonnay");
			items.add("Zinfandel");
		}
		else if (categories.equal("Bread"){
			items.add("Buns");
			items.add("Rolls");
			items.add("Bread");
			items.add("Hamburger");
			items.add("French");
			items.add("Italian");
			items.add("Wheat");
			items.add("White");
		}
		else if (categories.equal("Baked Goods"){
			items.add("Biscuits");
		}
		else if (categories.equal("Beer"){
			
		}
		else if (categories.equal("Bakery"){
			items.add("Croissants");
			items.add("Cakes");
			items.add("Donuts");
		}
		else if (categories.equal("Deli"){
			
		}
		else if (categories.equal("Syrup"){
			
		}
		else if (categories.equal("Peanut Butter"){
			
		}
		else if (categories.equal("Cereals"){
			
		}
		else if (categories.equal("Coffee/Tea"){
			
		}
		else if (categories.equal("Powdered Drinks"){
			
		}
		else if (categories.equal("Spices/Extract"){
			
		}
		else if (categories.equal("Cake Mix"){
			items.add("Cake Mix");
			items.add("Brownie Mix");
			items.add("Pancacke Mix");
			items.add("Flour");
		}
		else if (categories.equal("Sugar"){
			
		}
		else if (categories.equal("Soup"){
			
		}
		else if (categories.equal("Pickles/Olives"){
			
		}
		else if (categories.equal("Canned Veggies"){
			items.add("Asparagus");
			items.add("Carrots");
			items.add("Corn");
			items.add("Greenbeans");
			items.add("Peas");
			items.add("Potatoes");
			items.add("Tomatoes");
			
		}
		else if (categories.equal("Pasta"){
			
		}
		else if (categories.equal("Spaghetti/Sauces"){
			
		}
		else if (categories.equal("Rice/Dry Beans"){
			items.add("Baked Beans");
			items.add("Butter Beans");
			items.add("Kidney Beans");
			items.add("Pinto Beans");
			items.add("String Beans");
		}
		else if (categories.equal("Cookies"){
			
		}
		else if (categories.equal("Bathroom Tissue"){
			
		}
		else if (categories.equal("Paper Towels"){
			
		}
		else if (categories.equal("Snacks"){
			items.add("Candy");
			items.add("Cookies");
			items.add("Crackers");
			items.add("Nuts");
			items.add("Popcorn");
			items.add("Potato Chips");
			items.add("Pretzels");
			items.add("Raisins");
		}
		else if (categories.equal("Cola"){
			items.add("Generic Brand");
			items.add("Coca-Cola");
			items.add("Pepsi");
		}
		else if (categories.equal("Potato Chips"){
			
		}
		else if (categories.equal("Pet Food"){
			
		}
		else if (categories.equal("Charcoal"){
			
		}
		else if (categories.equal("Candles"){
			
		}
		else if (categories.equal("Laundry Detergent"){
			
		}
		else if (categories.equal("Dishwashing Detergent"){
			items.add("Dishwashing Soap");
			items.add("Sponges");
		}
		else if (categories.equal("Medicines"){
			items.add("Antiacid");
			items.add("Bandaids");
			items.add("Cough Drops");
			items.add("First Aid Cream");
			items.add("Hydrogen Peroxide");
			items.add("Pain-Reliever");
			items.add("Rubbing Alcohol");
		}
		else if (categories.equal("Baby Products"){
			
		}
		else if (categories.equal("Deodorant"){
			
		}
		else if (categories.equal("Hair Care"){
			
		}
		else if (categories.equal("Bar Soap"){
			
		}
		else if (categories.equal("Cards"){
			
		}
		else if (categories.equal("Water"){
			items.add("Bottled Water");
			items.add("Sparkling Water");
		}
		else if (categories.equal("Cheese"){
			items.add("Boursin");
			items.add("Brie");
			items.add("Cheese");
			items.add("Shredded");
			items.add("Mozarella");
			items.add("Cottage Cheese");
			items.add("Cream Cheese");
		}
		else if (categories.equal("Milk"){
			
		}
		else if (categories.equal("Vitamins"){
			
		}
		else if (categories.equal("Frozen Breakfast"){
			items.add("Breakfast Sausage");
			items.add("Waffles");
		}
		else if (categories.equal("Frozen Meats"){
			items.add("Chicken Nuggets");
			items.add("Chicken Breasts");
			items.add("Chicken Tenderloins");
			items.add("Ground Beef");
			items.add("Ground Turkey");
		}
		else if (categories.equal("Frozen Juices"){
			
		}
		else if (categories.equal("Bacon"){
			
		}
		else if (categories.equal("Ice Cream"){
			items.add("Premium Ice Cream");
			items.add("Simple Ice Cream");
			items.add("Ice Cream");
		}
		else if (categories.equal("Frozen Dessert"){
			
		}
		else if (categories.equal("Frozen Seafood"){
			items.add("Flounder");
			items.add("Mahi Mahi");
			items.add("Tilapia");
		}
		else if (categories.equal("Frozen Potatoes"){
			
		}
		else if (categories.equal("Novelties"){
			
		}
		else if (categories.equal("Frozen Dinners"){
			items.add("Hamburger Helper");
		}
		else if (categories.equal("Frozen Veggies"){
			items.add("Frozen Veggies");
		}
		else if (categories.equal("Frozen Entrees"){
			
		}
		else if (categories.equal("Frozen Food"){
			
		}
		else if (categories.equal("Frozen Pizza"){
			
		}
		else if (categories.equal("Fruits"){
			items.add("Apples");
			items.add("Avocados");
			items.add("Bananas");
			items.add("Berries");
			items.add("Cherries"):
			items.add("Grapefruit");
			items.add("Grapes");
			items.add("Kiwis");
			items.add("Lemons/Limes");
			items.add("Melon");
			items.add("Oranges"):
			items.add("Peaches");
		}
		else if (categories.equal("Produce"){
			items.add("Apples");
			items.add("Avocados");
			items.add("Bananas");
			items.add("Berries");
			items.add("Cherries"):
			items.add("Grapefruit");
			items.add("Grapes");
			items.add("Kiwis");
			items.add("Lemons/Limes");
			items.add("Melon");
			items.add("Oranges"):
			items.add("Peaches");
		}
		else if (categories.equal("Meats"){
			items.add("Beef");
			items.add("Chicken");
			items.add("Fish");
			items.add("Pork");
		}
		else if (categories.equal("Seafood"){
			
		}
		return items;
	}
	
	public static ArrayList<String> loadItemsFromList () {
		//return db.loadItemsFromList(listName);
		return currProductList;
		
	}
	
}
