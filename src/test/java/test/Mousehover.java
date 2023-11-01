package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Mousehoverprgrm;

public class Mousehover {
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
	public void urlget()
	{
		driver.get("https://www.ixigo.com/flights");
	}
	@Test
	public void test1()
	{
	
		Mousehoverprgrm ob = new Mousehoverprgrm(driver);
		ob.program();
	}

}
