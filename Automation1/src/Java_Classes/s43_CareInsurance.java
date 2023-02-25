package Java_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class s43_CareInsurance {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement mo = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select m = new Select(mo);
		m.selectByVisibleText("May");
		WebElement ye = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select y = new Select(ye);
		y.selectByValue("1997");
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[19]")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.xpath("(//button[@class='submit-login'])")).click();
		String t = "Please enter valid Policy No.";
		String v = driver.findElement(By.xpath("//span[.='Please enter valid Policy No.']")).getText();
		if(v.equals(t)) {
			System.out.println(t+" is displayed");
		}
		else {
			System.out.println(t+" is not dispayed");
		}
		driver.close();
	}
}
