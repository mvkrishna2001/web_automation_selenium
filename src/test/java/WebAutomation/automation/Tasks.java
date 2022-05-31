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

public class Tasks {
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
	public void createTask() {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/ul/li[8]/a")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[1]/div/div/div[1]/a")).click();
		
		WebElement taskTitle = driver.findElement(By.id("title"));
		taskTitle.clear();
		taskTitle.sendKeys("Task Number - ",id);
		
		WebElement taskDesc = driver.findElement(By.id("description"));
		taskDesc.clear();
		taskDesc.sendKeys("Task Number - ",id);
		
		WebElement taskAttach = driver.findElement(By.id("image"));
		taskAttach.clear();
		taskAttach.sendKeys("C:\\Users\\USER\\Desktop\\testng-introduction.png");
		
		WebElement startDate = driver.findElement(By.id("start_date"));
		startDate.clear();
		startDate.sendKeys("30-05-2022");
		
		WebElement endDate = driver.findElement(By.id("end_date"));
		endDate.clear();
		endDate.sendKeys("28-06-2022");
		
		
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div/div[6]/button")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[2]/td[6]/a[2]")).click();
		
		Select SelectMenu = new Select(driver.findElement(By.id("select_common_type")));
		
		SelectMenu.selectByValue("1");
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div/div[5]/button")).click();
		
	}
	
	@AfterMethod
	public void quitDriver() {
		driver.close();
	}
}
