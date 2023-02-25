package Java_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s22_UrlNavigation {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		String u = driver.getCurrentUrl();
		if(u.equals("https://www.selenium.dev/"))
		{
			System.out.println("URL is navigating to selinium.dev");
		}
		else
		{
			System.out.println("URL is not navigating to selinium.dev");
		}
	}
}
