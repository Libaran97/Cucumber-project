package Java_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class s65_HandlingDragAndDrop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement source = driver.findElement(By.xpath("//h1[.='Block1']"));
		WebElement target = driver.findElement(By.xpath("//h1[.Block4']"));
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}
}
