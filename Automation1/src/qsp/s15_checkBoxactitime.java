package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s15_checkBoxactitime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		boolean c = driver.findElement(By.id("keepLoggedInLabel")).isSelected();
		if(c==true)
		{
			System.out.println("Check is present");
		}
		else {
			System.out.println("Check is not Present");
		}
		driver.close();
	}

}
