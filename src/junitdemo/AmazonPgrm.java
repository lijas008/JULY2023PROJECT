package junitdemo;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AmazonPgrm {

	ChromeDriver driver;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
	}

	@Test
	public void elementScreenShot() throws Exception {
		
		WebElement amazonLogo = driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]"));
		File src = amazonLogo.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("./Screenshots/amazonlogo1.png"));
	}
}
