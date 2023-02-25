package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class H07_printAllSeectedOption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Desktop/HTML/Hotel.html");
		WebElement sl = driver.findElement(By.id("slv"));
		Select s = new Select(sl);
		List<WebElement> option = s.getAllSelectedOptions();
		int count = option.size();
		System.out.println(count);
		for (int i = 0; i < count ; i++) {
			String text = option.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}
}
