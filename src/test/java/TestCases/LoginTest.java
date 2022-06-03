package TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import WebAutomation.automation.LoginPage;

public class LoginTest extends BaseClass {
	LoginPage lp;
	
	@BeforeClass
	public void classSetUp() {
		lp = new LoginPage(driver);
	}
	
	@Test
	public void testloginUser() {
		driver.get(baseUrl);
		lp.setUserName(username);
		lp.setPassWord(password);
		lp.clickLogin();
		if(driver.getTitle().equals("Tool Management System")) {
			Assert.assertTrue(true);
		}else {
			Assert.assertFalse(false);
		}
		
	}
	
}
