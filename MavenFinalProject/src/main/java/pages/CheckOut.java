package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import header.Header;
import utility.Shared;

public class CheckOut extends LoadableComponent<CheckOut>{
	@FindBy(xpath="//*[@id=\"continue-to-checkout\"]") WebElement checkout2;
	WebDriver driver;
	Header h;
	public CheckOut(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickCheckOut() {
		Shared.click(checkout2);
	}
	@Override
	protected void load() {
		driver.navigate().to("https://www.express.com/bag");
//		h=new Header(driver);
//		h.verifyExpressLogo();
	}
	@Override
	protected void isLoaded() throws Error {
		Assert.assertTrue(driver.getCurrentUrl().equals("https://www.express.com/bag"));
//		h=new Header(driver);
//		h.verifyExpressLogo();
	}

}
