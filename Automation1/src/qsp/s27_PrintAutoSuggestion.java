package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s27_PrintAutoSuggestion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.name("q")).sendKeys("java");
		driver.switchTo().activeElement().sendKeys("java");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		List<WebElement>allsug = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		//int count = allsug.size();
		//System.out.println(count);
		for (WebElement w : allsug) {
			System.out.println(w.getText());
		}
		/*for (int i = 0; i < allsug.size(); i++) {
		String text = allsug.get(i).getText();
			System.out.println(text);
		}*/
		allsug.get(0).click();
		//driver.close();
	}

}
