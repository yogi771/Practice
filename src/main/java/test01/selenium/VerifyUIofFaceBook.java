package test01.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Rectangle;

public class VerifyUIofFaceBook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement	emailTextBox=	driver.findElement(By.id("email"));
		WebElement passwordTextBox = driver.findElement(By.id("pass"));
		Rectangle email =emailTextBox.getRect();
		Rectangle password = passwordTextBox.getRect();
		System.out.println(email.getHeight()+"  "+password.getHeight());
		System.out.println(email.getWidth()+"  "+password.getWidth());
		System.out.println(email.getX()+"  "+password.getX());
		System.out.println(email.getY()+"  "+password.getY());
		System.out.println("gap :"+(password.getY()- (email.getY() + email.getHeight())));
		
		
	
	
	}

}
