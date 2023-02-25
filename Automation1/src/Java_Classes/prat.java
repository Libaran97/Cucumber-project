package Java_Classes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prat {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_W);
		driver.get("https://amazon.com/");
		driver.navigate().to("https://amazon.com/");
	}
}
