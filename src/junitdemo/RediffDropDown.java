package junitdemo;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffDropDown {
	ChromeDriver driver;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

	}
	@Test
	public void dropdown() {
		
		WebElement day = driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
		Select dayDetails = new Select(day);
		dayDetails.selectByValue("02");
		List<WebElement> dayCount = dayDetails.getOptions();
		System.out.println("Day "+dayCount.size());
		
		
		WebElement month = driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
		Select monthDetails = new Select(month);
		monthDetails.selectByValue("01");
		List<WebElement> monthCount = monthDetails.getOptions();
		System.out.println("Month "+ monthCount.size());
		
		
		WebElement year = driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
		Select yearhDetails = new Select(year);
		yearhDetails.selectByValue("1997");
		List<WebElement> yearCount = monthDetails.getOptions();
		System.out.println("Year"+yearCount.size());
		
		
		
	
		
		
	}
}
