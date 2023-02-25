package Java_Classes;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class H16_FileUploadPopUP {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Desktop/HTML/upload.html");
		File f = new File("./Data/ash.docx");
		String path = f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(path);
	}
}
