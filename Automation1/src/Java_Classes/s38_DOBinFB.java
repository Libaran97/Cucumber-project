package Java_Classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class s38_DOBinFB {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement day = driver.findElement(By.id("day"));
		Select d = new Select(day);
		d.selectByIndex(19);
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByVisibleText("May");
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByValue("1997");
		driver.close();
	}
}
