package junitdemo;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertboxPgm {
	ChromeDriver driver;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("file:///E:/Luminar/Test%20automation/sampleform.html");
	}

	@Test
	public void sampleForm() {
		driver.findElement(By.xpath("//*[@onclick='display_alert()']")).click();

		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
//		driver.switchTo().alert().accept();
//      a.dismiss() - cancel

		driver.findElement(By.name("firstname")).sendKeys("Mohammed");
		driver.findElement(By.name("lastname")).sendKeys("Lijas");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
}
