package Base;

import org.junit.Test;

import pages.CheckOut;
import pages.HomePage;
import pages.MenPage;
import pages.tshirtDetailPage;

public class SmokeTest extends BaseTest{
	HomePage hp;
	 MenPage mp;
	 tshirtDetailPage td;
	 CheckOut co;
	@Test
	public void myTest() {
		hp=new HomePage(driver);
		hp.mouseOverOnMen();
		hp.mouseOverOnWhatsHot();
		mp=hp.clickOnNewArrivals().get();
		td=mp.clickOnTshirt().get();
		td.selectSize();
		td.selectColor();
		td.clickOnAddtoBag();
		td.mouseOverOnCart();
		td.clickOnCheckout();
		co=td.clickOnCheckout().get();
		co.clickCheckOut();
	}
}
