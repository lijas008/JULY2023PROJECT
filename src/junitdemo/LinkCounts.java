package junitdemo;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCounts {
	ChromeDriver driver;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");

	}

	@Test
	public void linkCount() {
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println("total links are: " + li.size());
		for (WebElement links : li) {
			System.out.println(links.getText() + " - " + links.getAttribute("href")); // getText() gives text respect to
																						// link, getAttribute() gives
																						// output links
		}
	}

}
