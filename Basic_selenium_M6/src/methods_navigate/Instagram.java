package methods_navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");

		driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		Thread.sleep(2000);

		Navigation nav = driver.navigate();

		nav.back();
		Thread.sleep(2000);

		nav.forward();
		Thread.sleep(2000);

		nav.refresh();
		Thread.sleep(2000);

		driver.quit();
	}
}
