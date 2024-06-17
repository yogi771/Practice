package test01.selenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RSpractice117 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();

		// capture all webelement into list

		List<WebElement> list1 = driver.findElements(By.xpath("//tr/td[1]"));
		// capture text of all web elements into new list
		List<String> originalList = list1.stream().map(list2 -> list2.getText()).collect(Collectors.toList());

		System.out.println(originalList);

		// apply sort in the list -> sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

		// compare original list vs sorted list

		Assert.assertTrue(originalList.equals(sortedList));
		System.out.println("Test case Pass");

		// scan the name column with getText -> bEANS -> PRINT the price of the rice
		List<Object> price;
		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			 price = rows.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPriceVeggie(s))
					.collect(Collectors.toList());

			price.forEach(a -> System.out.println(a));
			if (price.size() < 1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();

			}
		} while (price.size() < 1);

	}
  
	private static Object getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}
}
