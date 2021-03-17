package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POMPac.TestBase;

public class LoginPage extends TestBase {
	@FindBy(name = "email")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement pwd;
	
	@FindBy(xpath ="//div[@class='ui fluid large blue submit button']")	
	WebElement loginBtn;
	
	@FindBy(linkText = "Forgot your password?")
	WebElement forgotlink;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void login( String strName, String strPwd)
	{
		username.sendKeys(strName);
		pwd.sendKeys(strPwd);
		loginBtn.click();
	}
	public void forgetPwd() {
		forgotlink.click();
	}
}
