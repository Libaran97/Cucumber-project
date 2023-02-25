package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s04_withoutget {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.google.com/");
      Thread.sleep(2000);
      driver.get("https://www.gmail.com/");
      Thread.sleep(6000);
      driver.get("https://www.youtube.com/");
      Thread.sleep(5000);
      driver.navigate().back();
      Thread.sleep(5000);
      driver.navigate().forward();
      Thread.sleep(5000);
      driver.navigate().refresh();
      Thread.sleep(5000);
      driver.quit();
	}

}
