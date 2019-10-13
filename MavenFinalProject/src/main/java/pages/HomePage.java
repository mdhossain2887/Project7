package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Shared;

public class HomePage {
	@FindBy(xpath="/html/body/div[2]/header/div[2]/div/nav/ul/li[1]/ul/li[1]/div/div/div[1]/div[1]/a") WebElement newarrival;
	@FindBy(xpath="/html/body/div[2]/header/div[2]/div/nav/ul/li[1]/ul/li[1]/a") WebElement wahtshotxpath;
	@FindBy(xpath="/html/body/div[2]/header/div[2]/div/nav/ul/li[1]/a") WebElement menxpath;
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void mouseOverOnMen() {
		Shared.mouseOver(driver, menxpath);
	}
	public void mouseOverOnWhatsHot() {
		Shared.mouseOver(driver, wahtshotxpath);
	}
	public MenPage clickOnNewArrivals() {
		Shared.click(newarrival);
		return new MenPage(driver);
	}
}
