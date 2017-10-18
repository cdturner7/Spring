package com.spring.services;

import org.springframework.stereotype.Service;

@Service
public class LoginService 
{
	public boolean validateUser(String user, String password) 
	{
		return user.equalsIgnoreCase("cturner1") && password.equals("Globalbooklet11540");
	}

}