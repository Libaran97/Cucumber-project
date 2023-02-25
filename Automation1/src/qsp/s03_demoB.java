package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s03_demoB {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[]agrs) {
		WebDriver driver= new ChromeDriver();
		s02_demoA.testA(driver);
		//WebDriver driver1= new FirefoxDriver();
		//demoB_03.testA(driver1);
	}

}
