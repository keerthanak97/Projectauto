package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	WebDriver driver;
	 By drop = By.xpath("//*[@id=\"content\"]/div/header/div/div[1]/span[2]/nav/span[6]/a/span");
	 By elemnt = By.xpath("//*[@id=\"content\"]/div/header/div/div[1]/span[2]/div/div/div[1]/span/a/span");
	 
	 public Dropdown(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 public void click() 
	 {
		 driver.findElement(drop).click();
		 driver.findElement(elemnt).click();
		 
	 }
	 public void dpdown()
	 {
		 WebElement down = driver.findElement(drop);
		 Select M = new Select(down);
		 M.selectByVisibleText("More");
		 
		 List<WebElement>li1=M.getOptions();
		 System.out.println(li1.size());
	 }

}
