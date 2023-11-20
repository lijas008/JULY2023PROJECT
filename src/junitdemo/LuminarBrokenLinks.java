package junitdemo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LuminarBrokenLinks {
	
	ChromeDriver driver;
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.luminartechnolab.com");
		
	}
	
	@Test
	public void respcCode() {
		List<WebElement> li = driver.findElements(By.tagName("a"));
		for(WebElement link:li) {
			String links = link.getAttribute("href");
			String text = link.getText();
			verifyLink(links);
		}
	}

	private void verifyLink(String links) {
		try {
			URL url = new URL(links);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect();
			System.out.println(con.getResponseCode());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
