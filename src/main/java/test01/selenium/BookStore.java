package test01.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookStore {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("Chota");
		driver.findElement(By.id("password")).sendKeys("fqj3!i6FwiTQDtT");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath("(//li[@id='item-2'])[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("searchBox")).sendKeys("Git");
	//	driver.switchTo().
	//	driver.findElement(By.id("basic-addon2")).click();
	//	driver.findElement(By.linkText("Book Store Application")).click();
		
		//System.out.println("TC PASS");
		
		

	}

}
