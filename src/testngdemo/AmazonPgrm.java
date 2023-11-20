package testngdemo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonPgrm {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}

	@Test
	public void test() throws Exception {

		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephones", Keys.ENTER);
		String title = driver.getTitle();
		if (title.equals("Aamazon.in : mobilephones")) {
			System.out.println("Title pass " + title);
		} else {
			System.out.println("Title failed");
		}
		driver.findElement(By.xpath(
				"//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"))
				.click();

		String parentWindow = driver.getWindowHandle();

		Set<String> allWindow = driver.getWindowHandles();

		for (String handle : allWindow) {
			if (!handle.equalsIgnoreCase(parentWindow)) {
				driver.switchTo().window(handle);
				
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
				
				

			}
			driver.switchTo().window(parentWindow);
		}

	}

}
