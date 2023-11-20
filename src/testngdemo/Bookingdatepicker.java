package testngdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bookingdatepicker {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.booking.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
	}

	@Test
	public void test() {
		driver.findElement(
				By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div")).click();
		datePickerMethod("November 2023","5");
		datePickerMethod("December 2023","4");
		

	}

	private void datePickerMethod(String expmonth, String expdate) {

		while (true) {
			String month = driver.findElement(By.xpath(
					"//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[2]/h3"))
					.getText();

			if (month.equals(expmonth)) 
			{
//				System.out.println("month :" + month);
				break;
			} 
			else 
			{ 
				driver.findElement(By.xpath(
						"//*[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 f671049264 deab83296e f4552b6561 dc72a8413c f073249358']"))
						.click();
			}
		}
//		List<WebElement> allDates = driver.findElements(By.xpath(
//				"//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[2]/table/tbody/tr/td/span"));
		
		List<WebElement> allDates = driver.findElements(By.xpath(
				"//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[2]/table/tbody/tr/td/span"));
		for(WebElement dateElement:allDates) {
			String date = dateElement.getText();
			if(date.equals(expdate)) {
				dateElement.click();
				break;
			}
		}
	}
}