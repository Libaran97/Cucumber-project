package testng;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.generic.TBW01_BaseClassW;
import base.generic.listener;
@Listeners(base.generic.listener.class)

public class CusModule extends TBW01_BaseClassW
{
	@Test
	public void createCus() throws InterruptedException {
		Reporter.log("Create Customer", true);
		Thread.sleep(2000);
		Assert.fail();
	}
}
