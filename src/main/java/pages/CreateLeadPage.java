package pages;

import org.openqa.selenium.By;

import BaseClass.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod {

	
	public void enterCname() {
		//Enter the CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TL");
		
	}	
	
	public void enterFname() {
			//Enter the First name

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");
	}
	
	public void enterLname() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
	}
	
	public void clickCreate() {
		driver.findElement(By.className("smallSubmit")).click();
	}
	
	
}
