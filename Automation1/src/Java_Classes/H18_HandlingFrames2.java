package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H18_HandlingFrames2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Desktop/HTML/Page1.html");
		driver.findElement(By.id("ti")).sendKeys("a");
		driver.switchTo().frame("F1");
		driver.findElement(By.id("t2")).sendKeys("b");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("ti")).sendKeys("c");
		WebElement f = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(f);
		driver.findElement(By.id("t2")).sendKeys("d");
	}
}
