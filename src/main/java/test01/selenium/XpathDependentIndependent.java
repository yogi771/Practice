package test01.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDependentIndependent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/desktops");
Thread.sleep(2000);
driver.findElement(By.xpath("//a[text()='Build your own computer']/../..//input[@value='Add to cart']")).click();

	}

}
