package com.baggers.bagboy;

import java.util.ArrayList;

public class ListManager {

	//static String currListName;
	static ArrayList<String> currProductList;
	static String currStore;
	static String currCategory;
	static String currItem;
	static ArrayList<String> listCollection
	static DatabaseConnection db = new DatabaseConnection();
	
	public ListManager() {
		
	}
	
	public static void createList(String listName) {
		currProductList = new ArrayList<String>();
		listCollection.add(currProductList);
		//db.createList(LoginManager.currUserEmail, listName);
	}
	
	
	public static void addToList(String newProduct) {
		currProductList.add(newProduct);
		
	}
	
	public static ArrayList<String> loadLists() {
		String currUser = LoginManager.currUserEmail;
		//gets all the lists based on the current user
		return listCollection;
	}
	
	public static ArrayList<String> loadStores() {
		//gets all the stores
		ArrayList<String> stores = new ArrayList<String>();
		//a bunch of statements adding strings to the categories list 
		stores.add("Publix");
		stores.add("Kroger");
		stores.add("Walmart Supercenter");
		stores.add("Super Target");
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
			items.add("Budweiser");
			items.add("Bud Light");
			items.add("Shock Top");
			items.add("Blue Moon");
		}
		else if (categories.equal("Bakery"){
			items.add("Croissants");
			items.add("Cakes");
			items.add("Donuts");
		}
		else if (categories.equal("Deli"){
			items.add("Deli");
		}
		else if (categories.equal("Syrup"){
			items.add("Auntie May");
			items.add("Cranberry Syrup");
			items.add("Syrup");
		}
		else if (categories.equal("Peanut Butter"){
			items.add("Peanut Butter");
			items.add("Jif");
			items.add("Skippy");
			items.add("Peter Pan");
		}
		else if (categories.equal("Cereals"){
			items.add("Cereals");
			items.add("Apple Jacks");
			items.add("Frosted Flakes");
			items.add("Bran Flakes");
			items.add("Cap'n Crunch");
			items.add("Cheerios");
			items.add("Chex");
			items.add("Cinnamon Toast Crunch");
		}
		else if (categories.equal("Coffee/Tea"){
			items.add("Coffee");
			items.add("Tea");
			items.add("Ground Coffee");
		}
		else if (categories.equal("Powdered Drinks"){
			items.add("Crystal Light");
			items.add("Lipton Tea");
			items.add("Gatorade");
			items.add("Nestle Nesquik");
			items.add("Powerade");
		}
		else if (categories.equal("Spices/Extract"){
			items.add("Basil");
			items.add("Spices");
			items.add("Extract");
			items.add("Chives");
			items.add("Mint");
			items.add("Dill");
			items.add("Oregano");
			items.add("Parsley");
			items.add("Rosemary");
			items.add("Sage");
			items.add("Thyme");
		}
		else if (categories.equal("Cake Mix"){
			items.add("Cake Mix");
			items.add("Brownie Mix");
			items.add("Pancacke Mix");
			items.add("Flour");
		}
		else if (categories.equal("Sugar"){
			items.add("Sugar");
		}
		else if (categories.equal("Soup"){
			items.add("Soup");
			items.add("Tomato Soup");
		}
		else if (categories.equal("Pickles/Olives"){
			items.add("Pickles");
			items.add("Olives");
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
			items.add("Pasta");
		}
		else if (categories.equal("Spaghetti/Sauces"){
			items.add("Spaghetti");
			items.add("Sauce");
		}
		else if (categories.equal("Rice/Dry Beans"){
			items.add("Baked Beans");
			items.add("Butter Beans");
			items.add("Kidney Beans");
			items.add("Pinto Beans");
			items.add("String Beans");
		}
		else if (categories.equal("Cookies"){
			items.add("Cookies");
			items.add("Sugar Cookies")l
			items.add("Chocolate Chip Cookies");
			items.add("Cookie Dough");
		}
		else if (categories.equal("Bathroom Tissue"){
			items.add("Bathroom Tissue");
			items.add("Toilet Paper");
			items.add("Bathroom Cleaners");
		}
		else if (categories.equal("Paper Towels"){
			items.add("Paper Towels");
			items.add("Garbage Bags");
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
			items.add("Chips");
			items.add("Lays Chips");
			items.add("Doritos");
		}
		else if (categories.equal("Pet Food"){
			items.add("Ped Food");
		}
		else if (categories.equal("Charcoal"){
			items.add("Charcoal");
		}
		else if (categories.equal("Candles"){
			items.add("Candles");
		}
		else if (categories.equal("Laundry Detergent"){
			items.add("Laundry Detergent");
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
			items.add("Baby Products");
			items.add("Bottles");
		}
		else if (categories.equal("Deodorant"){
			items.add("Deodorant");
		}
		else if (categories.equal("Hair Care"){
			items.add("Shampoo");
			items.add("Conditioner");
		}
		else if (categories.equal("Bar Soap"){
			items.add("Bar Soap");
			items.add("Soap");
			items.add("Body Lotion");
		}
		else if (categories.equal("Cards"){
			items.add("Cards");
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
			items.add("Milk");
			items.add("2 Percent Milk");
			items.add("Skim Milk");
			items.add("Soy Milk");
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
			items.add("Orange Juice");
			items.add("Juice");
			items.add("Apple Juice");
		}
		else if (categories.equal("Bacon"){
			items.add("Bacon");
		}
		else if (categories.equal("Ice Cream"){
			items.add("Premium Ice Cream");
			items.add("Simple Ice Cream");
			items.add("Ice Cream");
		}
		else if (categories.equal("Frozen Dessert"){
			items.add("Frozen Dessert");
			items.add("Pie");
			items.add("Ice Cream");
		}
		else if (categories.equal("Frozen Seafood"){
			items.add("Flounder");
			items.add("Mahi Mahi");
			items.add("Tilapia");
		}
		else if (categories.equal("Frozen Potatoes"){
			items.add("French Fries");
			items.add("Frozen Potatoes");
		}
		else if (categories.equal("Novelties"){
			items.add("Novelties");
			items.add("Paper");
			items.add("Pencils"):
			items.add("Notebook");
		}
		else if (categories.equal("Frozen Dinners"){
			items.add("Hamburger Helper");
		}
		else if (categories.equal("Frozen Veggies"){
			items.add("Frozen Veggies");
		}
		else if (categories.equal("Frozen Entrees"){
			items.add("Frozen Entrees");
			items.add("Hot Pockets");
			items.add("Lean Cuisine");
		}
		else if (categories.equal("Frozen Food"){
			items.add("Frozen Food");
		}
		else if (categories.equal("Frozen Pizza"){
			items.add("Frozen Pizza");
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
			items.add("Seafood");	
		}
		return items;
	}
	
	public static ArrayList<String> loadItemsFromList () {
		//return db.loadItemsFromList(listName);
		return currProductList;
		
	}
	
}
