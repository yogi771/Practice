package CaptureScreenShot;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class takeScreenShot {

	public static void main(String[] args) throws IOException {
		LocalDateTime idt = LocalDateTime.now();
		String time =idt.toString().replace(":", "-");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot ts = driver;
	File screenshot =	ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\DELL\\eclipse-workspace\\selenium\\screenshots\\img"+time+".png");
    FileHandler.copy(screenshot, destination); 
    //driver.close();
    //TC PASS

	}

}
