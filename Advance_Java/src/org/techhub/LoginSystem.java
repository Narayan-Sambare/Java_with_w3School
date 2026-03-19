package org.techhub;

import java.io.IOException;
import java.util.*;

public class LoginSystem {
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter user name: ");
		String user= sc.nextLine();
		System.out.println("Enter password : ");
		String pass= sc.nextLine();
		
		service s=new service();
		try {
			
			if(s.checkData(user, pass))
			{
				System.out.println("user login successful");
			}
				
		}
		catch(InValidUserDetails e)
		{
			System.out.print(e.getMessage());

		}
	}
}
class user
{
	private String user="admin";
	private String pass="Admin@123";
	
	public String getUser() {	return user;	}
	public void setUser(String user) {	this.user = user;	}
	public String getPass() {	return pass;	}
	public void setPass(String pass) {	this.pass = pass;	}	
}
class service{
	repro r=new repro();
	
	public boolean checkData(String user,String pass) throws  InValidUserDetails
	{
		
		if(user == null || pass == null )
		{
			throw new InValidUserDetails("User name or password cannot be null");
		}
		
		if(user.isEmpty() || pass.isEmpty())
		{
			throw new InValidUserDetails("Empty input not be allow Please Enter any correct input");
		}
		
		if (user.equalsIgnoreCase("null") || pass.equalsIgnoreCase("null"))
		{
	        throw new InValidUserDetails("Invalid input: null");
	    }
		
		return r.isUser(user, pass);
		
	}
	
	
	
}
class repro{
	user s=new user();
	public boolean isUser(String user, String pass) throws InValidUserDetails {
		
	
		if(s.getUser().equals(user) && s.getPass().equals(pass))
		{
			return true;
		}
		throw new InValidUserDetails("user name and password not correct");
		
		
	}
}
class InValidUserDetails extends Exception{
	
	InValidUserDetails(String mass)
	{
		super(mass);
	}
}
