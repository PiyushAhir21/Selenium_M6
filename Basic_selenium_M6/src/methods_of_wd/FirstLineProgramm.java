package methods_of_wd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstLineProgramm {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/"); // Fully qualified path
													// -> if not then InvalidArgumentException

		String title = driver.getTitle();
		System.out.println(title);

		Thread.sleep(1000);

		String cUrl = driver.getCurrentUrl();
		System.out.println(cUrl);

//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);

		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.manage().window().minimize();

		Thread.sleep(1000);
		
		driver.manage().window().fullscreen();
		
		Thread.sleep(2000);
		driver.close();

	}
}
