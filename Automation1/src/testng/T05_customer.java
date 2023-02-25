package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

import base.generic.TB01_BaseClass;

public class T05_customer extends TB01_BaseClass{
	@Test
	public void createCustomer() {
		Reporter.log("create Customer",true);
	}
}
