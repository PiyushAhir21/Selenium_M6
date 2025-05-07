package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://jqueryui.com/slider/");
		
//		Switch to particular frame
		driver.switchTo().frame(0);
		
		WebElement slider = driver.findElement(By.id("slider"));
		
		Actions act = new Actions(driver);
//		act.moveToElement(slider,200,0).click().build().perform();
		act.moveToElement(slider).click().moveByOffset(100, 0).build().perform();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
