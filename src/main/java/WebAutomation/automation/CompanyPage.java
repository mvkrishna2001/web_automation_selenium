package WebAutomation.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage {

WebDriver ldriver;
	
	public CompanyPage(WebDriver driver){
		ldriver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@class='sidebar-sub-toggle']//i[@class='fa fa-industry']")// dropdown
	WebElement companyDropdown;
	
	@FindBy(xpath="//a[@href='https://tms.pisystindia.com/admin/clientcompanies']") // client company tab
	WebElement clientCompanyTab;
	
	@FindBy(xpath="//h1[normalize-space()='Client Companies']") // takes heading of ccompany tab
	WebElement verifyCCompaniesTab;
	
	@FindBy(xpath="//h1[normalize-space()='Add Client Company']") // takes heading of Addccompany tab
	WebElement verifyAddCCompaniesTab;
	
	@FindBy(xpath="//a[@type='submit']") // add client company
	WebElement addNewCCompany;
	
	@FindBy(xpath="//input[@type='search']")// search 
	WebElement searchCompany;
	
	@FindBy(xpath="//tbody/tr[1]/td[10]/a[1]") //edit/view comp
	WebElement viewCCompanyDetails;
	
	@FindBy(xpath="//h1[normalize-space()='Edit Client Company']")// edit comp page heading
	WebElement verifyCCompanyDetailsTab;
	
	@FindBy(xpath="//a[@href='https://tms.pisystindia.com/admin/vendorcompanies']")
	WebElement vendorCompanyTab;
	
	@FindBy(xpath="//h1[normalize-space()='Vendor Companies']")
	WebElement verifyVCompaniesTab;
	
	@FindBy(xpath="//a[normalize-space()='View Tools Allocated']")
	WebElement toolsAllocated;
	
	@FindBy(xpath="//a[normalize-space()='Add Vendor Company']")
	WebElement addVendorCompany;  
	
	@FindBy(xpath="//h1[normalize-space()='Tools allocated to Vendor Company']")
	WebElement verifyToolsAllocatedToCompany;

	@FindBy(xpath="//a[@type='submit']")
	WebElement allocateTools;  
	
	@FindBy(xpath="//h1[normalize-space()='Allocate Tools to Company']")
	WebElement verifyAllocatedTools;
	
	@FindBy(xpath="//a[normalize-space()='Add Vendor Company']") // add vendor company tab
	WebElement addVendorTab;
	
	@FindBy(xpath="//h1[normalize-space()='Add Vendor Company']") //verify add vendor company tab
	WebElement verifyAddVendorTab;
	
	@FindBy(xpath="//a[@href='https://tms.pisystindia.com/admin/shift']")
	WebElement shiftTab;
	
	@FindBy(xpath="//h1[normalize-space()='SHIFTS']")
	WebElement verifyShiftsTab;
	
	@FindBy(xpath="//a[@type='submit']")
	WebElement addShiftsTab;
	
	@FindBy(xpath="//h1[normalize-space()='Add Shifts']")
	WebElement verifyAddShiftsTab;
	
	
	
	
	

	
	
	public void clickCompanyDropdown() {
		companyDropdown.click();
	}
	
	public void clickAddNewCompany() {
		addNewCCompany.click();
	}
	
	public void clickCCompany() {
		clientCompanyTab.click();
	}
	
	public void clickVCompany() {
		vendorCompanyTab.click();
	}
	
	public void clickshift() {
		shiftTab.click();
	}
	
	public void clickAddshift() {
		addShiftsTab.click();
	}
	
	public void clicktoolsAllocated() {
		toolsAllocated.click();;
	}
	
	public void clicktoolsAllocatedToCompany() {
		allocateTools.click();
	}
	
	public void clickAddVendor() {
		addVendorTab.click();
	}
	
	
	public void searchCompany(String searchvalue) {
		searchCompany.sendKeys(searchvalue);
	}
	
	public void clickViewCompanyDetails() {
		//viewEnquiryDetails.click();
		String url = "https://tms.pisystindia.com/admin/clientcompanies/edit/13";
		ldriver.navigate().to(url);
	}
	
	public void searchQueries(String value) {
		searchCompany.sendKeys(value);
	}
	
	public String getCCompanyPageIsOpenedText() {
		return verifyCCompaniesTab.getText();
	}
	
	public String getCCompanyEditPageIsOpenedText() {
		return verifyCCompanyDetailsTab.getText();
	}
	
	public String getAddCCompanyPageIsOpenedText() {
		return verifyAddCCompaniesTab.getText();
	}
	
	public String getAddVendorPageIsOpenedText() {
		return verifyAddVendorTab.getText();
	}
	
	public String getVCompanyPageIsOpenedText() {
		return verifyVCompaniesTab.getText();
	}
	
	public String getShiftIsOpenedText() {
		return verifyShiftsTab.getText();
	}
	
public String getAddShiftIsOpenedText() {
		
		return verifyAddShiftsTab.getText();
	}
	
	public String getToolsAllocatedIsOpenedText() {
		return verifyToolsAllocatedToCompany.getText();
	}
	
	public String getToolsAllocatedToCompanyIsOpenedText() {
		return verifyAllocatedTools.getText();
	}
	
	
	
	public void getBack() {
		ldriver.navigate().back();
	}

	
}
