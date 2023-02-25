package Java_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class H14_printallOtions {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Desktop/HTML/Hotel.html");
		WebElement options = driver.findElement(By.id("slv"));
		Select s = new Select(options);
		String text = s.getWrappedElement().getText();
		System.out.println(text);
		driver.close();
	}
}
