package test01.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Rectangle;

public class SizeAndPosition {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement img = driver.findElement(By.xpath("//span[@class='nav-line-2']"));
		Rectangle rectangle = img.getRect();
		System.out.println("Height : "+rectangle.getHeight());
		System.out.println("Width : "+rectangle.getWidth());
		System.out.println("x coordinate :"+rectangle.getX());
		System.out.println("y coordinate :"+rectangle.getY());
		
	}

}
