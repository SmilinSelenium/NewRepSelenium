package testScripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMPac.TestBase;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class ContactTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	@BeforeMethod
	public void setup() {
		TestBase.initialize();
		
	}
	@Test
	public void newContactTest() {
		loginpage =  new LoginPage();
		homepage = new HomePage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		boolean validUser =  homepage.isValidUser();
		Assert.assertTrue(validUser);
		
	}
	
	
	
	

}
