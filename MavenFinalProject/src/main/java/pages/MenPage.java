package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import header.Header;
import utility.Shared;
public class MenPage extends LoadableComponent<MenPage>{
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div/div[3]/span[3]/span[1]/a[3]/span/img") WebElement tshirt;
	WebDriver driver;
	
	public MenPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public tshirtDetailPage clickOnTshirt() {
		Shared.click(tshirt);
		return new tshirtDetailPage(driver);
	}
	@Override
	protected void load() {
		driver.navigate().to("https://www.express.com/mens-clothing/whats-hot/cat120009");
    Header h=new Header(driver);
	h.verifyExpressLogo();
	}
	
	@Override
	protected void isLoaded() throws Error {
		Assert.assertTrue(driver.getCurrentUrl().equals("https://www.express.com/mens-clothing/whats-hot/cat120009"));
		Header h=new Header(driver);
		h.verifyExpressLogo();
	}
}
