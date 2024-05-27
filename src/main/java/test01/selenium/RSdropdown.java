package test01.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RSdropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdowm = new Select(staticDropdown); //if web element starts with select then it is static and can use index
		dropdowm.selectByIndex(3);
		 System.out.println(dropdowm.getFirstSelectedOption().getText());
		 dropdowm.selectByVisibleText("AED");
		 dropdowm.selectByValue("INR");
		
	}

}
