package junitdemo;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {
	ChromeDriver driver;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
	}

	@Test
	public void search() {
		driver.findElement(By.xpath("//*[@id='gh-ac']")).sendKeys("Mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='s0-53-17-6-3-4[0]-3-2-1-list']/li[4]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"x-refine__group__0\"]/ul/li/ul/li[1]/a")).click();
//		
		
		String expectedTitle = "mobiles in Cell Phones & Accessories for sale | eBay";
		String actualTitle = driver.getTitle();
		
		
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Title pass");
		}
		else {
			System.out.println("title failed");
		}
		
	}
	

}
