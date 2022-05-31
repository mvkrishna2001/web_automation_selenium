package WebAutomation.automation;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Projects {
	
	static WebDriver driver;
	static String id;
	
	@BeforeMethod
	public static void driverSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Random random = new Random();
		id = String.valueOf(random.nextInt(10000));
		driver.get("https://tms.pisystindia.com/admin/login");
		
		WebElement user = driver.findElement(By.id("admin_email"));
		user.clear();
		user.sendKeys("sales.infinitycorp@gmail.com");
		
		WebElement passcode = driver.findElement(By.id("admin_password"));
		passcode.clear();
		passcode.sendKeys("123456");
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/button")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void test1_createProject() {
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/ul/li[7]/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a[1]")).click();
		
		WebElement projectName = driver.findElement(By.id("project_name"));
		projectName.clear();
		projectName.sendKeys("Testing Project ",id);
		
		WebElement projectCode = driver.findElement(By.id("project_code"));
		projectCode.clear();
		projectCode.sendKeys(id);
		
		WebElement projectDesc = driver.findElement(By.id("project_description"));
		projectDesc.clear();
		projectDesc.sendKeys("This Project is created for testing purposes");
		
		WebElement startDate = driver.findElement(By.id("start_date"));
		startDate.clear();
		startDate.sendKeys("30-05-2022");
		
		WebElement endDate = driver.findElement(By.id("end_date"));
		endDate.clear();
		endDate.sendKeys("28-06-2022");
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div/div[6]/button")).click();
		
	}
	
	@Test
	public void test2_allocateProjectToCompany() {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/ul/li[7]/a")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a[2]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a")).click();
		Select SelectMenu = new Select(driver.findElement(By.id("project_id")));
		
		SelectMenu.selectByValue("4");
		driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"postme1\"]")).click();
	}

	
	@AfterMethod
	public void quitDriver() {
		driver.close();
	}
	
}
