package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.ixigo.com/trains");
	}
	@Test
	public void mainmthd() throws IOException 
	{
		File f = new File("C://Users//HP//OneDrive//Desktop//WORKS//ixigo.xlsx/");
		FileInputStream fi = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sh = wb.getSheet("Sheet1");
		System.out.println(sh.getLastRowNum());
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			String From =sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("From:"+From);
			String To= sh.getRow(i).getCell(1).getStringCellValue();
			
			driver.findElement(By.xpath("//input[@placeholder='Leaving from']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='Leaving from']")).sendKeys(From);
			driver.findElement(By.xpath("//input[@placeholder='Going to']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='Going to']")).sendKeys(To);
			
			driver.findElement(By.xpath("//*[@id=\"trainSearchForm\"]/div/div/div/div[5]/button/div")).click();
		}
	}


}
