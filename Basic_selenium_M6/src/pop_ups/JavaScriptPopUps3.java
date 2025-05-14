package pop_ups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopUps3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		Alert ale = driver.switchTo().alert();
		String text =ale.getText();
		System.out.println(text);
		ale.sendKeys("Banrakas");
		ale.accept();
		
//		driver.close();
	}
}
