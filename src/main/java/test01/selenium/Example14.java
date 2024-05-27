package test01.selenium;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example14 {// for zoom in zoom out(SUCCESSFULL)
	
	WebDriver driver;
	
	@Test
	public void zoomInZoomOutInSelenium() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "/Users/DELL/Downloads/chromedriver-win64/chromedriver-win64.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		//((JavascriptExecutor) driver).executeScript("document.body.style.zoom = '40%'");
		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='40%'");
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='100%'");
		
	}

	
}
