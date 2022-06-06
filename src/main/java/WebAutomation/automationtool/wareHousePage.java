package WebAutomation.automationtool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.*;
import org.openqa.selenium.WebElement;

public class wareHousePage {
WebDriver ldriver;
	
	public wareHousePage(WebDriver driver){
		ldriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='https://tms.pisystindia.com/admin/inventory'][normalize-space()='Warehouse Inventory']")
	WebElement inventoryTab;
	
	@FindBy(xpath="//h1[normalize-space()='Warehouse Inventory']")
	WebElement verifyInventoryTab;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement searchInventories;
	
	@FindBy(xpath="//*[@id=\'tool_quantity\']")
	WebElement toolQuantity;
	
	@FindBy(xpath="//*[@id=\'example\']/tbody/tr[1]/td[5]/a")
	WebElement updateInventory;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div/div/div/div[4]/button")
	WebElement submitButton;
	
	@FindBy(xpath="//*[@id=\'tool_comment\']")
	WebElement toolComment;
	
	@FindBy(xpath="//tr[@class='odd']//td[contains(text(),'Drill')]")
	WebElement verifySearchInventory;
	
	@FindBy(xpath="//h1[normalize-space()='Edit Inventory Stock']")
	WebElement verifyUpdatePage;
	
	public void clickinvenoryTab() {
		inventoryTab.click();
	}
	
	public String getwareHousePageIsOpenedText() {
		return verifyInventoryTab.getText();
	}
	
	public void searchInventories(String searchvalue) {
		searchInventories.sendKeys(searchvalue);
	}
	
	public void clickUpdateInventory() {
		updateInventory.click();
	}
	
	public void updateToolQuantity(String updateQuantity) {
		toolQuantity.sendKeys(updateQuantity);
	}
	
	public void clickSubmit() {
		submitButton.click();
	}
	
	public void updateToolComment(String comment) {
		toolComment.sendKeys(comment);
	}
	
	public void getBack() {
		ldriver.navigate().back();
	}
	
	public String getSearchInventoryResult() {
		return verifySearchInventory.getText();
	}
	
	public String getUpdateInventoryPageIsOpenedText() {
		return verifyUpdatePage.getText();
	}
}

