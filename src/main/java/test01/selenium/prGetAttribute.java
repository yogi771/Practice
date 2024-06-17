package test01.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prGetAttribute {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	
	WebElement src =	driver.findElement(By.xpath("//input[@type='text']"));
						src.sendKeys("Yogiraj");
		String value = src.getAttribute("value");
System.out.println(value);		
		
		
		/*
	// code for get attribute working fine	
		WebElement src = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		String value = src.getAttribute("alt");
		System.out.println(value);
	
	*/
	}

}
