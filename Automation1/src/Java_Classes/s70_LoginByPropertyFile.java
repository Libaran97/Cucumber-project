package Java_Classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s70_LoginByPropertyFile {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./Data/commandata.property");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("Url");
		String un = p.getProperty("UN");
		String pwd = p.getProperty("Pwd");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
	}
}
