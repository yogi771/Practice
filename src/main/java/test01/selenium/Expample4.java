package test01.selenium;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Expample4 {

	WebDriver driver;
	public static void main(String[] args) {
		
	}
	@Test
    public void switBrowser() {
    	driver = new ChromeDriver();
    	driver.get("https://practice.automationtesting.in/");
    	
    	//navigate to youtube link
    	driver.findElement(By.xpath("//*[@id=\"themify-social-links-2\"]/ul/li[4]/a")).click();
    	
    	// will get ids for tabs
    	Set<String> windowsId = driver.getWindowHandles();
    	
    	Iterator<String> itr = windowsId.iterator();
    	String parentId = itr.next();
    	String childId = itr.next();
    	
    	//switch to child window
    	driver.switchTo().window(childId);
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	//close child window
    	driver.close();
    	//switch to parent window
    	driver.switchTo().window(parentId);
    	//perform action
    	driver.findElement(By.xpath("//*[@id=\'mc4wp-form-1\']/div[1]/p[1]/input")).sendKeys("YogiAnna");
    	
    }
}
//switch browser code run successful