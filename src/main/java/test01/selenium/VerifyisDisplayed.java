package test01.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyisDisplayed {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shaadi.com");
WebElement	dis =	driver.findElement(By.xpath("//img[@alt=\"Matrimony Service by Shaadi.com\"]"));
	System.out.println(dis.isDisplayed());

	}

}
