package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s55_closeSpecificBrowser {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		System.out.println("enter the title which you want to close");
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		driver.findElement(By.name("newbrowserwindow123")).click();
		driver.findElement(By.name("newbrowserwindow123")).click();
		Set<String> all = driver.getWindowHandles();
		for (String wh : all) {
			driver.switchTo().window(wh);
			String ti = driver.getTitle();
			if(ti.equals(title)) {
				driver.close();
			}
		}
	}
}
