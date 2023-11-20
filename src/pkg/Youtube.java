package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		String src = driver.getPageSource();
		
		String actualTitle = driver.getTitle();
		String expectedtitle = "YouTube";
		
		if(actualTitle.equals(expectedtitle)) {
			System.out.println("The title is right");
		}
		else {
			System.out.println("Title is wrong");
		}
		
		if(src.contains("Shorts")) {
			System.out.println("There is shorts");
		}
		else {
			System.out.println("There is no shorts");
		}
	}

}
