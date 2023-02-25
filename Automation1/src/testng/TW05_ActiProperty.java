package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

import base.generic.TBW02_ActiProperty;

public class TW05_ActiProperty extends TBW02_ActiProperty {
	@Test
	public void act() {
		Reporter.log("Login",true);
	}
}
