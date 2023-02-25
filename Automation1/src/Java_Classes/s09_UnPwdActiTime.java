package Java_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s09_UnPwdActiTime {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		 int un = driver.findElement(By.id("username")).getSize().getHeight();
		 int pwdd = driver.findElement(By.name("pwd")).getSize().getHeight();
		if(un==pwdd){
			System.out.println("Height of Username & Password is Equal");
		}
		else {
			System.out.println("Heigth of Username & Password is not Equal");
		}
		driver.close();
	}

}
