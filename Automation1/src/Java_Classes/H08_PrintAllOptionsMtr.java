package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class H08_PrintAllOptionsMtr {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Desktop/HTML/Hotel.html");
		 WebElement mt = driver.findElement(By.id("mtr"));
		 Select s = new Select(mt);
		 List<WebElement> alloption = s.getOptions();
		 int count = alloption.size();
		 System.out.println(count);
		 for (WebElement e : alloption){
			System.out.println(e.getText());
		}
		 driver.close();
	}
}
