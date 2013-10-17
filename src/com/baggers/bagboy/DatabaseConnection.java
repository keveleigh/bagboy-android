package com.baggers.bagboy;

import java.util.ArrayList;

public class DatabaseConnection {

	public DatabaseConnection() {
		
	}
	
	public boolean checkLogin(String email, String password) {
		//db code to check if the email and password are in the database
		if (email == null || password == null)
			return false;
		
		if (email.equals("test") && password.equals("test"))
			return true;
		else
			return false;
		
		//if the user is in the database return true, else return false

	}
	
	public void registerUser(String email, String password) {
		
		//put in a new user with that email and password
		
	}
	
	public boolean checkEmail(String email) {
		//check to see if that email is already in the database
		//return true if it is
		return false;
	}
	
	public void createList() {
		//db code to create a new list in the list table 
	}
	
	public void addToList(String list, String newProduct) {
		//db code to add new product the list 
	}
	
	public ArrayList<String> loadLists (String username) {
		ArrayList<String> lists = new ArrayList<String>();
		//db code to get all the list names associated with a username
		return lists;
	}
	
	public ArrayList<String> loadStores() {
		ArrayList<String> stores = new ArrayList<String>();
		//db code to get all the list names associated with a username
		return stores;
	}
}
