package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(id="username")
	private WebElement unt;
	@FindBy(name="pwd")
	private WebElement pwt;
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement lgb;
	private void setLogin(String un, String pw) {
		unt.sendKeys(un);
		pwt.sendKeys(pw);
		lgb.click();
	}
}
