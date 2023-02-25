package Java_Classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s59_WiproJobsLink {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		//driver.findElement(By.name("q")).sendKeys("wipro jobs"+Keys.ENTER);  //1
		
		//we can use any one of the statement either //1 or either //2
		
		driver.switchTo().activeElement().sendKeys("wipro jobs"+Keys.ENTER); //2
		 
		
		List<WebElement> allLink = driver.findElements(By.xpath("//a"));
		//List<WebElement> allLink = driver.findElements(By.xpath("//h3"));

		int count = allLink.size();
		System.out.println(count);
		for (WebElement text : allLink) {
			System.out.println(text.getText());
		}
		driver.close();
	}
}
