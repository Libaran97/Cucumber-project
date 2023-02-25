package javaselenium;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	@FindBy(id="username")
	private WebElement unt;
	@FindBy(name="pwd")
	private WebElement pwt;
	@FindBy(xpath ="//div[.='Login ']")
	private WebElement lgb;
	void LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setLogin(String un,String pw) {
		unt.sendKeys(un);
		pwt.sendKeys(pw);
		lgb.click();
		
	}
}
