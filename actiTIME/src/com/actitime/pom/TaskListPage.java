package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//a/div[1][.='Add New']")
	private WebElement addnewbtn;
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newcustomerbtn;
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customernametbx;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement Descriptiontbx;
	@FindBy(xpath="(//div[.='- Select Customer -'])[2]")
	private WebElement selectcustomerdropdown;
	@FindBy(xpath="//div[.='Our company' and @class='itemRow cpItemRow selected']")
	private WebElement ourcompany;
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createcustomerbtn;
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement verifycostomertext;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getAddnewbtn() {
		return addnewbtn;
	}
	public WebElement getNewcustomerbtn() {
		return newcustomerbtn;
	}
	public WebElement getCustomernametbx() {
		return customernametbx;
	}
	public WebElement getDescriptiontbx() {
		return Descriptiontbx;
	}
	public WebElement getSelectcustomerdropdown() {
		return selectcustomerdropdown;
	}
	public WebElement getOurcompany() {
		return ourcompany;
	}
	public WebElement getCreatecustomerbtn() {
		return createcustomerbtn;
	}
	public WebElement getVerifycostomertext() {
		return verifycostomertext;
	}
	

}
