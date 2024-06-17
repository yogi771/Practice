package test01.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assesment02 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15 pro max");
		driver.findElement(By.id("nav-search-submit-button")).click();

		
    //driver.findElement(By.xpath("//span[contains(text(),'(256 GB) - Natural')]/../../../..//button[text()='Add to cart']")).click(); driver.findElement(By.xpath("//span[contains(text(),'(256 GB) - Natural')]/../../../..//button[text()='Add to cart']")).click();
     driver.findElement(By.xpath("//span[contains(text(),'(256 GB) - Natural')]/../../../..//button")).click();
  
 // driver.findElement(By.id("nav-cart-count-container")).click();
		// (//span[text()='iPhone 15 Pro Max (256 GB) - Black Titanium']/../../../..
String price =	driver.findElement(By.xpath("//span[contains(text(),'(256 GB) - Natural')]/../../../..//span[@class='a-price-whole']")).getText();
    //span[contains(text(),'Apple iPhone 15 Pro Max (256 GB) - Natural Titanium')]
    //  Apple iPhone 15 Pro Max (256 GB) - Natural Titanium
System.out.println(price);
	}

}
