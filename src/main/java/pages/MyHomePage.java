package pages;

import org.openqa.selenium.By;

import BaseClass.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod {

	
	public void clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
	}
	
}
