package testngdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePickerElement {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.trivago.com");
		driver.manage().window().maximize();
	}

	@Test
	public void test() {
		driver.findElement(
				By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div/fieldset/button[1]")).click();
		datePickerMethod("January 2024","15");
		datePickerMethod("January 2024","18");
		

	}

	private void datePickerMethod(String expmonth, String expdate) {

		while (true) {
			String month = driver.findElement(By.xpath(
					"//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3"))
					.getText();

			if (month.equals(expmonth)) {
				System.out.println("month :" + month);
				break;
			} else {
				driver.findElement(By.xpath(
						"//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]"))
						.click();
			}
		}
		List<WebElement> allDates = driver.findElements(By.xpath(
				"//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
		for(WebElement dateElement:allDates) {
			String date = dateElement.getText();
			if(date.equals(expdate)) {
				dateElement.click();
				break;
			}
		}
	}

}
