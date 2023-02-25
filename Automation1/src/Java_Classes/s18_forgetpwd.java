package Java_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s18_forgetpwd {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		String l = driver.findElement(By.linkText("Forgot your password?")).getTagName();
		if(l.equals("a"))
		{
			System.out.println("TagName of Forget pwd is a");
		}
		else {
			System.out.println("TagName of Forget pwd is not a");
		}
		driver.close();
	}
}
