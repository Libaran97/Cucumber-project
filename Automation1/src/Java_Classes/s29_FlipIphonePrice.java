package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s29_FlipIphonePrice {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("iphone 13 Pro Max"+Keys.ENTER);
		List<WebElement>allsug = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13 Pro Max')]|//div[contains(text(),'APPLE iPhone 13 Pro Max')]/../../div[2]/div[1]/div[1]/div[1]"));
		int count = allsug.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			System.out.println(allsug.get(i).getText());
		}
		driver.close();
	}
}
