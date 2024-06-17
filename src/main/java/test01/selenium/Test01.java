package test01.selenium;

import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test01 {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		 
		
	
		String windowId = driver.getWindowHandle();
		 Thread.sleep(2000);
		driver.navigate().to("https://demoqa.com/");
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.getWindowHandle();
		 Thread.sleep(2000);
		//below line will let you launch new window of the same browser
		driver.switchTo().newWindow(WindowType.TAB);
			driver.get("https://www.flipkart.com/");
			
			//capture all the handles by using getWindowHandles();
			Set<String> allWindow= driver.getWindowHandles();
			for(String windowId1:allWindow) {
				if(!driver.getTitle().equals("DEMOQA")) {
					String title =	driver.getTitle();
					 System.out.println("closed"+title);
					
				}
			}

	}

}
