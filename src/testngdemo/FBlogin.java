package testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FBlogin {
	
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
//	@BeforeMethod
//	public void urlDetails() {
//		driver.get("");
//	}
	@Parameters({"usr","pswd"})
	@Test
	public void login(String usr,String pswd) {
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(usr);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(pswd);

	}
	

}
