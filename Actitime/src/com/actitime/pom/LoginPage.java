package com.actitime.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement unTxb;  
	@FindBy(name="pwd")
	private WebElement pwdTxb;
	@FindBy(partialLinkText = "Login")
	private WebElement loginBtn;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setLogin(String un,String pwd) {
		
		unTxb.sendKeys(un);
		pwdTxb.sendKeys(pwd);
		loginBtn.click();

	}	



}
