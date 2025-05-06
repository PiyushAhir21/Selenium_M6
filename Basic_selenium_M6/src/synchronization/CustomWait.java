package synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class CustomWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("admin");
	
		
		FluentWait wait = new FluentWait(driver);
		
//		to set the timeout
		wait.withTimeout(Duration.ofSeconds(15));
		
//		to set the polling time/interval		
		wait.pollingEvery(Duration.ofSeconds(3));
		
//		to wait until any condition
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("login")));
		driver.findElement(By.name("login")).click();
//		to ignore any exception
		wait.ignoring(NoSuchElementException.class);
	
	}
}
