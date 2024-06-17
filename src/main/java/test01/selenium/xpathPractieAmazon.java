package test01.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathPractieAmazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//select[@id='searchDropdownBox']/option[text()='Books']")).click();
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("About Us")).click();
		System.out.println("TC PASS");
//driver.close();
	}

}
