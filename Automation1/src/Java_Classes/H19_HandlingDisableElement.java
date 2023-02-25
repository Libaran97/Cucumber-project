package Java_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class H19_HandlingDisableElement {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Desktop/HTML/UnPw.html");
		driver.findElement(By.id("d1")).sendKeys("admin");
		driver.findElement(By.id("d2")).sendKeys("manager");
		RemoteWebDriver r = (RemoteWebDriver) driver;
		r.executeScript("document.getElementById('d2').value='manager'");
	}
}
