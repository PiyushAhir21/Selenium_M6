package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SSofFB {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

		WebElement form = driver.findElement(By.xpath("//input[@type='text']/../../.."));
		File src = form.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\User\\git\\M6\\Basic_selenium_M6\\src\\takesscreenshot\\formFB2.png");
		FileHandler.copy(src, dest);

	}
}
