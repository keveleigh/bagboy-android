package com.baggers.bagboy;

public class LoginManager {
	
	private static String currUserEmail;
	private static String currUserPassword;
	private static DatabaseConnection db = new DatabaseConnection();
	
	//variable to say that there is a current user logged into the app
	private static boolean loggedIn = false;
	
	public LoginManager() {

	}

	public static boolean checkLogin(String username, String password) {
		loggedIn = db.checkLogin(username, password);
		//if the login was successful, set the current user information
		if (loggedIn) {
			currUserEmail = username;
			currUserPassword = password;
		}
		return loggedIn;

	}

	public static boolean registerUser(String username, String password, String passwordConfirm) {
		
		//check required limits on lengths of username and password
		//if those are good, call database register user 
		//check to see if that user is already registered
		if (db.checkEmail(username))
			return false;
		//if everything is good, register the user, set the current user information
		else {
			db.registerUser(username, password);
			loggedIn = true;
			currUserEmail = username;
			currUserPassword = password;
		}
		
		//to make the compiler happy until we finish implementation
		return true;
	}
	

}
