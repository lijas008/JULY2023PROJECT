package testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoIt {

	WebDriver driver;
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		
	}
	@SuppressWarnings("deprecation")
	@Test
	public void AutoItpggrm() throws Exception {
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\USER\\Downloads\\fileUpload.exe");
		Thread.sleep(3000);
	}
}
