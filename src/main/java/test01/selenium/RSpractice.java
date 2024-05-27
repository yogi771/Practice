package test01.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RSpractice {// successfully navigated in page and perform actions in page                            



public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 driver.get("https://rahulshettyacademy.com/locatorspractice/");
	 
	 driver.findElement(By.id("inputUsername")).sendKeys("Yogi");
	 driver.findElement(By.name("inputPassword")).sendKeys("Password");
	 driver.findElement(By.className("signInBtn")).click();
	 System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	 driver.findElement(By.linkText("Forgot your password?")).click();
	driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("Yogi");
	driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("yogi@gmail.com");
	driver.findElement(By.xpath("//form/input[3]")).sendKeys("8552814361");
	driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
	System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
	 
	 driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
	 driver.findElement(By.id("inputUsername")).sendKeys("Yogi");
	 driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	 driver.findElement(By.id("chkboxOne")).click();
	 driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
} 
	 


}
