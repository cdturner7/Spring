package com.jee;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("cturner1") && password.equals("Globalbooklet11540");
	}

}