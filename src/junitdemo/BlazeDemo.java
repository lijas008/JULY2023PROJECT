package junitdemo;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeDemo {
	ChromeDriver driver;
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://blazedemo.com/register");
	}
	
	@Test
	public void register() {
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Mohammed Lijas");
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("Luminar");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("L008@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Wres123");
		driver.findElement(By.xpath("//input[@name='password_confirmation']")).sendKeys("Wres123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
