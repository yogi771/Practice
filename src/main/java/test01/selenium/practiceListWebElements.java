package test01.selenium;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceListWebElements {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://demowebshop.tricentis.com/");
	List<WebElement> list= 	driver.findElements(By.xpath("//h3[text()='Information']/..//li"));
	for(WebElement list1 : list) {
		System.out.println(list1.getText());
	//list1.click(); // error "stale element not found" observed at this line
	//	driver.navigate().back();
	}
		

	}

}
