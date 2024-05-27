package test01.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example15 { // widget > data picker

WebDriver driver;
String month = "January";
String year = "2071";
    @Test
    public void calenderDatePick()  {
    	
    	driver = new ChromeDriver();
    	driver.get("https://demoqa.com/");
    	driver.manage().window().maximize();
    	
    	JavascriptExecutor JS = (JavascriptExecutor) driver;
    	JS.executeScript("window.scrollBy(0,400)");
    	
    	driver.findElement(By.xpath("//*[@id=\'app\']/div/div/div[2]/div/div[4]/div/div[3]")).click();
    	
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	//Actions action = new Actions(driver);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,500)");
    	
    	WebElement element = driver.findElement(By.xpath("//*[@id=\"item-2\"]/span"));
    	JavascriptExecutor executor = (JavascriptExecutor) driver;
    	executor.executeScript("arguments[0].click();", element);
    	
    //	action.moveToElement(element).perform();
    	
    	driver.findElement(By.xpath("//*[@id=\'datePickerMonthYearInput\']"));
    WebElement matchYear = driver.findElement(By.xpath("//*[@class='react-datepicker__year-select']"));
    while(true) {	
    if(matchYear.getText().equals(year)) {
    		
    		break;
    	}else {
    		driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
    				
    	}}
    
    
    
    }

}
