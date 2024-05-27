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
public class Example12 {

WebDriver driver;
	
	
	@Test 
	public void linkTest() {
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		// thread sleep
		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			 
		
	//for ELEMENT > Links
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]")).click();
		
		JavascriptExecutor ns = (JavascriptExecutor) driver;
		ns.executeScript("window.scrollBy(0,800)");
		driver.findElement(By.xpath("//*[@id='item-5']")).click();
		JavascriptExecutor ts = (JavascriptExecutor) driver;
		ts.executeScript("window.scrollBy(0,500)");
	    driver.findElement(By.linkText("Home")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//*[@id="simpleLink"]
}}
