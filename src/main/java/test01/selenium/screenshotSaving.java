package test01.selenium;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshotSaving {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement img = driver.findElement(By.xpath("//span[@class='nav-line-2']"));
		//code for saving image
		TakesScreenshot ts = (TakesScreenshot)driver;  
	File scr=	ts.getScreenshotAs(OutputType.FILE);
	//LocalDateTime ldt = LocalDateTime.now();
	File dest = new File(".\\screenshots\\image10.png");
	FileHandler.copy(scr, dest);
		//code for adding time in name of image
	
	//driver.close();
	}

}
