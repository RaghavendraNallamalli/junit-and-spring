package com.springrest.assignment;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean checkdata(String username,String password) {
		if(username.equals("raghavendra")&password.equals("kamal")) {	
			return true;
		}
		else if(username.equals("pawan")&password.equals("kalyan")) 
			return true;
			return false;
		
}
}
