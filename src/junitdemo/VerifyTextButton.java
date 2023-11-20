package junitdemo;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTextButton {
	ChromeDriver driver;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}

	@Test
	public void verifyText() {
		String actualText = driver.findElement(By.xpath("//input[@id='Register']"))
				.getAttribute("value");
		String expectedTest = "Create my account >>";
		if (actualText.equals(expectedTest)) {
			System.out.println("Test pass");
		}

		else {
			System.out.println("Test failed");
		}

	}

}
