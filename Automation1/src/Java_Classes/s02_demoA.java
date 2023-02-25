package Java_Classes;

import org.openqa.selenium.WebDriver;

public class s02_demoA {
	static void testA(WebDriver driver) {
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
