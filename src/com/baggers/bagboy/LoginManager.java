package com.baggers.bagboy;

import java.util.HashMap;
import java.util.Map;

public class LoginManager {
	
	static String currUserEmail;
	static String currUserPassword;
	static DatabaseConnection db = new DatabaseConnection();
	static Map<String, String> registeredUsers = new HashMap<String, String>();
	//the error message to be returned
	static String error = "";
	
	//variable to say that there is a current user logged into the app
	//private static boolean loggedIn = false;
	
	public LoginManager() {

	}

	public static boolean checkLogin(String username, String password) {
		// admin log in
		if(username.equals("admin") && password.equals("thebaggers")){
			return true;
		}
		
		if (registeredUsers.containsKey(username)) {
			if (registeredUsers.get(username).equals(password)) 
				return true;
				
		}
		
	
		
		error = "Invalid email or password";
		return false;

	}

	public static boolean registerUser(String username, String password, String passwordConfirm) {
		
		//check if password and password confirm match
		if (!(password.equals(passwordConfirm))) {
			error = "Passwords do not match";
			return false;
		}
		//check if it's a valid email address
		String emailregex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,4}";
		if (!(username.matches(emailregex))) {
			error = "Invalid email address";
			return false;
		}
		//check if the password length is greater than 5
		if (password.length() < 5) {
			error = "Invalid password length (use 6 or more characters)";
			return false;
		}		
		//check to see if that user is already registered
		if (registeredUsers.containsKey(username)){
			error = "Email address already registered";
			return false;
		}
		
		//if all that is good register the user 
		registeredUsers.put(username, password);
		return true;
	
		
		//to make the compiler happy until we finish implementation
	}
	
	public static String getError() {
		return error;
	}
	

}
