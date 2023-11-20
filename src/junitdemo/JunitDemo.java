package junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo {
	ChromeDriver driver;
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void titleVerification() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Title fail");
		}
	}
	
	@Test
	public void wordContains() {
		
		String src = driver.getPageSource();
		if(src.contains("Gmail")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
	
	@After
	public void closingBrowser() {
		driver.quit();
	}
	
}
