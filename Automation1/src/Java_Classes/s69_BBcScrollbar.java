package Java_Classes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s69_BBcScrollbar {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		j.executeScript("window.scrollto(0,0)");
	}
}
