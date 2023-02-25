package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TW02_VerifyTitle {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void verify() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String aTitle = "Google";
		String eTitle = driver.getTitle();
		Assert.assertEquals(aTitle, eTitle);
		driver.close();
	}
}
