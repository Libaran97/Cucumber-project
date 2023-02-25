package Java_Classes;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class H13_SearchSpecificOption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		System.out.println("Enter the Option to search");
		Scanner sc = new Scanner(System.in);
		String option = sc.nextLine();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Desktop/HTML/Hotel.html");
		WebElement mt = driver.findElement(By.id("mtr"));
		Select s = new Select(mt);
		List<WebElement> all = s.getOptions();
		int count = all.size();
		int counter = 0 ;
		for (int i = 0; i < count ; i++) {
			String text = all.get(i).getText();
			if(text.equals(option)) {
				counter++;
			}
		}
		if(counter==0) {
			System.out.println(option+" is not present");
		}
		else if(counter==1) {
			System.out.println(option+" is present");
		}
		else if(counter>1) {
			System.out.println(option+" is present with duplicate");
		}
		driver.close();
	}
}
