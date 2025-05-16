package pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("C:\\Users\\User\\git\\M6\\Basic_selenium_M6\\src\\pop_ups\\fileUpload.html");

		WebElement un = driver.findElement(By.cssSelector("input[type='text']"));
		un.sendKeys("admin");

		WebElement pwd = driver.findElement(By.cssSelector("input[type='password']"));
		pwd.sendKeys("password");
		
		Thread.sleep(3000);
		
		WebElement file = driver.findElement(By.cssSelector("input[type='file']"));
		file.sendKeys("C:\\Users\\User\\Desktop\\Assignments for Drop down.pdf");
	}
}
