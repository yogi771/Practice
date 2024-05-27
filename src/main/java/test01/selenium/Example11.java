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
public class Example11 {

WebDriver driver;
	
	
	@Test 
	public void buttonTest() {
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		// thread sleep
		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			 
		
	//for ELEMENT > Buttons
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"item-4\"]")).click();
		JavascriptExecutor ks = (JavascriptExecutor) driver;
		ks.executeScript("window.scrollBy(0,500)");
		Actions action = new Actions(driver);
		WebElement button = driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
		action.moveToElement(button).doubleClick().build().perform();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement rightButton=driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(rightButton).contextClick().build().perform();
}}
