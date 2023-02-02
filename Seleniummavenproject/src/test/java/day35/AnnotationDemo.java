package day35;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class AnnotationDemo {
	@BeforeMethod
	
	void Login()
	{
		System.out.println("Login");
		
	}
	@Test
	void search()
	{
		
		System.out.println("search");
	}
	@AfterMethod
	void logout()
	{
		
		System.out.println("Logout");	
	}



}
