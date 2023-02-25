package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s28_AutoSugFlipKart {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(2000);
		List<WebElement>allsug = driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
		//List<WebElement> price = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13 Pro Max')]/../../div[2]/div[3]/div[1]"));
		 int count = allsug.size();
		 System.out.println(count);
		//int rs = price.size();
		for (int i = 0; i <count; i++) {
		System.out.println(allsug.get(i).getText());
		}
		allsug.get(count-1).click();
		driver.close();
	}
}
