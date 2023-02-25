package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

import base.generic.TBW03_ParallelExe;

public class TB07_ParallelBrowserAct extends TBW03_ParallelExe {
	@Test
	public void act() {
		Reporter.log("Parallel",true);
	}
}
