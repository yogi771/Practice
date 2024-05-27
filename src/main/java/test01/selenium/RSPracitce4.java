package test01.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RSPracitce4 { //below code gives syntax of window navigations

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");//all components gets loaded
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");// inbuild wait is not available
		driver.navigate().back();
		driver.navigate().forward();

	}

}
