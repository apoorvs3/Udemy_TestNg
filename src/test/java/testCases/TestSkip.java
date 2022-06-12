package testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestSkip extends BaseTest {
	
	@Test
	public void isSkip() {
		
		throw new SkipException("skipping as condition not met");
		
	}
}
