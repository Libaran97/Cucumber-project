package Java_Classes;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s44_ResumeNaukari {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//div[.='Login']")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]")).sendKeys("ashwinrawat354@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("@@CoolAsh@@2");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("(//div[.='UPDATE PROFILE'])[2]")).click();
		Thread.sleep(2000);
		File f = new File("./Data/ash.docx");
		String apath = f.getAbsolutePath();
		driver.findElement(By.id("attachCV")).sendKeys(apath);
	}
}
