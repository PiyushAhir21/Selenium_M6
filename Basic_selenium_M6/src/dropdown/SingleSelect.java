package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/r.php?entry_point=login");

		WebElement dayDD = driver.findElement(By.id("day"));

		Select selDay = new Select(dayDD);
		selDay.selectByIndex(10);

		WebElement monthDD = driver.findElement(By.name("birthday_month"));

		Select selMon = new Select(monthDD);
		selMon.selectByVisibleText("Sep");

		WebElement yearDD = driver.findElement(By.id("year"));

		Select selYea = new Select(yearDD);
		List<WebElement> years = selYea.getOptions();
		for (WebElement iterator : years) {
			String year = iterator.getText();
			System.out.println(year);
		}
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
