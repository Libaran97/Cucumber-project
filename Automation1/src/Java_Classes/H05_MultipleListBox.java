package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class H05_MultipleListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Desktop/HTML/Hotel.html");
		WebElement mt = driver.findElement(By.id("mtr"));
		Select s = new Select(mt);
		s.selectByValue("i");
		s.selectByIndex(2);
		s.selectByVisibleText("Idly");
		Thread.sleep(1000);
		s.deselectByIndex(0);
		s.deselectByValue("v");
		s.deselectByVisibleText("Dosa");
		System.out.println(s.isMultiple());

	}
}
