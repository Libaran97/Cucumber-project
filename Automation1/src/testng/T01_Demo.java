package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class T01_Demo {
	@Test
	public void testDemo() {
		Reporter.log("bye",true);
		Reporter.log("bye",false);
		Reporter.log("bye");
	}
}
