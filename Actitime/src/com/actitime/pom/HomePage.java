package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id = "logoutLink")
	private WebElement logoutBtn;
	@FindBy(linkText =  "USERS")
	private WebElement userListBtn;
	@FindBy(linkText = "TASKS")
	private WebElement taskListBtn;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setLogout() throws InterruptedException {
		logoutBtn.click();
		Thread.sleep(2000);
	}
	public void setUserlistPage() {
		userListBtn.click();
		
	}
	public void setTasklistPage()
	{
		taskListBtn.click();
	}
	
}
