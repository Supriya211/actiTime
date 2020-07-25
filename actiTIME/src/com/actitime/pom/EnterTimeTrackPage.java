package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
@FindBy(id="logoutLink")
private WebElement logout;
@FindBy(xpath="//a[@class='content tasks']")
private WebElement TasksTab;

public EnterTimeTrackPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getLogout() {
	return logout;
}
public WebElement getTasksTab() {
	return TasksTab;
}

}
