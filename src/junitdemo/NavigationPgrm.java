package junitdemo;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationPgrm {
	ChromeDriver driver;
//	String baseUrl = "https://www.amazon.in";

	@Before
	public void setUp() {
		driver = new ChromeDriver();
//		driver.get(baseUrl);
		

	}

	@Test
	public void navigateTo() throws Exception {
		driver.navigate().to("https://www.flipkart.com");
//		URL url = new URL(baseUrl);
//		
//		HttpURLConnection con = (HttpURLConnection) url.openConnection();
//		con.connect();
//		System.out.println(con.getResponseCode());
//		System.out.println(con.getResponseMessage());
		
	}

}
