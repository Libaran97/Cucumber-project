package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s10_xyAxisActiTime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		int x = driver.findElement(By.id("username")).getLocation().getX();
		int y = driver.findElement(By.name("pwd")).getLocation().getX();
		System.out.println("X - axis of UserName "+x);
		System.out.println("X - axis of Pasword "+y);
		if(x==y) {
			System.out.println("username and pasword are perfectly alinged");
		}
		else {
			System.out.println("not alinged");
		}
		System.out.println(x);
		System.out.println(y);
		driver.close();
	}
}
