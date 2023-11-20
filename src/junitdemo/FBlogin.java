package junitdemo;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBlogin {
	ChromeDriver driver;
	 @Before
	 public void setUp() {
		 driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/login/");
		 
	 }
	 @Test
	 public void login() {
		 driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		 driver.findElement(By.name("pass")).sendKeys("abc123");
		 driver.findElement(By.id("loginbutton")).click();
	 }

}
