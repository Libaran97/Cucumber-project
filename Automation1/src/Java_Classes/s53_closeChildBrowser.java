package Java_Classes;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s53_closeChildBrowser {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		String pwh = driver.getWindowHandle();
		driver.findElement(By.name("newbrowserwindow123")).click();
		driver.findElement(By.name("newbrowserwindow123")).click();
		Set<String> all = driver.getWindowHandles();
		for (String wi : all) {
			driver.switchTo().window(wi);
			if(wi.equals(pwh)) {
			}
			else {
				driver.close();
			}
		}
	}
}
