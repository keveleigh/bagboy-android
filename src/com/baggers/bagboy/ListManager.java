package com.baggers.bagboy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ListManager {

	//static String currListName;
	static ArrayList<String> currProductList = new ArrayList<String>();
	static String currStore;
	static String currCategory = "";
	static String currItem;
	static Map<String, ArrayList<String>> listCollection = new HashMap<String, ArrayList<String>>();
	static DatabaseConnection db = new DatabaseConnection();
	
	public ListManager() {
		
	}
	
	public static void createList(String listName) {
		currProductList = new ArrayList<String>();
		listCollection.put(listName, currProductList);
	}
	
	
	public static void addToList(String newProduct) {
		currProductList.add(newProduct);
		
	}
	
	public static void deleteFromList(String deletedProduct) {
		for (int i = 0 ; i < currProductList.size(); i++) {
			if (deletedProduct.equals(currProductList.get(i))) {
				currProductList.remove(i);
				break;
			}
		}
	}
	
	public static ArrayList<String> loadLists() {
		
		ArrayList<String> tailgateList = new ArrayList<String>();
		tailgateList.add("Ground Beef");
		tailgateList.add("Potato Chips");
		listCollection.put("Tailgate List", tailgateList);
		
		ArrayList<String> listNames = new ArrayList<String>();
		//go through list collection and get all names
		listNames.addAll(listCollection.keySet());
		/*System.out.println(listNames.size());
		 for (int i = 0; i < listNames.size(); i++) {
	        	System.out.println(listNames.get(i));
	        }*/
		return listNames;
	}
	
	public static ArrayList<String> loadStores() {
		//gets all the stores
		ArrayList<String> stores = new ArrayList<String>();
		//a bunch of statements adding strings to the categories list 
		stores.add("Publix");
		stores.add("Kroger");
		stores.add("Super Target");
		stores.add("Walmart Supercenter");
		
		return stores; 
	}
	
	public static void saveList(String listName) {
		
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
		categories.add("Coffee/Tea");
		categories.add("Powdered Drinks");
		categories.add("Spices/Extract");
		categories.add("Cake Mix");
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
		categories.add("Potato Chips");
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
		Collections.sort(categories, String.CASE_INSENSITIVE_ORDER);
		return categories;
	}
	
	public static ArrayList<String> loadItemsFromCategory (String categoryName) {
		//return db.loadItemsFromCategory(categoryName);
		
		ArrayList<String> items = new ArrayList<String>();
		if (categoryName.equals("")) {
			
		}
		else if (categoryName.equals("Wine")){
			items.add("Cabernet");
			items.add("White Wine");
			items.add("Dessert Wine");
			items.add("Red Wine");
			items.add("Chardonnay");
			items.add("Zinfandel");
		}
		else if (categoryName.equals("Bread")){
			items.add("Buns");
			items.add("Rolls");
			items.add("Bread");
			items.add("Hamburger");
			items.add("French");
			items.add("Italian");
			items.add("Wheat");
			items.add("White");
		}
		else if (categoryName.equals("Baked Goods")){
			items.add("Biscuits");
		}
		else if (categoryName.equals("Beer")){
			items.add("Budweiser");
			items.add("Bud Light");
			items.add("Shock Top");
			items.add("Blue Moon");
		}
		else if (categoryName.equals("Bakery")){
			items.add("Croissants");
			items.add("Cakes");
			items.add("Donuts");
		}
		else if (categoryName.equals("Deli")){
			items.add("Deli");
		}
		else if (categoryName.equals("Syrup")){
			items.add("Auntie May");
			items.add("Cranberry Syrup");
			items.add("Syrup");
		}
		else if (categoryName.equals("Peanut Butter")){
			items.add("Peanut Butter");
			items.add("Jif");
			items.add("Skippy");
			items.add("Peter Pan");
		}
		else if (categoryName.equals("Cereals")){
			items.add("Cereals");
			items.add("Apple Jacks");
			items.add("Frosted Flakes");
			items.add("Bran Flakes");
			items.add("Cap'n Crunch");
			items.add("Cheerios");
			items.add("Chex");
			items.add("Cinnamon Toast Crunch");
		}
		else if (categoryName.equals("Coffee/Tea")){
			items.add("Coffee");
			items.add("Tea");
			items.add("Ground Coffee");
		}
		else if (categoryName.equals("Powdered Drinks")){
			items.add("Crystal Light");
			items.add("Lipton Tea");
			items.add("Gatorade");
			items.add("Nestle Nesquik");
			items.add("Powerade");
		}
		else if (categoryName.equals("Spices/Extract")){
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
		else if (categoryName.equals("Cake Mix")){
			items.add("Cake Mix");
			items.add("Brownie Mix");
			items.add("Pancacke Mix");
			items.add("Flour");
		}
		else if (categoryName.equals("Sugar")){
			items.add("Sugar");
		}
		else if (categoryName.equals("Soup")){
			items.add("Soup");
			items.add("Tomato Soup");
		}
		else if (categoryName.equals("Pickles/Olives")){
			items.add("Pickles");
			items.add("Olives");
		}
		else if (categoryName.equals("Canned Veggies")){
			items.add("Asparagus");
			items.add("Carrots");
			items.add("Corn");
			items.add("Greenbeans");
			items.add("Peas");
			items.add("Potatoes");
			items.add("Tomatoes");
			
		}
		else if (categoryName.equals("Pasta")){
			items.add("Pasta");
		}
		else if (categoryName.equals("Spaghetti/Sauces")){
			items.add("Spaghetti");
			items.add("Sauce");
		}
		else if (categoryName.equals("Rice/Dry Beans")){
			items.add("Baked Beans");
			items.add("Butter Beans");
			items.add("Kidney Beans");
			items.add("Pinto Beans");
			items.add("String Beans");
		}
		else if (categoryName.equals("Cookies")){
			items.add("Cookies");
			items.add("Sugar Cookies");
			items.add("Chocolate Chip Cookies");
			items.add("Cookie Dough");
		}
		else if (categoryName.equals("Bathroom Tissue")){
			items.add("Bathroom Tissue");
			items.add("Toilet Paper");
			items.add("Bathroom Cleaners");
		}
		else if (categoryName.equals("Paper Towels")){
			items.add("Paper Towels");
			items.add("Garbage Bags");
		}
		else if (categoryName.equals("Snacks")){
			items.add("Candy");
			items.add("Cookies");
			items.add("Crackers");
			items.add("Nuts");
			items.add("Popcorn");
			items.add("Potato Chips");
			items.add("Pretzels");
			items.add("Raisins");
		}
		else if (categoryName.equals("Cola")){
			items.add("Generic Brand");
			items.add("Coca-Cola");
			items.add("Pepsi");
		}
		else if (categoryName.equals("Potato Chips")){
			items.add("Chips");
			items.add("Lays Chips");
			items.add("Doritos");
		}
		else if (categoryName.equals("Pet Food")){
			items.add("Pet Food");
		}
		else if (categoryName.equals("Charcoal")){
			items.add("Charcoal");
		}
		else if (categoryName.equals("Candles")){
			items.add("Candles");
		}
		else if (categoryName.equals("Laundry Detergent")){
			items.add("Laundry Detergent");
		}
		else if (categoryName.equals("Dishwashing Detergent")){
			items.add("Dishwashing Soap");
			items.add("Sponges");
		}
		else if (categoryName.equals("Medicines")){
			items.add("Antiacid");
			items.add("Bandaids");
			items.add("Cough Drops");
			items.add("First Aid Cream");
			items.add("Hydrogen Peroxide");
			items.add("Pain-Reliever");
			items.add("Rubbing Alcohol");
		}
		else if (categoryName.equals("Baby Products")){
			items.add("Baby Products");
			items.add("Bottles");
		}
		else if (categoryName.equals("Deodorant")){
			items.add("Deodorant");
		}
		else if (categoryName.equals("Hair Care")){
			items.add("Shampoo");
			items.add("Conditioner");
		}
		else if (categoryName.equals("Bar Soap")){
			items.add("Bar Soap");
			items.add("Soap");
			items.add("Body Lotion");
		}
		else if (categoryName.equals("Cards")){
			items.add("Cards");
		}
		else if (categoryName.equals("Water")){
			items.add("Bottled Water");
			items.add("Sparkling Water");
		}
		else if (categoryName.equals("Cheese")){
			items.add("Boursin");
			items.add("Brie");
			items.add("Cheese");
			items.add("Shredded");
			items.add("Mozarella");
			items.add("Cottage Cheese");
			items.add("Cream Cheese");
		}
		else if (categoryName.equals("Milk")){
			items.add("Milk");
			items.add("2 Percent Milk");
			items.add("Skim Milk");
			items.add("Soy Milk");
		}
		else if (categoryName.equals("Vitamins")){
			
		}
		else if (categoryName.equals("Frozen Breakfast")){
			items.add("Breakfast Sausage");
			items.add("Waffles");
		}
		else if (categoryName.equals("Frozen Meats")){
			items.add("Chicken Nuggets");
			items.add("Chicken Breasts");
			items.add("Chicken Tenderloins");
			items.add("Ground Beef");
			items.add("Ground Turkey");
		}
		else if (categoryName.equals("Frozen Juices")){
			items.add("Orange Juice");
			items.add("Juice");
			items.add("Apple Juice");
		}
		else if (categoryName.equals("Bacon")){
			items.add("Bacon");
		}
		else if (categoryName.equals("Ice Cream")){
			items.add("Premium Ice Cream");
			items.add("Simple Ice Cream");
			items.add("Ice Cream");
		}
		else if (categoryName.equals("Frozen Dessert")){
			items.add("Frozen Dessert");
			items.add("Pie");
			items.add("Ice Cream");
		}
		else if (categoryName.equals("Frozen Seafood")){
			items.add("Flounder");
			items.add("Mahi Mahi");
			items.add("Tilapia");
		}
		else if (categoryName.equals("Frozen Potatoes")){
			items.add("French Fries");
			items.add("Frozen Potatoes");
		}
		else if (categoryName.equals("Novelties")){
			items.add("Novelties");
			items.add("Paper");
			items.add("Pencils");
			items.add("Notebook");
		}
		else if (categoryName.equals("Frozen Dinners")){
			items.add("Hamburger Helper");
		}
		else if (categoryName.equals("Frozen Veggies")){
			items.add("Frozen Veggies");
		}
		else if (categoryName.equals("Frozen Entrees")){
			items.add("Frozen Entrees");
			items.add("Hot Pockets");
			items.add("Lean Cuisine");
		}
		else if (categoryName.equals("Frozen Food")){
			items.add("Frozen Food");
		}
		else if (categoryName.equals("Frozen Pizza")){
			items.add("Frozen Pizza");
		}
		else if (categoryName.equals("Fruits")){
			items.add("Apples");
			items.add("Avocados");
			items.add("Bananas");
			items.add("Berries");
			items.add("Cherries");
			items.add("Grapefruit");
			items.add("Grapes");
			items.add("Kiwis");
			items.add("Lemons/Limes");
			items.add("Melon");
			items.add("Oranges");
			items.add("Peaches");
		}
		else if (categoryName.equals("Produce")){
			items.add("Apples");
			items.add("Avocados");
			items.add("Bananas");
			items.add("Berries");
			items.add("Cherries");
			items.add("Grapefruit");
			items.add("Grapes");
			items.add("Kiwis");
			items.add("Lemons/Limes");
			items.add("Melon");
			items.add("Oranges");
			items.add("Peaches");
		}
		else if (categoryName.equals("Meats")){
			items.add("Beef");
			items.add("Chicken");
			items.add("Fish");
			items.add("Pork");
		}
		else if (categoryName.equals("Seafood")){
			items.add("Seafood");	
		}
		Collections.sort(items, String.CASE_INSENSITIVE_ORDER);
		return items;
	}
		public static String getCategory(String productName) {
		String category = "";
		if (productName.equals("")) {

		} else if (productName.equals("Cabernet")
				| productName.equals("White Wine")
				| productName.equals("Dessert Wine")
				| productName.equals("Red Wine")
				| productName.equals("Chardonnary")
				| productName.equals("Zinfandel")) {
			category = "Wine";
		} else if (productName.equals("Buns") | productName.equals("Rolls")
				| productName.equals("Bread") | productName.equals("Hamburger")
				| productName.equals("French") | productName.equals("Italian")
				| productName.equals("Wheat") | productName.equals("White")) {
			category = "Bread";
		} else if (productName.equals("Biscuits")) {
			category = "Baked Goods";
		} else if (productName.equals("Budweiser")
				| productName.equals("Bud Light")
				| productName.equals("Shock Top")
				| productName.equals("Blue Moon")) {
			category = "Beer";
		} else if (productName.equals("Croissants")
				| productName.equals("Cakes") | productName.equals("Donuts")) {
			category = "Bakery";
		} else if (productName.equals("Deli")) {
			category = "Deli";
		} else if (productName.equals("Auntie May")
				| productName.equals("Cranberry Syrup")
				| productName.equals("Syrup")) {
			category = "Syrup";
		} else if (productName.equals("Peanut Butter")
				| productName.equals("Jif") | productName.equals("Skippy")
				| productName.equals("Peter Pan")
				| productName.equals("Skippy")) {
			category = "Peanut Butter";
		} else if (productName.equals("Cereals")
				| productName.equals("Apple Jacks")
				| productName.equals("Frosted Flakes")
				| productName.equals("Bran Flakes")
				| productName.equals("Cap'n Crunch")
				| productName.equals("Cheerios") | productName.equals("Chex")
				| productName.equals("Cinnamon Toast Crunch")) {
			category = "Cereals";
		} else if (productName.equals("Coffee") | productName.equals("Tea")
				| productName.equals("Ground Coffee")) {
			category = "Coffee/Tea";
		} else if (productName.equals("Crystal Light")
				| productName.equals("Lipton Tea")
				| productName.equals("Gatorade")
				| productName.equals("Nestle " + "Nesquik")
				| productName.equals("Powerade")
				| productName.equals("Powerade")) {
			category = "Powdered Drinks";
		} else if (productName.equals("Basil") | productName.equals("Spices")
				| productName.equals("Extract") | productName.equals("Chives")
				| productName.equals("Mint") | productName.equals("Dill")
				| productName.equals("Oregano") | productName.equals("Parsley")
				| productName.equals("Rosemary") | productName.equals("Sage")
				| productName.equals("Thyme")) {
			category = "Spices/Extract";
		} else if (productName.equals("Cake Mix")
				| productName.equals("Brownie Mix")
				| productName.equals("Pancake Mix")
				| productName.equals("Flour")) {
			category = "Cake Mix";
		} else if (productName.equals("Sugar")) {
			category = "Sugar";
		} else if (productName.equals("Soup") | productName.equals("Tomato Soup")) {
			category = "Soup";
		} else if (productName.equals("Pickles") | productName.equals("Olives")) {
			category = "Pickles/Olives";
		} else if (productName.equals("Asparagus")
				| productName.equals("Carrots") | productName.equals("Corn")
				| productName.equals("Greenbeans") | productName.equals("Peas")
				| productName.equals("Potatoes")
				| productName.equals("Tomatoes")) {
			category = "Canned Veggies";

		} else if (productName.equals("Pasta")) {
			category = "Pasta";
		} else if (productName.equals("Spaghetti")
				| productName.equals("Sauce")) {
			category = "Spaghetti/Sauces";
		} else if (productName.equals("Baked Beans")
				| productName.equals("Butter Beans")
				| productName.equals("Kidney Beans")
				| productName.equals("Pinto Beans")
				| productName.equals("String Beans")) {
			category = "Rice/Dry Beans";
		} else if (productName.equals("Cookies")
				| productName.equals("Sugar Cookies")
				| productName.equals("Chocolate Chip Cookies")
				| productName.equals("Cookie Dough")) {
			category = "Cookies";
		} else if (productName.equals("Bathroom Tissue")
				| productName.equals("Toilet Paper")
				| productName.equals("Bathroom Cleaners")) {
			category = "Bathroom Tissue";
		} else if (productName.equals("Paper Towels")
				| productName.equals("Garbage Bags")) {
			category = "Paper Towels";
		} else if (productName.equals("Candy") | productName.equals("Cookies")
				| productName.equals("Crackers") | productName.equals("Nuts")
				| productName.equals("Popcorn")
				| productName.equals("Potato Chips")
				| productName.equals("Pretzels")
				| productName.equals("Raisins")) {
			category = "Snacks";
		} else if (productName.equals("Generic Brand")
				| productName.equals("Coca-Cola") | productName.equals("Pepsi")) {
			category = "Cola";
		} else if (productName.equals("Chips")
				| productName.equals("Lays Chips")
				| productName.equals("Doritos")) {
			category = "Potato Chips";
		} else if (productName.equals("Pet Food")) {
			category = "Pet Food";
		} else if (productName.equals("Charcoal")) {
			category = "Charcoal";
		} else if (productName.equals("Candles")) {
			category = "Candles";
		} else if (productName.equals("Laundry Detergent")) {
			category = "Laundry Detergent";
		} else if (productName.equals("Dishwashing Soap")
				| productName.equals("Sponges")) {
			category = "Dishwashing Detergent";
		} else if (productName.equals("Antiacid")
				| productName.equals("Bandaids")
				| productName.equals("Cough Drops")
				| productName.equals("First Aid Cream")
				| productName.equals("Hydrogen Peroxide")
				| productName.equals("Pain-Reliever")
				| productName.equals("Rubbing Alcohol")) {
			category = "Medicines";
		} else if (productName.equals("Baby Products")
				| productName.equals("Bottles")) {
			category = "Baby Products";
		} else if (productName.equals("Deodorant")) {
			category = "Deodorant";
		} else if (productName.equals("Shampoo")
				| productName.equals("Conditioner")) {
			category = "Hair Care";
		} else if (productName.equals("Bar Soap") | productName.equals("Soap")
				| productName.equals("Body Lotion")) {
			category = "Bar Soap";
		} else if (productName.equals("Cards")) {
			category = "Cards";
		} else if (productName.equals("Bottled Water")
				| productName.equals("Sparkling Water")) {
			category = "Water";
		} else if (productName.equals("Boursin") | productName.equals("Brie")
				| productName.equals("Cheese") | productName.equals("Shredded")
				| productName.equals("Mozarella")
				| productName.equals("Cottage Cheese")
				| productName.equals("Cream Cheese")) {
			category = "Cheese";
		} else if (productName.equals("Milk")
				| productName.equals("2 Percent Milk")
				| productName.equals("Skim Milk")
				| productName.equals("Soy Milk")) {
			category = "Milk";
		} else if (productName.equals("Breakfast Sausage")
				| productName.equals("Waffles")) {
			category = "Frozen Breakfast";
		} else if (productName.equals("Chicken Nuggets")
				| productName.equals("Chicken Breasts")
				| productName.equals("Chicken Tenderloins")
				| productName.equals("Ground Beef")
				| productName.equals("Ground Turkey")) {
			category = "Frozen Meats";
		} else if (productName.equals("Orange Juice")
				| productName.equals("Juice")
				| productName.equals("Apple Juice")) {
			category = "Frozen Juices";
		} else if (productName.equals("Bacon")) {
			category = "Bacon";
		} else if (productName.equals("Premium Ice Cream")
				| productName.equals("Simple Ice Cream")
				| productName.equals("Ice Cream")) {
			category = "Ice Cream";
		} else if (productName.equals("Frozen Dessert")
				| productName.equals("Pie") | productName.equals("Ice Cream")) {
			category = "Frozen Dessert";
		} else if (productName.equals("Flounder")
				| productName.equals("Mahi Mahi")
				| productName.equals("Tilapia")) {
			category = "Frozen Seafood";
		} else if (productName.equals("French Fries")
				| productName.equals("Frozen Potatoes")) {
			category = "Frozen Potatoes";
		} else if (productName.equals("Novelties")
				| productName.equals("Paper") | productName.equals("Pencils")
				| productName.equals("Notebook")) {
			category = "Novelties";
		} else if (productName.equals("Hamburger Helper")) {
			category = "Frozen Dinners";
		} else if (productName.equals("Frozen Veggies")) {
			category = "Frozen Veggies";
		} else if (productName.equals("Frozen Entrees")
				| productName.equals("Hot Pockets")
				| productName.equals("Lean Cuisine")) {
			category = "Frozen Entrees";
		} else if (productName.equals("Frozen Food")) {
			category = "Frozen Food";
		} else if (productName.equals("Frozen Pizza")) {
			category = "Frozen Pizza";
		} else if (productName.equals("Apples")
				| productName.equals("Avocados")
				| productName.equals("Bananas") | productName.equals("Berries")
				| productName.equals("Cherries")
				| productName.equals("Grapefruit")
				| productName.equals("Grapes") | productName.equals("Kiwis")
				| productName.equals("Lemons/Limes")
				| productName.equals("Melon") | productName.equals("Oranges")
				| productName.equals("Peaches")) {
			category = "Fruits";
		} else if (productName.equals("Beef") | productName.equals("Chicken")
				| productName.equals("Fish") | productName.equals("Pork")) {
			category = "Meats";
		} else if (productName.equals("Seafood")) {
			category = "Seafood";
		}
		return category;
	}

	public static int loadAislesFromProductName(String productName) {
		String categoryName = getCategory(productName);
		int aisle = 0;
		if (categoryName.equals("")) {

		} else if (categoryName.equals("Wine")) {
			aisle = 1;
		} else if (categoryName.equals("Bread")) {
			aisle = 1;
		} else if (categoryName.equals("Baked Goods")) {
			aisle = 1;
		} else if (categoryName.equals("Beer")) {
			aisle = 1;
		} else if (categoryName.equals("Bakery")) {
			aisle = 1;
		} else if (categoryName.equals("Deli")) {
			aisle = 1;
		} else if (categoryName.equals("Syrup")) {
			aisle = 2;
		} else if (categoryName.equals("Peanut Butter")) {
			aisle = 2;
		} else if (categoryName.equals("Cereals")) {
			aisle = 2;
		} else if (categoryName.equals("Coffee/Tea")) {
			aisle = 2;
		} else if (categoryName.equals("Powdered Drinks")) {
			aisle = 2;
		} else if (categoryName.equals("Spices/Extract")) {
			aisle = 3;
		} else if (categoryName.equals("Cake Mix")) {
			aisle = 3;
		} else if (categoryName.equals("Sugar")) {
			aisle = 3;
		} else if (categoryName.equals("Soup")) {
			aisle = 3;
		} else if (categoryName.equals("Pickles/Olives")) {
			aisle = 3;
		} else if (categoryName.equals("Canned Veggies")) {
			aisle = 4;
		} else if (categoryName.equals("Pasta")) {
			aisle = 4;
		} else if (categoryName.equals("Spaghetti/Sauces")) {
			aisle = 4;
		} else if (categoryName.equals("Rice/Dry Beans")) {
			aisle = 4;
		} else if (categoryName.equals("Cookies")) {
			aisle = 4;
		} else if (categoryName.equals("Bathroom Tissue")) {
			aisle = 5;
		} else if (categoryName.equals("Paper Towels")) {
			aisle = 5;
		} else if (categoryName.equals("Snacks")) {
			aisle = 5;
		} else if (categoryName.equals("Cola")) {
			aisle = 5;
		} else if (categoryName.equals("Potato Chips")) {
			aisle = 5;
		} else if (categoryName.equals("Pet Food")) {
			aisle = 6;
		} else if (categoryName.equals("Charcoal")) {
			aisle = 6;
		} else if (categoryName.equals("Candles")) {
			aisle = 6;
		} else if (categoryName.equals("Laundry Detergent")) {
			aisle = 6;
		} else if (categoryName.equals("Dishwashing Detergent")) {
			aisle = 6;
		} else if (categoryName.equals("Medicines")) {
			aisle = 7;
		} else if (categoryName.equals("Baby Products")) {
			aisle = 7;
		} else if (categoryName.equals("Deodorant")) {
			aisle = 7;
		} else if (categoryName.equals("Hair Care")) {
			aisle = 7;
		} else if (categoryName.equals("Bar Soap")) {
			aisle = 7;
		} else if (categoryName.equals("Cards")) {
			aisle = 8;
		} else if (categoryName.equals("Water")) {
			aisle = 8;
		} else if (categoryName.equals("Cheese")) {
			aisle = 8;
		} else if (categoryName.equals("Milk")) {
			aisle = 8;
		} else if (categoryName.equals("Vitamins")) {
			aisle = 8;
		} else if (categoryName.equals("Frozen Breakfast")) {
			aisle = 9;
		} else if (categoryName.equals("Frozen Meats")) {
			aisle = 9;
		} else if (categoryName.equals("Frozen Juices")) {
			aisle = 9;
		} else if (categoryName.equals("Bacon")) {
			aisle = 9;
		} else if (categoryName.equals("Ice Cream")) {
			aisle = 10;
		} else if (categoryName.equals("Frozen Dessert")) {
			aisle = 10;
		} else if (categoryName.equals("Frozen Seafood")) {
			aisle = 10;
		} else if (categoryName.equals("Frozen Potatoes")) {
			aisle = 10;
		} else if (categoryName.equals("Novelties")) {
			aisle = 11;
		} else if (categoryName.equals("Frozen Dinners")) {
			aisle = 11;
		} else if (categoryName.equals("Frozen Veggies")) {
			aisle = 11;
		} else if (categoryName.equals("Frozen Entrees")) {
			aisle = 11;
		} else if (categoryName.equals("Frozen Food")) {
			aisle = 11;
		} else if (categoryName.equals("Frozen Pizza")) {
			aisle = 12;
		} else if (categoryName.equals("Fruits")) {
			aisle = 14;
		} else if (categoryName.equals("Produce")) {
			aisle = 14;
		} else if (categoryName.equals("Meats")) {
			aisle = 13;
		} else if (categoryName.equals("Seafood")) {
			aisle = 13;
		}
		return aisle;
	}
	
	public static ArrayList<String> loadItemsFromList () {
		//return db.loadItemsFromList(listName);
		return currProductList;
		
	}
	
}
