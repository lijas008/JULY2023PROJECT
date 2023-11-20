package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPage {

	WebDriver driver;
	
//	By fbEmail = By.id("email");
//	By fbPass = By.id("pass");
//	By fbLoginBtn = By.name("login");
	
	@FindBy(id = "email")
	WebElement fbEmail;
	
	@FindBy(id = "pass")
	WebElement fbPass;
	
	@FindBy(name = "login")
	WebElement fbLoginBtn;
	
	
	public FbLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void setValues(String email, String pswd) {
		
//		driver.findElement(fbEmail).sendKeys(email);
//		driver.findElement(fbPass).sendKeys(pswd);
		
		fbEmail.sendKeys(email);
		fbPass.sendKeys(pswd);
	}
	
	
	public void login() {
//		driver.findElement(fbLoginBtn).click();
		
		fbLoginBtn.click();
	}
}
