package pages;

import org.openqa.selenium.By;

import BaseClass.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod {

	public void verifyFname() {
		
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text);
		
	}
	
	
	
}
