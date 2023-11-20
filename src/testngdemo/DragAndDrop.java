package testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop {
	ChromeDriver driver;
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void dragDrop() {
		WebElement bank = driver.findElement(By.xpath("//*[@id=\"credit2\"]"));
		WebElement debitAccount = driver.findElement(By.xpath("//*[@id=\"bank\"]"));
		WebElement debit5000 = driver.findElement(By.xpath("//*[@id=\"fourth\"]"));
		WebElement debotAmountField = driver.findElement(By.xpath("//*[@id=\"amt7\"]"));
		
		
		WebElement sales = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement creditAccount = driver.findElement(By.xpath("//*[@id='loan']"));
		WebElement credit5000 = driver.findElement(By.xpath("//*[@id=\"fourth\"]"));
		WebElement creditAmountField = driver.findElement(By.xpath("//*[@id=\"amt8\"]"));
		
		
		Actions act = new Actions(driver);
		act.dragAndDrop(bank, debitAccount);
		act.dragAndDrop(debit5000, debotAmountField);
		act.dragAndDrop(sales, creditAccount);
		act.dragAndDrop(credit5000, creditAmountField);
		act.perform();
		
		
	}

}
