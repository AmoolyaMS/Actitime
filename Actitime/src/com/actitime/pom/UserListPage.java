package com.actitime.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage {
@FindBy(className = "buttonText")
private WebElement addUserBtn;
@FindBy(name = "firstName")
private WebElement firstNameTxb;
@FindBy(id = "userDataLightBox_lastNameField")
private WebElement lastNameTxb;
@FindBy(name = "email")
private WebElement emaiLTxb;
@FindBy(id = "userDataLightBox_usernameField")
private WebElement usernameTxb;
@FindBy(name = "password")
private WebElement passwordTxb;
@FindBy(name = "passwordCopy")
private WebElement retypePasswordTxb;
@FindBy(id = "userDataLightBox_commitBtn")
private WebElement createBtn;
@FindBy(id = "userDataLightBox_deleteBtn")
private WebElement deleteBtn;
@FindBy(className = "userNameSpan")
private WebElement createdUser;
//public UserListPage(WebDriver driver) {
//	PageFactory.initElements(driver, this);
//}

public WebElement getAdduserbtn() {
	return addUserBtn;
}
public WebElement getFirstNameTxb() {
	return firstNameTxb;
}
public WebElement getLastNameTxb() {
	return lastNameTxb;
}
public WebElement getEmaiLTxb() {
	return emaiLTxb;
}
public WebElement getUsernameTxb() {
	return usernameTxb;
}
public WebElement getPasswordTxb() {
	return passwordTxb;
}
public WebElement getRetypePasswordTxb() {
	return retypePasswordTxb;
}
public WebElement getCreateBtn() {
	return createBtn;
}
public WebElement getDeleteBtn() {
	return deleteBtn;
}
public WebElement getCreatedUser() {
	return createdUser;
}

}

