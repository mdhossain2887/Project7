package header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Shared;

public class Header {
	@FindBy(xpath="/html/body/div[2]/header/div[2]/div/div[1]/a") WebElement logo;
	WebDriver driver;
	public Header(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public  void verifyExpressLogo() {
	
	Shared.verifyLogo(logo);
	}
}
