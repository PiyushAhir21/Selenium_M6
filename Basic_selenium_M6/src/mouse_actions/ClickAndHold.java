package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		
		driver.findElement(By.id("password")).sendKeys("M6-SeleniumOverSmartBatch");
		
//		. defines className
		WebElement eye = driver.findElement(By.cssSelector("div.showPassword.shownhide"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(eye).release().build().perform();
		
		Thread.sleep(3000);
		act.release().build().perform();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
