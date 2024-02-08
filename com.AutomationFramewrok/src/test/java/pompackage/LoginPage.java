package pompackage;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")
	private WebElement usernameTextField;
	
	@FindBy(name = "pwd" )
	private WebElement passwordTextField;
	
	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement loggedInCheckBox;
	
	@FindBy(id = "loginButton")
	private WebElement loginButton;

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoggedInCheckBox() {
		return loggedInCheckBox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void loginIntoActitime(String username, String password)
	{
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loggedInCheckBox.click();
		usernameTextField.clear();
	}
	

}
