package test01.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RSpractice3 {  // take correct string and input in desired location

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	 String CorrectPassword = getPasswod(driver);
	 driver.get("https://rahulshettyacademy.com/locatorspractice/");
	
	 driver.findElement(By.id("inputUsername")).sendKeys("Yogi");
	 driver.findElement(By.name("inputPassword")).sendKeys(CorrectPassword);
	 driver.findElement(By.className("signInBtn")).click();
	

	}
	public static String getPasswod(WebDriver driver) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 driver.findElement(By.linkText("Forgot your password?")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		 String PasswordText = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		String[] Password = PasswordText.split("'");
		String finalPassword = Password[1].split("'")[0];
		return finalPassword;
	}
}
