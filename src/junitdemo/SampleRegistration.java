package junitdemo;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleRegistration {
	ChromeDriver driver;
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
	}
	
	@Test
	public void register() {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Daniel");
		
	}

}
