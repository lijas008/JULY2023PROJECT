package junitdemo;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	ChromeDriver driver;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
	}

	@Test
	public void search() {
		driver.findElement(By.xpath("//*[@class='_2SmNnR']/input")).sendKeys("Mobiles", Keys.ENTER);
		driver.findElement(By.xpath(
				"//*[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/section[3]/div[2]/div[1]/div[2]/div[1]/label/div[1]"))
				.click();
		driver.findElement(By.xpath(
				"//*[@id='container']/div[1]/div[3]/div/div/div/div/div/section[3]/div[2]/div/div[2]/div/label/div"))
				.click();

//		List<WebElement> li = driver.findElements(By.tagName("a"));
//		System.out.println(li.size());
	}
}
