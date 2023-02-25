package Java_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s24_fbRadioButton {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		Thread.sleep(2000);
		int f = driver.findElement(By.xpath("//span[.='Female']")).getLocation().getY();
		int m = driver.findElement(By.xpath("//span[.='Male']")).getLocation().getY();
		int c = driver.findElement(By.xpath("//span[.='Custom']")).getLocation().getY();
		System.out.println(f);
		System.out.println(m);
		System.out.println(c);
		if(f==m&&m==c)
		{
			System.out.println("it is alligned");
		}
		else {
			System.out.println("if is not alligned");
		}
		driver.close();
	}
}
