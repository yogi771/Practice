package test01.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RScheckbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.findElement(By.cssSelector("input[id*='_IndArm']")).click();
	Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='_IndArm']")).isSelected());
//	System.out.println();
	
	}

}
