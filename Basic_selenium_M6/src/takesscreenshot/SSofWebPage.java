package takesscreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SSofWebPage {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
//		type casting (downcasting)
		TakesScreenshot tks = (TakesScreenshot) driver;
//		use of gSA(), outputtype => FILE
		Thread.sleep(1000);
		File source = tks.getScreenshotAs(OutputType.FILE);
//		FileHandling => physical file => java object
		
		File destination = new File("C:\\Users\\User\\git\\M6\\Basic_selenium_M6\\src\\takesscreenshot\\ss2.png");
//		Copy the content from source to the dummy destination file
		FileHandler.copy(source, destination);
	}
}
