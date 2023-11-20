package junitdemo;


import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Test1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void test1() {
    driver.get("https://www.google.co.in/search?q=selenium&sca_esv=579734912&sxsrf=AM9HkKmTPNYGEz0wYMNqtqfzKb6h4WcHVg%3A1699259970056&source=hp&ei=QqZIZd59tOHaug-C96bwAQ&iflsig=AO6bgOgAAAAAZUi0UsctUlq4xrl0rbXPUBE-c6u33n0H&ved=0ahUKEwjeppPX_K6CAxW0sFYBHYK7CR4Q4dUDCAo&uact=5&oq=selenium&gs_lp=Egdnd3Mtd2l6IghzZWxlbml1bTIHECMYigUYJzILEAAYigUYsQMYkQIyCBAAGIoFGJECMgsQABiKBRixAxiRAjILEAAYigUYsQMYkQIyCBAAGIAEGLEDMgUQABiABDIFEAAYgAQyCBAAGIAEGLEDMggQABiABBixA0jiJVAAWJQXcAB4AJABAJgBzgagAcYYqgENMC4zLjEuMC4xLjIuMbgBA8gBAPgBAcICBxAAGIoFGEPCAgoQABiKBRixAxhDwgINEAAYgAQYFBiHAhixA8ICCxAuGIAEGLEDGIMBwgILEAAYigUYsQMYgwE&sclient=gws-wiz");
    driver.manage().window().setSize(new Dimension(1382, 744));
    {
      WebElement element = driver.findElement(By.cssSelector(".gb_Da"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".gb_Da"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
  }
}
