package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class H15_SelectDeselect {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Desktop/HTML/Hotel.html");
		WebElement mt = driver.findElement(By.id("mtr"));
		Select s = new Select(mt);
		List<WebElement> option = s.getOptions();
		int count = option.size();
		for (int i = 0; i < count; i++) {
			Thread.sleep(500);
			s.selectByIndex(i);
		}
		for (int i =count-1 ; i >=0 ; i--) {
			s.deselectByIndex(i);
			Thread.sleep(500);
		}
		driver.close();
	}
}
