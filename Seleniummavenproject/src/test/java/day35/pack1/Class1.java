package day35.pack1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	@Test
	void abc()
	{
		System.out.println("this is from abc class1");
	}
	@BeforeTest
	void m()
	{
		System.out.println("Before test method");
	}
	@AfterTest
	void n()
	{
		System.out.println("After test method");
	}


}
