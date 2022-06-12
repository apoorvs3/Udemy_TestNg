package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependencies extends BaseTest {
	
	@Test(priority=1, groups="functional")
	public void doUserReg() {
		System.out.println("Executing user register");
		//AssertJUnit.fail("User not registered let's get this message");
		
	}
	
	@Test(priority=2, dependsOnMethods = {"doUserReg", "ThirdTest"}, groups="functional")
	public void doLogin() {
		System.out.println("Executing login test");
	}
	
	//always run for soft dependency
	@Test(priority=3,dependsOnMethods = {"doUserReg"}, alwaysRun=true, groups={"smoke","functional"})
	public void ThirdTest() {
		System.out.println("executing 3rd test");
	}
	
	@Test(priority=4, groups="smoke")
	public void FourthTest() {
		System.out.println("executing 4th test");
	}
}
