package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbCreatePage {
	
	WebDriver driver;
	
	By createPage = By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By getStarted = By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div");
	
	
	public FbCreatePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public void createPageClick() {
		driver.findElement(createPage).click();
	}
	
	
	public void getStartedClick() {
		driver.findElement(getStarted).click();
	}

}
