package WebAutomation.automationtool;

import org.testng.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginTest extends baseClass {
	loginPage lp;
	
	@BeforeClass
	public void classSetUp() {
		lp = new loginPage(driver);
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

