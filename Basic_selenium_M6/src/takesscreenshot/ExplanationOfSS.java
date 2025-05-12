package takesscreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ExplanationOfSS {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
//		How to take a ss of a webpage?
//		Zomato + Paytm + Redbus
		TakesScreenshot tks = (TakesScreenshot) driver;
		File src = tks.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\User\\git\\M6\\Basic_selenium_M6\\src\\takesscreenshot\\ss1.png");
		FileHandler.copy(src, dest);
		
//		How to take a ss of webelement?
//		Form of facebook, form of instagram
		WebElement loginBtn = driver.findElement(By.xpath("//div[contains(text(), 'Log in')]"));
		File src2 = loginBtn.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("C:\\Users\\User\\git\\M6\\Basic_selenium_M6\\src\\takesscreenshot\\ss2.png");
		FileHandler.copy(src2, dest2);
		
//		FileHandler
		
		driver.close();
	}
}
