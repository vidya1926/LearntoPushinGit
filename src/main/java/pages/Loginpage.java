package pages;

import org.openqa.selenium.By;

import BaseClass.ProjectSpecificMethod;

public class Loginpage extends ProjectSpecificMethod {

	// action+WebEle
	public Loginpage enterUsername() {
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
	//	Loginpage lp=new Loginpage();
		//return lp;
		return this;
	}

	public  Loginpage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}

	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}

}
