package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.FbCreatePage;
import pagepkg.FbLoginPage;

public class FbLoginTest {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

	}

	@Test
	public void FbLogin() {
		FbLoginPage ob = new FbLoginPage(driver);
		ob.setValues("abq@gmail.com", "Lj@123");
		ob.login();
		driver.navigate().back();
		FbCreatePage c = new FbCreatePage(driver);
		c.createPageClick();
		c.getStartedClick();
	}

}
