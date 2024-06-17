package test01.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RSpractice2 {// successfull login to url

	@Test
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 driver.get("https://rahulshettyacademy.com/locatorspractice/");
	 driver.findElement(By.id("inputUsername")).sendKeys("Yogi");
	 driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	 driver.findElement(By.id("chkboxOne")).click();
	 driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();

		Thread.sleep(1000);
	
	System.out.println(driver.findElement(By.tagName("p")).getText()); 
	Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	}

}
