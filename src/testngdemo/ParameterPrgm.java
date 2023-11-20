package testngdemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPrgm {

	@Parameters("v")
	@Test
	public void test(String v) {
		System.out.println(v);
	}
	
}
