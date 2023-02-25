package Java_Classes;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * this is a generic class for web driver actions
 * @author dell
 *
 */

public class G2_WbDriverComman {
	/**
	 * implicit wait
	 * @param driver
	 */
	public void waitForPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	/**
	 * Explicit wait
	 * @param driver
	 * @param element
	 */
	public void waitForPage(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * customer wait
	 * @param element
	 */
	public void customwait(WebElement element) {
		int i = 0;
		while(i<=100) {
			try {
				element.isDisplayed();
			}
			catch (NoSuchElementException e) {
				i++;
			}
		}
	}
	/**
	 * to select the option in the list box by using index
	 * @param element
	 * @param i
	 */
	public void selectOption(WebElement element,int i) {
		Select s = new Select(element);
		s.selectByIndex(i);
	}
	/**
	 * to select the option in the list box by using visible text
	 * @param element
	 * @param text
	 */
	public void selectOption(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
}
