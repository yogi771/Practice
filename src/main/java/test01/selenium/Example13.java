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
public class Example13 {

	
WebDriver driver;
	
	
	@Test 
	public void downloadUpload() {
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	
			 
		
	//for ELEMENT > Links
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]")).click();
		//driver.findElement(By.xpath("//div[contains(text(), 'Elements')]")).click();
		JavascriptExecutor ns = (JavascriptExecutor) driver;
		ns.executeScript("window.scrollBy(0,800)");
		driver.findElement(By.xpath("//*[@id=\"item-7\"]")).click();	
		JavascriptExecutor vs = (JavascriptExecutor) driver;
		vs.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//*[@id=\"downloadButton\"]")).click();
		
		// thread sleep
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		 
//	driver.findElement(By.id("uploadFile").sendKeys(System.getproperty("C:/Users/DELL/Desktop/testAutomation.txt") \\chromedriver.exe");
	
	 // String filePath = "C:/Users/DELL/Desktop/testAutomation.txt";

      // Enter the file path into the file input element
    // sendKeys(System.getProperty("C:/Users/DELL/Desktop/testAutomation.txt"));
	
     

	
	
	
}


	private void sendKeys(String property) {
		// TODO Auto-generated method stub
		driver.close();	}}
