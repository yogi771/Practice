package test01.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyisEnabled {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement enb = driver.findElement(By.xpath("//b[text()=\"Become a Subscriber\"]/../../..//input"));
		System.out.println(enb.isEnabled());
WebElement 	enb2	=driver.findElement(By.id("navbar-search-input"));
		System.out.println(enb2.isEnabled());
	
	}

}
