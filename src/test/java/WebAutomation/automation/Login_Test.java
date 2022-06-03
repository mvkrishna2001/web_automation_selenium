package WebAutomation.automation;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Login_Test extends BaseClass{

	@Test
	public void loginTest() {
		driver.get(baseUrl);
		System.out.println(baseUrl);
		
		loginPage lp = new loginPage(driver);
		
		lp.setUserName(username);
		lp.setPassWord(password);
		
		lp.clickLogin();
		
		if (driver.getTitle().equals("Tool Management System")) 
		{
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.assertTrue(false);
		}
	}
}
