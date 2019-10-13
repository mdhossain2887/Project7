package Base;

import java.util.concurrent.TimeUnit;

import org.junit.Before;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseTest {
	WebDriver driver;
		@Before
		public void openBrowser() {
		
		driver=new SafariDriver();
		driver.get("http://www.express.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
}
