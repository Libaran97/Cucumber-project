package Java_Classes;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s61_CheckBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		System.out.println("Enter the Url");
		Scanner sc = new Scanner(System.in);
		String url = sc.nextLine();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		List<WebElement> all = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement ch : all) {
			ch.click();
			System.out.println(ch.isSelected());
		}
		driver.close();
	}
}
