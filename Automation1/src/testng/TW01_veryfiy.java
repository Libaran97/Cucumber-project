package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TW01_veryfiy {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	private void verifytitle() {
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.google.com/");
		String etitle = "Google";
		String atitle = driver.getTitle();
		if(atitle.equals(etitle)) {
			Reporter.log("Title is Maching & pass",true);
		}
		else {
			Reporter.log("Title is not maching & failed",true);
		}
		driver.close();
	}
}
