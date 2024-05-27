package test01.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example7 {
	

	WebDriver driver;
	String month = "11 Apr";
	String year = "2024";
	public static void main(String[] args) {
		
	}
	
	
	@Test
    public void switBrowser() {
    	driver = new ChromeDriver();
    	driver.get("https://www.redbus.in/");
    	
    	driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div")).click();
    	
    	
    	
    	
    	
    	
}}
