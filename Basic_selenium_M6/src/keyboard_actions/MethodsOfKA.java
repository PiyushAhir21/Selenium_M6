package keyboard_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MethodsOfKA {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");
		
		WebElement password = driver.findElement(By.id("pass"));
		
		Actions act = new Actions(driver);
		act.sendKeys("abcd").build().perform();
//		act.sendKeys(password,"abcdefg").build().perform();
		
		Thread.sleep(500);

		act.keyDown(Keys.CONTROL).build().perform();
		act.sendKeys("a").build().perform();
		Thread.sleep(500);
		act.sendKeys("c").build().perform();
		act.keyUp(Keys.CONTROL).build().perform();
		
		Thread.sleep(2000);
		act.keyDown(Keys.TAB).build().perform();
		act.keyUp(Keys.TAB).build().perform();
		
		Thread.sleep(500);
		
		act.keyDown(Keys.CONTROL).build().perform();
		act.sendKeys("v").build().perform();
		act.keyUp(Keys.CONTROL).build().perform();
		
		act.keyDown(Keys.ENTER).build().perform();
		act.keyUp(Keys.ENTER).build().perform();
		
			
		
		Thread.sleep(5000);
		driver.close();

	}
}	
