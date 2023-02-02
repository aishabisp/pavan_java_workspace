package day35;


import org.testng.Assert;
import org.testng.annotations.*;


public class HardAssertions {
	
	@Test
	void Test()
	{
		/*int x=10;
		int y=20;
		Assert.assertEquals(x,y);
		*/
		int a=10;
		int b=20;
		Assert.assertEquals(a>b,true,"a is not greater than b");
	}

}
