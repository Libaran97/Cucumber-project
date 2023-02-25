package Java_Classes;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s51_widowTitle {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();//upcasting
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		driver.findElement(By.name("newbrowserwindow123")).click();
		driver.findElement(By.name("newbrowserwindow123")).click();
		Set<String> all = driver.getWindowHandles();
		for (String ti : all) {
			driver.switchTo().window(ti);
			String title = driver.getTitle();
			System.out.println(title);
		}
		driver.quit();
	}
}
