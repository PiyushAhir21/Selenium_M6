package pop_ups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopUps2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		Thread.sleep(2000);
		
		Alert ale = driver.switchTo().alert();
		ale.accept();		
		Thread.sleep(2000);		
		ale.accept();		
		
//		ale.dismiss();
		Thread.sleep(3000);

		driver.close();
	}
}
