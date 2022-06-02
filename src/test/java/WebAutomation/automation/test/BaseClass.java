package WebAutomation.automation.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import WebAutomation.automation.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static String baseUrl = "https://tms.pisystindia.com/admin/login";
	public static String username = "sales.infinitycorp@gmail.com";
	public static String password = "123456";
	
	public static WebDriver driver;
	
	@BeforeClass
	static void setupDriver() {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//webdrivers//chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void sleep(long ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void loginUser() {
		driver.manage().window().maximize();
		driver.get(baseUrl);
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassWord(password);
		lp.clickLogin();
		if(driver.getTitle().equals("Tool Management System")) {
			Assert.assertTrue(true);
		}else {
			Assert.assertFalse(false);
		}
		sleep(5000);
	}
	
	@AfterClass
	static void tearDown() {
		driver.quit();
	}
	
}
