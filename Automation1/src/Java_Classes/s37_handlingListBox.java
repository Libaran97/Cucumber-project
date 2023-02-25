package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class s37_handlingListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement monthlistbox = driver.findElement(By.id("month"));
		Select s = new Select(monthlistbox);
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByValue("7");
		s.selectByVisibleText("Nov");
	}
}
