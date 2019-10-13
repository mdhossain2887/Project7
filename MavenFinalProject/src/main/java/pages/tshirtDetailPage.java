package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import header.Header;
import utility.Shared;

public class tshirtDetailPage extends LoadableComponent<tshirtDetailPage>{
	@FindBy(xpath="//*[@id=\"shopping-bag-peek-footer\"]/div/div[2]/a/span") WebElement checkout;
	@FindBy(xpath="/html/body/div[1]/section[1]/div/header/div[2]/div/div[2]/div[3]/a/span") WebElement cart;
	@FindBy(xpath="//*[@id=\"content\"]/div/div/section/section[1]/section/button") WebElement addtobag;
	@FindBy(xpath="//*[@id=\"content\"]/div/div/section/section[1]/section/div[5]/div/div[2]/button/span")WebElement tshirstsize;
	@FindBy(xpath="//*[@id=\"content\"]/div/div/section/section[1]/section/div[3]/div/div[2]/a[2]/span[1]/span[2]") WebElement tshirtcolor;
	WebDriver driver;
	Header h;
	public tshirtDetailPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void selectColor() {
		Shared.click(tshirtcolor);
	}
	public void selectSize() {
		Shared.click(tshirstsize);
	}
	public void clickOnAddtoBag() {
		Shared.click(addtobag);
	}
	public void mouseOverOnCart() {
		Shared.mouseOver(driver, cart);
	}
	public CheckOut clickOnCheckout() {
		Shared.click(checkout);
		return new CheckOut(driver);
	}
	
	@Override
	protected void load() {
		driver.navigate().to("https://www.express.com/clothing/men/merino-wool-blend-crew-neck-sweater/pro/01775482/color/Obsession%20Blue/e/regular/");
		h=new Header(driver);
		h.verifyExpressLogo();
	}
	@Override
	protected void isLoaded() throws Error {
		Assert.assertTrue(driver.getCurrentUrl().equals("https://www.express.com/clothing/men/merino-wool-blend-crew-neck-sweater/pro/01775482/color/Obsession%20Blue/e/regular/"));
		h=new Header(driver);
		h.verifyExpressLogo();
	}
}
