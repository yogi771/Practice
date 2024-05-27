package test01.selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class RSautoSuggest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		
		
	List<WebElement> options= driver.findElements(By.cssSelector("ul[id='ui-id-1'] a"));

	
for(WebElement option : options ) {
	if(option.getText().equals("India")) 
	{
		
		option.click();
		break;
	}
	
}
		
		
		
	}

	
}
