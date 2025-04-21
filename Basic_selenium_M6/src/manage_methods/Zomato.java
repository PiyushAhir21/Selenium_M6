package manage_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.zomato.com/"); // Fully qualified path

//		Options opt = driver.manage();
//		Window win =  opt.window();

		Window win = driver.manage().window();

		win.maximize();
		Thread.sleep(1000);

		win.minimize();
		Thread.sleep(1000);

//		win.fullscreen();
//		Thread.sleep(1000);

//		Size 
		Dimension dim = win.getSize();
		System.out.println("Dimension : " + dim);
		int w = dim.getWidth();
		int h = dim.getHeight();
		System.out.println("Width is : " + w + " Height is : " + h);

		Thread.sleep(2000);

		Dimension dim2 = new Dimension(1366 / 2, 768 / 2);
		win.setSize(dim2);

		Point pt = win.getPosition();
		System.out.println("Position is : " + pt);

		int x = pt.getX();
		int y = pt.getY();
		System.out.println("X coordinate : " + x + "Y coordinate : " + y);

		Point pt2 = new Point(500, 400);
		win.setPosition(pt2);

		Thread.sleep(5000);
		driver.close();

	}
}
