package junitdemo;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoMationExample {

	ChromeDriver driver;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://automationexercise.com/login");
	}

	@Test
	public void login() {
		
		// -------------------LOGIN PAGE -------------------------------------------------------------------------------
		driver.findElement(By.name("name")).sendKeys("Mohammed Lijas");
		driver.findElement(By.xpath("//*[@data-qa='signup-email']")).sendKeys("lijas008@gmail.com");
		driver.findElement(By.xpath("//*[@data-qa='signup-button']")).click();
		//----------------------------------------------------------------------------------------------------------------

		//--------------------------------REGISTRATION SECTION--------------------------------------------------------------
		
		driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("We@1245");

		WebElement days = driver.findElement(By.xpath("//*[@id=\"days\"]"));
		Select dayDetails = new Select(days);
		dayDetails.selectByValue("8");

		WebElement month = driver.findElement(By.xpath("//*[@id=\"months\"]"));
		Select monthDetails = new Select(month);
		monthDetails.selectByValue("4");

		WebElement year = driver.findElement(By.xpath("//*[@id=\"years\"]"));
		Select yearDetails = new Select(year);
		yearDetails.selectByValue("1997");

		driver.findElement(By.xpath("//*[@id=\"newsletter\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"optin\"]")).click();
		
		
		//------------------ADDRESS INFORMATION-----------------------------------------------------------

		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Mohammed");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Lijas");
		driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("Luminar Technolab");
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Abc");
		driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("sf");
		
		WebElement country = driver.findElement(By.xpath("//*[@id=\"country\"]"));
		Select countryDetails = new Select(country);
		countryDetails.selectByValue("India");
		
		driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Kerala");
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Perinthalmanna");
		driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("679322");
		driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("8891140696");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
		
		
		//-------------------------------------------------------------------------------------------------------
		

	}

}
