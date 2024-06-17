package test01.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hpractice10june {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15 pro max");
		driver.findElement(By.id("nav-search-submit-button")).click();
		 List<WebElement> AllPriceElement = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	for(WebElement price:AllPriceElement) {
		System.out.println(price.getText());
		
	}
	
	
	}

}
