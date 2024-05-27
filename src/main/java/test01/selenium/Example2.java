package test01.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Example2 {

	
WebDriver driver;
	
	@Test 
	public void enterDataInTextField() {
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		
		
		WebElement year = driver.findElement(By.xpath("//*[@id=\'dateOfBirth\']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
		Select select = new Select(year);
		select.selectByValue("2025");

		
		WebElement month = driver.findElement(By.xpath("//*[@id=\'dateOfBirth\']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
	 select = new Select(month);
		select.selectByValue("4");
		
		// WebElement day = driver.findElement(By.xpath("//*[@id=\\'dateOfBirth\\']/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[3]")).click();
	//  select = new Select(day);
	  //  select.selectByValue("");
	    
		
	}
}
