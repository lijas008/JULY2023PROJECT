package junitdemo;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;

public class ResponseCode {
	ChromeDriver driver;
	String baseUrl = "https://www.rediff.com";

	@Before
	public void setup() {
		driver = new ChromeDriver();
		

	}
	@Test
	public void test() throws Exception {
		URL url = new URL(baseUrl);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.connect();
		System.out.println("Rspone= "+con.getResponseCode());
	}

}
