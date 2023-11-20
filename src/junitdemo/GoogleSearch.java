package junitdemo;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	ChromeDriver driver;
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void Search() {
		driver.findElement(By.id("APjFqb")).sendKeys("ICC",Keys.ENTER);
//		driver.findElement(By.id("btnK")).click();
//		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Cricket",Keys.ENTER);
	}

}
