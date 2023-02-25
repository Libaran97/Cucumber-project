package base.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TBW02_ActiProperty {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	WebDriver driver;
	FileInputStream fis;
	Properties p;
	@BeforeTest
	public void OpenBrowser() throws IOException {
		Reporter.log("Open Browser",true);
		fis = new FileInputStream("./Data/commandata.property");
		p = new Properties();
		p.load(fis);
		String ur = p.getProperty("Url");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(ur);
	}
	@AfterTest
	public void CloseBrowser() {
		Reporter.log("Close Browser",true);
		driver.close();
	}
	@BeforeMethod
	public void login() {
		Reporter.log("Login",true);
		String un = p.getProperty("UN");
		String pw = p.getProperty("Pwd");
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
	}
	@AfterMethod
	public void logout() {
		Reporter.log("Logout",true);
		driver.findElement(By.id("logoutLink")).click();
	}
}
