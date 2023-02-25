package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s52_closeBrowserWithoutQuit {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		Thread.sleep(3000);
		driver.findElement(By.name("newbrowserwindow123")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("newbrowserwindow123")).click();
		Thread.sleep(3000);
		Set<String> all = driver.getWindowHandles();
		for (String wh : all) {
			Thread.sleep(2000);
			driver.switchTo().window(wh);
			driver.close();
		}
	}
}
