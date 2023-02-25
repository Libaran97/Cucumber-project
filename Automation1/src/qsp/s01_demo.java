package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class s01_demo {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://google.com");
	String title = driver.getTitle();
	System.out.println(title);
	driver.close();
	
	
	}

}
