package page;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Screenshotsingle {

	WebDriver driver;
	
	By scrnsht = By.xpath("//*[@id=\"content\"]/div/header/div/div[1]/span[2]/nav/span[3]/a/span/img");
	
	public Screenshotsingle (WebDriver driver)
	{
		this.driver=driver;
	}
	public void image() throws Exception
	{
		driver.manage().window().maximize();
		WebElement dayelement=driver.findElement(scrnsht);
		File src1=dayelement.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("./Screenshot//Elementscreenshot1.png"));
	}
}
