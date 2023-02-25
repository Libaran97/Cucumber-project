package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.generic.TBW04_BaseTakeSS;
@Listeners(base.generic.TBW05_ListenerImp.class)
public class TW08_ListenerBaseTSS extends TBW04_BaseTakeSS{
	@Test
	public void ScreenShot() throws InterruptedException {
		Reporter.log("ScreenS",true);
		Thread.sleep(4000);
		Assert.fail();
	}
}
