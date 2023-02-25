package Java_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author dell
 *
 */
public class s17_actitimeURL {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		String u = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).getAttribute("herf");
		System.out.println(u);
		driver.close();
	}
}
