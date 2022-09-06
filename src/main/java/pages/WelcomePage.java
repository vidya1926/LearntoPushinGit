package pages;

import org.openqa.selenium.By;

import BaseClass.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod  {

	
	public MyHomePage clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}
		
	public Loginpage clickLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new Loginpage();
	}
	
	
}
