package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		
		//ChromeDriver
		//FirefoxDriver
		//edgeDriver

		ChromeDriver driver = new ChromeDriver(); // to launch chrome browser

		driver.get("http://www.google.com");   // to launch site/application
		
		String actualTitle = driver.getTitle(); // to get title
		String expectedTitle = "Google";
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

	}

}
