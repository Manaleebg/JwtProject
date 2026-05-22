package com.Authentication.JwtProject.DTO;

public class Authrequest {
	   private String email;
	   private String password;
	
	public Authrequest() {}
	public Authrequest (String e,String p) {
		this.email=e;
		this.password=p;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
