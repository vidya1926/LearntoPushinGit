package testcases;

import org.testng.annotations.Test;

import BaseClass.ProjectSpecificMethod;
import pages.Loginpage;

public class Logintestcase extends ProjectSpecificMethod{
	
	@Test
	public void runLoginPage() {
		
		Loginpage lp=new Loginpage();
		lp.enterUsername().enterPassword().clickLogin().clickLogout();
		
	}
	

}
