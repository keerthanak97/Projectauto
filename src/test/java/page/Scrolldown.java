package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Scrolldown {
	WebDriver driver;
	By clck=By.xpath("//*[@id=\"content\"]/div/footer/div[1]/div[2]/ul[1]/li[1]/div/div[2]/div/p/a");
	
	public Scrolldown(WebDriver driver)
	{
		this.driver=driver;
	}
	public void scroll()
	{
		driver.findElement(clck).click();
	}

}
