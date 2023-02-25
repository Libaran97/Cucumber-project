package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TW03_VerifyTitleSoft {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void testVerifyTitle() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String etitle = "soogle";
		String atitle = driver.getTitle();
		SoftAssert s = new SoftAssert();
		s.assertEquals(atitle, etitle);
		driver.close();
		s.assertAll();
	}
}
 