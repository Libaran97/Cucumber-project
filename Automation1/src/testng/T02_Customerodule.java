package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class T02_Customerodule {
	//@Test(priority = 1)
	@Test(groups="smoke")
	public void createcustomer() {
		Reporter.log("Create Customer",true);
	}
	//@Test(priority = 2, dependsOnMethods = "createcustomer")
	@Test(groups={"smoke","regresation"})
	public void modifyCustomer() {
		Reporter.log("Modify Customer",true);
	}
	//@Test(priority = 3, dependsOnMethods = {"createcustomer","modifyCustomer"})
	@Test(groups = "smoke")
	public void deleteCustomer()
	{
		Reporter.log("Delete Customer");
	}
}
