package junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
	ChromeDriver driver;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}
	@Test
	public void FBlogin() {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Lkg1@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123lh");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	@After
	public void quitFB() {
		driver.quit();
	}
}
