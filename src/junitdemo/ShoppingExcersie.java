package junitdemo;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingExcersie {

	ChromeDriver driver;

	@Before
	public void setUp() {

		driver = new ChromeDriver();
		driver.get("https://automationexercise.com");
	}

	@Test
	public void products() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
		Thread.sleep(3);

		driver.findElement(By.xpath("//*[@id=\"accordian\"]/div[1]/div[1]/h4/a/span/i")).click(); // + icon
//		Thread.sleep(3);

		driver.findElement(By.xpath("//*[@id=\"Women\"]/div/ul/li[1]/a")).click(); // Dress
		Thread.sleep(3);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
//		Thread.sleep(3);

		driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[2]/ul/li/a")).click(); // View
																													// products
		Thread.sleep(3);

		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Hello"); // name

		driver.findElement(By.xpath("//*[@id=\"review\"]")).sendKeys("Shooper"); // Review

	}
}
