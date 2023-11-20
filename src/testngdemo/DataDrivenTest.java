package testngdemo;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDrivenTest {

	ChromeDriver driver;

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

	}

	@Test
	public void test() throws Exception {
		FileInputStream ob = new FileInputStream("E:\\Luminar\\Test automation\\FBTestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(ob);
		XSSFSheet sh = wb.getSheet("Sheet1");
		int row = sh.getLastRowNum();
		for(int i=1;i<=row;i++) {
		String email =	sh.getRow(i).getCell(0).getStringCellValue();
		String pswd = sh.getRow(i).getCell(1).getStringCellValue();
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys(pswd);
		driver.findElement(By.name("login")).click();
		driver.navigate().back();
		}
	}

}
