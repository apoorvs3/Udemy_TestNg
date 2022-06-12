package regression;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertionsCheck {
	@Test
	public void validateTitles() {
		String expected_title = "yahoo.com";
		String actual = "yahoo.com";
		Assert.assertEquals(expected_title, actual);
//		Assert.assertTrue(false, "not found this thing");
		
		
	}
}
