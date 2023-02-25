package Java_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s12_Alogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://demo.actitime.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(5000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Login")).click();
	}
}
