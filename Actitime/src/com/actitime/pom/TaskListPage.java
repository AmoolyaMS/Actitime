package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addNewBtn;
	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newCustomerBtn;
	@FindBy(id = "customerLightBox_nameField")
	private WebElement customerNameTxtbox;
	@FindBy(id = "customerLightBox_descriptionField")
	private WebElement customerDiscriptionTxtbox;
	@FindBy(id = "customerLightBox_customerSelectorPlaceholder")
	private WebElement customerDropDown;
	@FindBy(xpath = "//ul[@class='x-menu-list']//../ul/li[5]/a")
	private WebElement selectedDropDown;
	@FindBy(id = "customerLightBox_commitBtn")
    private WebElement creatCustomerBtn;
	@FindBy(xpath = "//div[@class='node allCustomersNode notSelected']//..//..//../div[1]/div[2]/div[2]/div[4]")
	private WebElement customerSettingBtn;
	@FindBy(xpath = "(//div[@class='nameInfo editable'])[1]")
	private WebElement createdCustemerText;
	@FindBy(xpath = "//div[@class='customerNamePlaceHolder']//../div[4]")
	private WebElement actionsBtn;
	@FindBy(xpath = "//div[contains(@style,'display: inline')]//../div[3]/div")
	private WebElement deleteBtn;
	@FindBy(id = "customerPanel_deleteConfirm_submitTitle")
	private WebElement deleteConfirmBtn;
	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getAddNewBtn() {
		return addNewBtn;
	}
	public WebElement getNewCustomerBtn() {
		return newCustomerBtn;
	}
	public WebElement getCustomerNameTxtbox() {
		return customerNameTxtbox;
	}
	public WebElement getCustomerDiscriptionTxtbox() {
		return customerDiscriptionTxtbox;
	}
	public WebElement getCustomerDropDown() {
		return customerDropDown;
	}
	public WebElement getSelectedDropDown() {
		return selectedDropDown;
	}
	public WebElement getCreatCustomerBtn() {
		return creatCustomerBtn;
	}
	public WebElement getCustomerSettingBtn() {
		return customerSettingBtn;
	}
	public WebElement getCreatedCustemerText() {
		return createdCustemerText;
	}
	public WebElement getActionsBtn() {
		return actionsBtn;
	}
	public WebElement getDeleteBtn() {
		return deleteBtn;
	}
	public WebElement getDeleteConfirmBtn() {
		return deleteConfirmBtn;
	}
	
	

}

