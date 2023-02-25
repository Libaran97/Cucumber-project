package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T03_Annotation {
	@BeforeClass
	public void openBrowser() {
		Reporter.log("Open Browser",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("Close Browser",true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("Login",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("Logout",true);
	}
	@Test
	public void createcustomer() {
		Reporter.log("Create Customer",true);
	}
	@Test
	public void deletecustomer() {
		Reporter.log("Delete Customer",true);
	}
}
