package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement copenhagen = driver.findElement(By.id("box4"));
		WebElement denmark = driver.findElement(By.id("box104"));
	
		WebElement oslo = driver.findElement(By.id("box2"));
		WebElement sweden = driver.findElement(By.id("box102"));
	
		Actions act = new Actions(driver);
		act.dragAndDrop(oslo, sweden).build().perform();
		act.dragAndDrop(copenhagen, denmark).build().perform();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
