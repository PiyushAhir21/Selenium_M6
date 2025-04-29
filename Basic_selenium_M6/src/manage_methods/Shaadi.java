package manage_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shaadi {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.shaadi.com/");

		Window win = driver.manage().window();
//		win.fullscreen();
//		Dimension dim = win.getSize(); // Dimension
//		System.out.println(dim);
//		int h = dim.getHeight();
//		System.out.println("height is : " + h);
//
//		int w = dim.getWidth();
//		System.out.println("width is : " + w);
//
//		Dimension dim2 = new Dimension(400, 200);
//		win.setSize(dim2);

		Point pt = win.getPosition();
		System.out.println("position before : " + pt);
		int x = pt.getX();
		int y = pt.getY();
		System.out.println(x + " " + y);

		Point pt2 = new Point(0, 0);

		win.setPosition(pt2);
		System.out.println("latest position " + win.getPosition());
		Thread.sleep(5000);
		driver.close();

	}
}
