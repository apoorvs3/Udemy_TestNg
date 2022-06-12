package regression;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependencies {
	
	@Test(priority=1)
	public void doUserReg() {
		System.out.println("Executing user register");
		AssertJUnit.fail("User not registered let's get this message");
		
	}
	
	@Test(priority=2, dependsOnMethods = {"doUserReg", "ThirdTest"})
	public void doLogin() {
		System.out.println("Executing login test");
	}
	
	//always run for soft dependency
	@Test(priority=3,dependsOnMethods = {"doUserReg"}, alwaysRun=true)
	public void ThirdTest() {
		System.out.println("executing 3rd test");
	}
	
	@Test(priority=4)
	public void FourthTest() {
		System.out.println("executing 4th test");
	}
}
