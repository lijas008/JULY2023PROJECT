package testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUpload {
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
	}
	
	
	@Test
	public void fileUpload() {
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\USER\\Pictures\\Screenshots\\Screenshot (207).png");
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		String subBtnTxt = driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).getText();
		if(subBtnTxt.equals("Submit")) {
			System.out.println("Submit");
		}
		else {
			System.out.println("Failed");
		}
		
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	}
}
