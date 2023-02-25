package Java_Classes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s40_alertPopUP2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert c = driver.switchTo().alert();
		c.dismiss();
		String a = "You Pressed Cancel";
		String b = driver.findElement(By.xpath("//p[text()='You Pressed Cancel']")).getText();
		if(a.equals(b)) {
			System.out.println(b+" is present");
		}
		else {
			System.out.println(b+" is not persent");
		}
		driver.close();
	}
}
