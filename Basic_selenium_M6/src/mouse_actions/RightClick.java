package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.google.co.in/");
		
		WebElement btnk = driver.findElement(By.linkText("About"));
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		act.contextClick(btnk).perform();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
