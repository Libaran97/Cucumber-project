package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s72_Goibibo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("Goibibo.com"+Keys.ENTER);
		driver.findElement(By.xpath("(//h3[contains(text(),'Goibibo ')])[1]")).click();
		driver.findElement(By.xpath("(//p[contains(text(),'Enter city or airport')])[1]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Bangaluru");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='sc-jObWnj dmPlWU'])[1]/p/span[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//p[contains(text(),'Enter city or airport')])[2]")).click();
		/*Robot r = new Robot();
		r.keyPress(KeyEvent.VK_G);
		r.keyPress(KeyEvent.VK_O);
		r.keyPress(KeyEvent.VK_A);*/
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Goa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='sc-jObWnj dmPlWU'])[1]/p/span[1]")).click();
		//driver.findElement(By.xpath("(//p[contains(text(),'Enter city or airport')])[2]")).sendKeys("Goa");
	}
}
