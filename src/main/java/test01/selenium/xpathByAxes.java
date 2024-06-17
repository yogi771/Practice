package test01.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class xpathByAxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("file:///C:/Users/DELL/Desktop/parentchild.html");
	  String text = driver.findElement(By.xpath("//div[@class='Mammals']/following-sibling::div[@class='Others']")).getText();
     System.out.println(text);
     driver.close();
	}

}
