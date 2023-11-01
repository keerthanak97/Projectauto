package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mousehoverprgrm {
	WebDriver driver;
	
	By armedfrc = By.xpath("//*[@id=\"content\"]/div/div[1]/div[5]/div/div/div[7]/div[4]");
	
	public Mousehoverprgrm(WebDriver driver)
	{
		this.driver=driver;
	}
	public void program()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement mouse = driver.findElement(armedfrc);
		
		Actions act = new Actions(driver);
		act.moveToElement(mouse).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(armedfrc));
		
		
		
	}
	
	

}
