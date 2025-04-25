package search_context;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Thread.sleep(2000);

		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Kallu_kaliya");
		Thread.sleep(1000);

		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("12345");

		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("Forgotten")).click();

		Thread.sleep(5000);
		driver.quit();
	}
}
