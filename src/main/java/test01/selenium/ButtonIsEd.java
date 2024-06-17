package test01.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonIsEd {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
	WebElement maleRadiaoButton = 	driver.findElement(By.id("gender-male"));
		if(maleRadiaoButton.isSelected()) 
		{
		System.out.println("It is selected");	
		}else {
			System.out.println("we will select");
			maleRadiaoButton.click();
		}

		driver.findElement(By.partialLinkText("Log in")).click();
WebElement	rememberMe =	driver.findElement(By.id("RememberMe"));

	System.out.println(rememberMe.isSelected());	


	}

}
