package com.actitime.testscript;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.Baseclass;
import com.actitime.generic.WebDriverUtils;
import com.actitime.pom.HomePage;
import com.actitime.pom.UserListPage;
@Listeners(com.actitime.generic.ListenerImplimentation.class)
public class UserModule extends Baseclass {
	@Test
	public void createAndDeleteUser() throws InterruptedException, EncryptedDocumentException, IOException
	{
		WebDriverUtils w=new WebDriverUtils();
		int row=w.getLastrow("createAndDeleteUser");
		for (int i = 1; i <= row; i++) {
		String firstName = f.readdatafromexcel("createAndDeleteUser", i, 1);
		String lastName = f.readdatafromexcel("createAndDeleteUser", i, 2);
		String email = f.readdatafromexcel("createAndDeleteUser", i, 3);
		String username = f.readdatafromexcel("createAndDeleteUser", i, 4);
		String password = f.readdatafromexcel("createAndDeleteUser", i, 5);
		String retryPassword = f.readdatafromexcel("createAndDeleteUser", i, 6);
		String expectedText= f.readdatafromexcel("createAndDeleteUser", i, 7);
		HomePage h=new HomePage(driver);
		 
		int c=500;
		 h.setUserlistPage();
		 Thread.sleep(c);
		//UserListPage u=new UserListPage(driver);
		 UserListPage u=new UserListPage();
		 PageFactory.initElements(driver, u);
		
	    Thread.sleep(c);
	   u.getAdduserbtn().click(); Thread.sleep(c);
		u.getFirstNameTxb().sendKeys(firstName);Thread.sleep(c);
		u.getLastNameTxb().sendKeys(lastName);Thread.sleep(c);
		u.getEmaiLTxb().sendKeys(email);Thread.sleep(c);
		u.getUsernameTxb().sendKeys(username);Thread.sleep(c);
		u.getPasswordTxb().sendKeys(password);Thread.sleep(c);
		u.getRetypePasswordTxb().sendKeys(retryPassword);Thread.sleep(c);
		u.getCreateBtn().click();Thread.sleep(c);
		String expectedtext =expectedText; 
		System.out.println(expectedtext);
		Thread.sleep(c);
		String actualtext=u.getCreatedUser().getText();
		System.out.println(actualtext);
		Thread.sleep(c);
		Assert.assertEquals(actualtext,expectedtext);Thread.sleep(c);
		u.getCreatedUser().click();
		Thread.sleep(c);
		u.getDeleteBtn().click();Thread.sleep(c);
		driver.switchTo().alert().accept();
		
		}

	}
}

