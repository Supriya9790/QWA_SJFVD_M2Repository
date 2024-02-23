package com.TimesheetManagementTool_Project.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTasks extends BaseClass{

	public OpenTasks(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[text()='Projects & Customers']")
	private WebElement projectAndCustomerButton;

	public WebElement getProjectAndCustomerButton() {
		return projectAndCustomerButton;
	}
	
	//click on project and customer button
	public void clickOnProjectAndCustomer()
	{
		projectAndCustomerButton.click();
	}

}
