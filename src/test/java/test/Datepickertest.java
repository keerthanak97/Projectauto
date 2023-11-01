package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Datepicker;

public class Datepickertest {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		
		
	}
	@BeforeMethod
	public void urlrloading()
	{
		driver.get("https://www.ixigo.com/flights");
	}
	@Test
	public void testlogin() throws Throwable 
	{
		
		Datepicker ob = new Datepicker(driver);
		ob.slct();
		
		
	}
}
