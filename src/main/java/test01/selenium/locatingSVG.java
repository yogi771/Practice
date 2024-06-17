package test01.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingSVG {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15",Keys.ENTER);
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
    	JS.executeScript("window.scrollBy(0,400)");
    	
	driver.findElement(By.xpath("//span[text()='iPhone 15 Pro Max (1 TB) - White Titanium']/../../../../../../../../../../../..//span[@class='a-price-whole']"));
		
		System.out.println("coderunSuccess");
		driver.close();
		//iphone 15
	}

}
