package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class OrangeHrmLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//to launch browser
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.youtube.com");
		
	}

}
