package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s14_FbLoginEnable {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String []args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean b = driver.findElement(By.name("login")).isEnabled();
		if(b==true)
		{
			System.out.println("Login button is ENabled");
		}
		else 
		{
		System.out.println("Login Button Is not Enabled");	
		}	
		driver.close();
	}

}
