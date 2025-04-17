package methods_of_wd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/"); // Fully qualified path
		
//		String title = driver.getTitle();
//		System.out.println(title);
		
//		Thread.sleep(1000);
//		driver.findElement(By.linkText("Meta")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.linkText("About")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.linkText("Blog")).click();
		
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
		
//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
		
		Thread.sleep(1000);
		driver.manage().window().minimize();
		Thread.sleep(1000);
		driver.manage().window().fullscreen();
		
		Thread.sleep(2000);
//		driver.close();
		driver.quit();
		
	}
}
