package we_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");

		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		WebElement loginBtn = driver.findElement(By.name("login"));

		
//		Actions methods
		username.sendKeys("admin"); 
		Thread.sleep(1000);
		username.clear();
		Thread.sleep(1000);
		username.sendKeys("admin@123");
		Thread.sleep(1000);
		password.sendKeys("12345678");
		
//		Getters methods
		String textOfLoginBtn = loginBtn.getText();
		System.out.println("text of login btn : " +textOfLoginBtn);
		
		String tagOfLoginBtn = loginBtn.getTagName();
		System.out.println("Tags of LoginBtn : " + tagOfLoginBtn);
		
		String attValue = loginBtn.getAttribute("type");
		System.out.println("Attribute value of 'type' : " + attValue);
		
		String bgClr = loginBtn.getCssValue("background-color");
		System.out.println("Background color : " + bgClr);
		
		System.out.println("Size : " + loginBtn.getSize());
		System.out.println("Position : "+loginBtn.getLocation());
		System.out.println("X cordinate : " + loginBtn.getRect().getX());
		System.out.println("Y cordinate : "+loginBtn.getRect().getY());	
		System.out.println("Height : " +loginBtn.getRect().getHeight());
		System.out.println("Width : " +loginBtn.getRect().getWidth());
		
//		Verifications methods
		if (loginBtn.isDisplayed()) {
			System.out.println("If you can read this msg that means the login button is visible...");
			if (loginBtn.isEnabled()) {
				System.out.println("If you can read this msg that means the login button is enabled...");
//				loginBtn.click();
//				loginBtn.submit();
			}
		}
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement maleRadioBtn =  driver.findElement(By.xpath("//label[text()='Male']/input"));
		maleRadioBtn.click();
		if (maleRadioBtn.isSelected()) {
			System.out.println("Male is selected");
		}
		driver.close();
	}
}
