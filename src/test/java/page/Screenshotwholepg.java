package page;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotwholepg {
	
	WebDriver driver;
	
	public Screenshotwholepg(WebDriver driver)
	{
		this.driver=driver;
	}
	public void screen() throws Exception
	{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("./Screenshot//ixigo.png"));
		

	}

}
