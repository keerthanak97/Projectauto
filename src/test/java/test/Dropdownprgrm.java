package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import page.Dropdown;

public class Dropdownprgrm {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		
		
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.ixigo.com/flights");
		
	}
	public void drpdwn()
	{
		Dropdown ob = new Dropdown(driver);
		ob.click();
		ob.dpdown();
	}

}
