package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Datepicker {
	WebDriver driver;
	By returnf = By.xpath("//*[@id=\"content\"]/div/div[1]/div[5]/div/div/div[4]/div/div[2]/div/span");
	By arrow = By.xpath("/html/body/div[4]/div[2]/div[2]/button");
	By date =By.xpath("/html/body/div[4]/div[2]/div[2]/table/tbody/tr[1]/td[5]/div[1]");
	
	public 	Datepicker(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void slct() throws Throwable
	{
		Thread.sleep(30);
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(returnf).click();
		driver.findElement(arrow).click();
		driver.findElement(date).click();
	}

}
