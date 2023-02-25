package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s57_HandlingTab {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(2000);
		Set<String> all = driver.getWindowHandles();
		int count = all.size();
		System.out.println(count);
		//driver.quit();
	}
}
