package com.spring.jee;

public class LoginService {
	public boolean validateUser(String user, String password) {
		System.out.println("LoginService.validateUser");
		return user.equalsIgnoreCase("cturner1") && password.equals("Globalbooklet11540");
	}

}