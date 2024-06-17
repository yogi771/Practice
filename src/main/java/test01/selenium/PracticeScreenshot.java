package test01.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.awt.Point;
import java.io.File;
import java.io.IOException;


public class PracticeScreenshot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	WebElement logo =	driver.findElement(By.id("nav-logo"));
	org.openqa.selenium.Point loc = logo.getLocation();
	System.out.println("x coordinate :"+loc.getX());
	System.out.println("y coordinate :"+loc.getY());
	
	
	
/*	
	// size of the element in pixel 
	Dimension size = logo.getSize();
	System.out.println("Height :"+size.getHeight());
	System.out.println("Width :"+size.getWidth());
	*/
/*		
 * 
 // snippet of the getScreenshotAs method
  TakesScreenshot ts = driver;
	File ss=	logo.getScreenshotAs(OutputType.FILE);
	File destinationFile = new File(".\\screenshots\\image02.png");
    FileHandler.copy(ss, destinationFile);   
		
*/
	}

}
