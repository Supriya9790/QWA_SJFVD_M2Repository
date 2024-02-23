package com.TimesheetManagementTool_Project.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.TimesheetManagementTool_Project.GenericLib.BaseTest;

public class CreateNewProjectPage extends BaseClass{

	public CreateNewProjectPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//select[@name='customerId']")
	private WebElement customerDropdown;
	
	@FindBy(xpath = "//input[@name='name']")
	private WebElement projectNameTextField;
	
	@FindBy(xpath = "//input[@name='createProjectSubmit']")
	private WebElement createProjectButton;

	public WebElement getCustomerTextField() {
		return customerDropdown;
	}

	public WebElement getProjectNameTextField() {
		return projectNameTextField;
	}

	public WebElement getCreateProjectButton() {
		return createProjectButton;
	}
	
	//create project
	public void createProject(String customerName, String projectName,WebDriver driver)
	{
		CreateNewCustomerPage page = new CreateNewCustomerPage(driver);
		page.getCustomerNameTextField().sendKeys(customerName);
		page.getCreateCustomerButton().click();
		ProjectAndCustomerPage pcp = new ProjectAndCustomerPage(driver);
		pcp.clickOnCreateNewProject();
		Select s = new Select(customerDropdown);
		customerDropdown.click();
		s.selectByVisibleText(customerName);
		projectNameTextField.sendKeys(projectName);
		createProjectButton.click();
	}

}
