package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class H17_HandlingFrame {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("‪file:///C:/Users/dell/Desktop/HTML/Page1.html");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("JSP");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("ti")).sendKeys("QSP");
	}
}
