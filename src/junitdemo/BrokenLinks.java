package junitdemo;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;

public class BrokenLinks {
	ChromeDriver driver;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
	}

	@Test
	public void response() {
		List<WebElement> li = driver.findElements(By.tagName("a"));
		for (WebElement links : li) {
			String link = links.getAttribute("href");

			verifyLinks(link);

		}
	}

	private void verifyLinks(String link) {

		try {
			URL url = new URL(link);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect();

			if (con.getResponseCode() == 200) {
				System.out.println("succes for 200 " + link);
			} else if (con.getResponseCode() == 404) {
				System.out.println("Error for 404 " + link);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
