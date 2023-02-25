package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s41_alertPopUP3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[.='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[.='click the button to demonstrate the prompt box ']")).click();
		Thread.sleep(1000);
		Alert c = driver.switchTo().alert();
		Thread.sleep(1000);
		c.sendKeys("as");
		c.accept();
		boolean t = driver.findElement(By.xpath("//p[contains(text(),'Hello')]")).isDisplayed();
		if(t==true) {
			System.out.println("written text is present");
		}
		else {
			System.out.println("text is not present");
		}
		//driver.close();
	}
}
