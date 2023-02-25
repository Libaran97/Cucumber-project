package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s62_ContainsOfWebTable {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		List<WebElement> all = driver.findElements(By.xpath("//td"));
		int count = all.size();
		System.out.println(count);
		for (WebElement te : all) {
			System.out.println(te.getText());
		}
		//driver.close();
		/*for (int i = 0; i < count; i++) {
			String text = all.get(i).getText();
			System.out.println(text);
		}*/
	}
}
