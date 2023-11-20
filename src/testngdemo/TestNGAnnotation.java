package testngdemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {
	
	@BeforeTest
	public void setUp() {
		System.out.println("Browser details");
	}
	
	@BeforeMethod
	public void urlDetails() {
		System.out.println("Url details");
	}
	
	@Test(groups = {"smoke"})
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test(groups = {"smoke"})
	public void test2() {
		System.out.println("Test 2");
	}
	@Test(groups = {"sanity","smoke"})
	public void test3() {
		System.out.println("Test 3");
	}
	@Test(groups = {"sanity"})
	public void test4() {
		System.out.println("Test 4");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("After method");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
}
