package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftyAssert extends BaseTest {
	@Test
	public void validateTitles() {
		String expected_title = "yahoo.com";
		String actual = "yahoo.com";
		SoftAssert asserts = new SoftAssert();
		System.out.println("before assert");
		Assert.assertEquals(false, true, "cannot register user");
		System.out.println("after assert");
		Assert.assertEquals(false, true, "expectedd output not found for login");
		System.out.println("last assert");
		asserts.assertAll();
		
	}
}
