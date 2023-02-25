package Java_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s07_RemoveTextValue {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.opensourcebilling.org/en/users/sign_in");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).clear();
	}
}
