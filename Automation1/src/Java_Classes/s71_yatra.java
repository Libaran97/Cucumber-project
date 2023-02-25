package qsp;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class s71_yatra {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("yatra.com"+Keys.ENTER);
		driver.findElement(By.xpath("(//h3[contains(text(),'Yatra.com')])[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'One Way')]")).click();
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[1]")).click();
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[1]")).sendKeys("bangaluru");
		driver.findElement(By.xpath("(//p[@class='ac_cityname'])[1]")).sendKeys("Bangaluru");
		driver.switchTo().activeElement().sendKeys("Goa");
		Thread.sleep(2000);
	}
}
