package mouse_actions;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.zomato.com/");

		WebElement privacy = driver.findElement(By.linkText("Privacy"));
		
		Actions act = new Actions(driver);
		
		act.scrollByAmount(0, 500).build().perform();
		
		Thread.sleep(1000);
		act.scrollToElement(privacy).build().perform();	
		Thread.sleep(5000);
		driver.close();
	}
}
