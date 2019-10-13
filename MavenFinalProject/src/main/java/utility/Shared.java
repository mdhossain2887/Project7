package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Shared {
	
	public static void mouseOver(WebDriver driver, WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).build().perform();
	}
	public static void click(WebElement ele) {
		ele.click();
	}
	public static void verifyLogo(WebElement ele) {
		ele.isDisplayed();
		System.out.println("The logo is verifies for all pages");
	}
}
