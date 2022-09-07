package pages;

import org.openqa.selenium.By;

import BaseClass.ProjectSpecificMethod;

public class LeadsPage extends ProjectSpecificMethod{
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println("merge Conflict");
		
	}
}
