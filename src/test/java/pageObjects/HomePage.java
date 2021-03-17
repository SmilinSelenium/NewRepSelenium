package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POMPac.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath= "//span[@class='user-display']")
	WebElement userlogged;
	@FindBy(className = "ui linkedin button")
	WebElement newContactBtn;
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public boolean isValidUser() {
		System.out.println("User displayed : " + userlogged.isDisplayed());
		return userlogged.isDisplayed();
	}
	public void createNewContact() {
		newContactBtn.click();
	}
}
