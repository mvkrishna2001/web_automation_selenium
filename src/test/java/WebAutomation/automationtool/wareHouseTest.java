package WebAutomation.automationtool;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class wareHouseTest extends baseClass {
	wareHousePage whp;
	
	@BeforeClass
	public void classSetUp() {
		whp = new wareHousePage(driver);
		loginUser();
	}
	
	@Test(priority=1)
	public void testwareHousePageIsOpened() {
		whp.clickinvenoryTab();
		String value = whp.getwareHousePageIsOpenedText();
		Assert.assertEquals("Warehouse Inventory", value);
	}
	
	@Test(priority=2)
	public void testSearchEnquiry() {
		whp.getBack();
		sleep(2000);
		whp.searchInventories("Drill");
		String check = whp.getSearchInventoryResult();
		Assert.assertEquals("Drill", check);
	}
	
	@Test(priority=3)
	public void testUpdateInventoryPageIsOpened() {
		whp.clickUpdateInventory();
		String value = whp.getUpdateInventoryPageIsOpenedText();
		Assert.assertEquals("Edit Inventory Stock", value);
	}
	
	
}
