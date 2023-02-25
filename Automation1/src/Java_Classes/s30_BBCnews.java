package Java_Classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s30_BBCnews {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bbc.com/");
		List<WebElement> bnews = driver.findElements(By.xpath("//span[@class='top-list-item__bullet']/../h3"));
		int count = bnews.size();
		System.out.println(count);
		for (int i = 0; i < count ; i++) {
			System.out.println(bnews.get(i).getText());
		}
		driver.close();
	}
}
