package test01.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class netflixGetStartedButton {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.netflix.com/in/");
		driver.findElement(By.xpath("//h1/..//input")).sendKeys("annachimbori@gmail.com");
		driver.findElement(By.xpath("//h1/..//button[@role='button']"));
		//h1/..//input
	}

}
