package com.actitime.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generics.ListenerImplementation.class)
public class CreateCustomer extends BaseClass {
	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
		
		 String customername = f.getExcelData("Sheet1", 1, 0);
		 String description = f.getExcelData("Sheet1", 1, 1);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		//click on taskstab
		e.getTasksTab().click();
	TaskListPage t=new TaskListPage(driver);
	//click on add new button
	t.getAddnewbtn().click();
	//click on new customer menu
	t.getNewcustomerbtn().click();
	//enter customer name
	t.getCustomernametbx().sendKeys(customername);
	//enter description
	t.getDescriptiontbx().sendKeys(description);
	//click on select customer dropdown
	t.getSelectcustomerdropdown().click();
	//select our company
	t.getOurcompany().click();
	//click on create customer button
	t.getCreatecustomerbtn().click();
	Thread.sleep(5000);
	String actualtext = t.getVerifycostomertext().getText();
	Assert.assertEquals(actualtext, customername);
	
		
	}
	
	

}
