package TestCases;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import WebAutomation.automation.CompanyPage;

public class CompanyTest extends BaseClass {
	
	CompanyPage ep;
	
	@BeforeClass
	public void classSetUp() {
		ep = new CompanyPage(driver);
		loginUser();
	}
	
	@Test(priority=1)
	public void testCCompanyPageIsOpened() {
		sleep(1000);
		ep.clickCompanyDropdown();
		sleep(1000);
		ep.clickCCompany();
		String value = ep.getCCompanyPageIsOpenedText();
		Assert.assertEquals("Client Companies", value);
	}
	
	@Test(priority=2)
	public void testCCompanyDetailsPageIsOpened() {
		sleep(1000);
		ep.clickViewCompanyDetails();
		sleep(1000);
		String actualValue = ep.getCCompanyEditPageIsOpenedText();
		Assert.assertEquals("Edit Client Company",actualValue);
		ep.getBack();
		sleep(1000);
	}
	
	@Test(priority=3)
	public void testCCompanyAddCompanyIsOpened() {
		sleep(1000);
		ep.clickAddNewCompany();
		sleep(1000);
		String value = ep.getAddCCompanyPageIsOpenedText();
		Assert.assertEquals("Add Client Company", value);
	}
	
	@Test(priority=4)
	public void testVCompanyIsOpened() {
		sleep(1000);
		ep.clickCompanyDropdown();
		sleep(1000);
		ep.clickVCompany();
		sleep(1000);
		String value = ep.getVCompanyPageIsOpenedText();
		Assert.assertEquals("Vendor Companies", value);
	}
	
	@Test(priority=5)
	public void testToolsAllocatedIsOpened() {
		ep.clicktoolsAllocated();
		sleep(1000);
		String value = ep.getToolsAllocatedIsOpenedText();
		Assert.assertEquals("Tools allocated to Vendor Company", value);
	}
	
	@Test(priority=6)
	public void testToolsAllocatedToCompanyIsOpened() {
		ep.clicktoolsAllocatedToCompany();
		sleep(1000);
		String value = ep.getToolsAllocatedToCompanyIsOpenedText();
		Assert.assertEquals("Allocate Tools to Company", value);
		ep.getBack();
		ep.getBack();
	}
	
	@Test(priority=7)
	public void testAddVCompanyIsOpened() {
		ep.clickAddVendor();
		sleep(1000);
		String value = ep.getAddVendorPageIsOpenedText();
		Assert.assertEquals("Add Vendor Company", value);
	}
	
	@Test(priority=8)
	public void testShiftIsOpened() {
		sleep(1000);
		ep.clickCompanyDropdown();
		sleep(1000);
		ep.clickshift();
		sleep(1000);
		String value = ep.getShiftIsOpenedText();
		Assert.assertEquals("SHIFTS", value);
	}
	
	@Test(priority=9)
	public void testAddShiftIsOpened() {
		ep.clickAddshift();
		sleep(1000);
		String value = ep.getAddShiftIsOpenedText();
		Assert.assertEquals("Add Shifts", value);
	}
	
}
