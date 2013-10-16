package com.baggers.bagboy;

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
}
