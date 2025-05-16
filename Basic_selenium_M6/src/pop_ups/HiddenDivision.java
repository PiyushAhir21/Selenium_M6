package pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
//import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class HiddenDivision {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://facebook.com/");

		WebElement un = driver.findElement(By.id("email"));

		driver.findElement(RelativeLocator.with(By.tagName("input"))
													.below(un)).sendKeys("password");
	}
}