package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

import base.generic.TBW01_BaseClassW;

public class TW04_ActiTime extends TBW01_BaseClassW {
	@Test
	public void act() {
		Reporter.log("Login ActiTime",true);
	}
}
