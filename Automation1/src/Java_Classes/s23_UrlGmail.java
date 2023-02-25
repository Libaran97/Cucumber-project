package Java_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s23_UrlGmail {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String u = driver.getCurrentUrl();
		if(u.contains("google.com/"))
		{
			System.out.println("url navigating Google.com");
		}
		else
		{
			System.out.println("url is not navigating Google.com");
		}
		driver.close();
	}
}
