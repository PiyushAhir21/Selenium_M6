package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("C:\\Users\\User\\git\\M6\\Basic_selenium_M6\\src\\HTML_files\\multiselect.html");

		WebElement carDD = driver.findElement(By.id("cars"));

		Select sel = new Select(carDD);
		sel.selectByVisibleText("TATA");
		sel.selectByVisibleText("Rolls royce");

		System.out.println(sel.isMultiple());
		
//		sel.deselectAll();
		WebElement first = sel.getFirstSelectedOption();
		String firstSelected = first.getText();
		System.out.println(firstSelected);
		
		List<WebElement> options = sel.getAllSelectedOptions();
		for (WebElement iterator : options) {
			System.out.println(iterator.getText());
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
