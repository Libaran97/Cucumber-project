package Java_Classes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s60_ClearTripFlight {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.switchTo().activeElement().sendKeys("cleartrip.com"+Keys.ENTER);
		driver.findElement(By.xpath("//h3[contains(text(),'Flight bookings,')]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[1]")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[.='Suggestions']/../li/p")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[2]")).sendKeys("Goa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Suggestions']/../li/p")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()='Search flights']")).click();
		List<WebElement> flight = driver.findElements(By.xpath("//img[@class]"));
		List<WebElement> time = driver.findElements(By.xpath("//div[contains(@class,'ms-grid-column-1 ms-grid-row-1')]/p"));
		List<WebElement> price = driver.findElements(By.xpath("//div[contains(@class,'flex flex-column pl-2 flex-bottom')]/p"));
		for (int i = 0; i < flight.size(); i++) {
			String fli = flight.get(i).getAttribute("alt");
			String ti = time.get(i).getText();
			String pri = price.get(i).getText();
			System.out.println(fli+" : "+ti+" : "+pri);
		}
		driver.close();
	}
}
