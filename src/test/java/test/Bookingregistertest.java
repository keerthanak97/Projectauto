package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Bookingregister;

public class Bookingregistertest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		//driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.ixigo.com/flights");
		
	}
	@Test
	public void passvalues()
	{
		Bookingregister ob = new Bookingregister(driver);
		ob.signup();
		ob.setvalues("abc123@gmail.com");
		ob.register();
	}

}
