package test01.selenium;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class RSpractice71 { //

	public static void main(String[] args) {
		int j = 0;
		String[] itemsNeeded = { "Cucumber", "Brocolli","Beetroot"};
		WebDriver driver = new ChromeDriver();
		WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(5));
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		addItems(driver,itemsNeeded);

		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promobtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	    
	} 
	
	
	public static void addItems(WebDriver driver,String[] itemsNeeded) {
		int j=0;
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < product.size(); i++) {
			String[] name = product.get(i).getText().split("-");
			String formatedName = name[0].trim();

			List addItemsList = Arrays.asList(itemsNeeded);

			if (addItemsList.contains(formatedName)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;
				if (j == 3) {
					break;
				} 
			}
		}
		
		
	}

}
