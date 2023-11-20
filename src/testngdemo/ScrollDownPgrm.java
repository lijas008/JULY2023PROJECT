package testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollDownPgrm {

	WebDriver driver;

	@BeforeTest
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
//		Thread.sleep(30000);
	}

	@Test
	public void test() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); // can't locate career due to resolution
		js.executeScript("window.scrollBy(0,350)", "");

		driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[2]/a")).click(); // career

	}

}
