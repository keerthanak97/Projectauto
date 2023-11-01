package test;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Screenshotwholepg;

public class Screenshotwholepage {
	public class ScreenshotWholepg {
		WebDriver driver;
		@BeforeTest
		public void set() {
			driver = new ChromeDriver();
		}
		@BeforeMethod
		public void urlget()
		{
			driver.get("https://www.ixigo.com/flights");
		}
		
		@Test
		public void scrnshot() throws Exception  {
			
			Screenshotwholepg ob = new Screenshotwholepg(driver);
			ob.screen();
}
	}
}
