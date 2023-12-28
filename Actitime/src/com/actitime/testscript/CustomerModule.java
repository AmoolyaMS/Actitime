package com.actitime.testscript;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.Baseclass;
import com.actitime.generic.WebDriverUtils;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplimentation.class)
public class CustomerModule extends Baseclass{
	@Test
	public void createAndDeleteCustomer() throws InterruptedException, EncryptedDocumentException, IOException
	{ 
		int i=3;
//		WebDriverUtils w=new WebDriverUtils();
//		int row=w.getLastrow("createAndDeleteCustomer");
//		for (int i = 1; i <=row; i++) {
		String custemername = f.readdatafromexcel("createAndDeleteCustomer", i, 1);
		String custemerdiscription = f.readdatafromexcel("createAndDeleteCustomer", i, 2);
		HomePage h=new HomePage(driver);
		h.setTasklistPage();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
		int c=1500;
		Thread.sleep(c);
		t.getNewCustomerBtn().click();
		Thread.sleep(c);
		t.getCustomerNameTxtbox().sendKeys(custemername);;
		Thread.sleep(c);
		t.getCustomerDiscriptionTxtbox().sendKeys(custemerdiscription);	
		Thread.sleep(c);
		t.getCustomerDropDown().click();
		Thread.sleep(c);
		t.getSelectedDropDown().click();
		Thread.sleep(c);
		t.getCreatCustomerBtn().click();
		Thread.sleep(c);
		t.getCustomerSettingBtn().click();	
		Thread.sleep(c);
		String actualtext=t.getCreatedCustemerText().getText();
		String expectedtext=custemername;
		AssertJUnit.assertEquals(actualtext, expectedtext);
		Thread.sleep(c);
		//System.out.println(actualtext);
		t.getActionsBtn().click();	
		Thread.sleep(c);
		t.getDeleteBtn().click();	Thread.sleep(1000);
		t.getDeleteConfirmBtn().click();
		Thread.sleep(c);
		}


//	}

}
