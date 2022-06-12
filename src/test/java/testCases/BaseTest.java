package testCases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	@BeforeSuite
	public void setup() {
		System.out.println("Inititalize everything");
	}
	
	@AfterSuite
	public void TearDown() {
		System.out.println("Quit everything");
	}
}
