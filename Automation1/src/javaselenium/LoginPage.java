package javaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebElement unt;
	private WebElement pwt;
	private WebElement lgb;
	
	public LoginPage(WebDriver driver) {
		unt = driver.findElement(By.id("username"));
		pwt = driver.findElement(By.name("pwd"));
		lgb = driver.findElement(By.xpath("//div[.='Login ']"));
	}
	public void setLogin(String un, String pw) {
		unt.sendKeys(un);
		pwt.sendKeys(pw);
		lgb.click();
	}
}
