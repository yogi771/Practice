package test01.selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example10 {
WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Test 
	public void webTablet() {
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		// thread sleep
		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			 
		
	//for ELEMENT > Web table
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"item-3\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"addNewRecordButton\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Yogiraj");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("jawale");
		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("jawale@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"age\"]")).sendKeys("29");
		driver.findElement(By.xpath("//*[@id=\"salary\"]")).sendKeys("700000");
		driver.findElement(By.xpath("//*[@id=\"department\"]")).sendKeys("IT");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"searchBox\"]")).sendKeys("Yogiraj");
		driver.findElement(By.xpath("//*[@id=\"basic-addon2\"]/span")).click();
	}}
