package test01.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class assesment01 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/Downloads/Assessment1.html");
		driver.findElement(By.xpath("//button[@onclick='openAllWindows()']")).click();
		Set<String> list = driver.getWindowHandles();
		System.out.println(list);
		
		for (String windowID : list) {
			driver.switchTo().window(windowID);
			
			String title = driver.getTitle();
			if (title.equals("BurgerKing India | Online ordering")) {
				driver.close();
				break;
			}

		}

	}

}
