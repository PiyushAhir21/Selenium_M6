package workingWithJSE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
//		driver.get("https://www.facebook.com/");
		jse.executeScript("document.location='https://www.facebook.com/'");
		WebElement un = driver.findElement(By.name("email"));
		WebElement pwd = driver.findElement(By.name("pass"));
		WebElement loginBtn = driver.findElement(By.name("login"));
		
//		loginBtn.click();
//		un.sendKeys("admin");

//		jse.executeScript("window.scrollBy(0,100)"); // Relative Scrolling
//		jse.executeScript("window.scrollTo(0,100)"); // Absolute Scrolling
		
		jse.executeScript("arguments[0].value='admin';", un);
		jse.executeScript("arguments[0].click()", loginBtn);
	}
}
