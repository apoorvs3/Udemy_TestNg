package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases extends BaseTest {
	@BeforeTest
	public void creatingDbConnection() {
		System.out.println("Creating DB connection");
	}
	
	@BeforeMethod
	public void setup() {
		System.out.println("Launching browser");
	}
	
	@Test(priority=2, groups="sanity")
	public void doLogin() {
		System.out.println("Executing login test");
	}
	
	@Test(priority=1)
	public void doUserReg() {
		System.out.println("Executing user register");
	}
	
	@AfterMethod
	public void TearDown() {
		System.out.println("Closing browser");
	}
	
	@AfterTest
	public void closingDbConnection() {
		System.out.println("Clsoing DB connection");
	}
}
