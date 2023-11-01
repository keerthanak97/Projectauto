package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Bookingregister {
	WebDriver driver;
	By signin = By.xpath("//*[@id=\"content\"]/div/header/div/div[2]/div/span/span/span");
	By email =By.xpath("//*[@id=\"content\"]/div/div[8]/div/div/div[2]/div[2]/div/div[2]/div[1]/span/div[2]/span[1]");
	By emailadd = By.xpath("//*[@id=\"content\"]/div/div[8]/div/div/div[2]/div[2]/div/div[2]/div[2]/span[2]/input");
	By logn=By.xpath("//*[@id=\"content\"]/div/div[8]/div/div/div[2]/div[2]/div/div[2]/div[3]/button/div");
	public Bookingregister(WebDriver driver)
	{
		this.driver=driver;
	}
	public void signup()
	{
		driver.findElement(signin).click();
		driver.findElement(email).click();
	}
	public void setvalues(String emil )
	{
		driver.findElement(emailadd).sendKeys(emil);
		
	}
	public void register()
	{
		driver.findElement(logn).click();
	}

}
