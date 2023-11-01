package test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Screenshotsingle;

public class Screenshotsingleelement {
	WebDriver driver;
	@BeforeTest
	public void set() {
		driver = new ChromeDriver();
	    driver.get("https://www.ixigo.com/flights");
	}
	

	@Test
	public void scrnsht() throws Exception {
		
		Screenshotsingle ob = new Screenshotsingle(driver);
		ob.image();
		
}
}