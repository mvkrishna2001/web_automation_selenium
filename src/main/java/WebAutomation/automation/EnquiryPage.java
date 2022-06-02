package WebAutomation.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnquiryPage {

WebDriver ldriver;
	
	public EnquiryPage(WebDriver driver){
		ldriver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@class='sidebar-sub-toggle'][normalize-space()='Enquiry']")
	WebElement enquiryDropdown;
	
	@FindBy(xpath="//a[@href='https://tms.pisystindia.com/admin/enquiry'][normalize-space()='Enquiry']")
	WebElement enquiryTab;
	
	@FindBy(xpath="//h1[normalize-space()='ENQUIRY']")
	WebElement verifyEnquiryTab;
	
	@FindBy(xpath="//a[normalize-space()='Create new Enquiry']")
	WebElement createNewEnquiry;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement searchEnquiries;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[8]/a")
	WebElement viewEnquiryDetails;
	
	@FindBy(xpath="//h1[normalize-space()='ENQUIRY DETAILS']")
	WebElement verifyEnquiryDetailsTab;
	
	@FindBy(xpath="//tbody/tr[1]/td[4]")
	WebElement componentName;
	
	@FindBy(xpath="//h4[normalize-space()='Projection Details for component -> Diffcase123']")
	WebElement verifyComponentNameonEnquiryDetails;
	
	@FindBy(xpath="//input[@id='component_name']")
	WebElement noOfComponentManufacturedTextField;
	
	@FindBy(xpath="//input[@id='price0']")
	WebElement totalToolprice0;
	
	@FindBy(xpath="//input[@id='price1']")
	WebElement totalToolprice1;
	
	@FindBy(xpath="//input[@id='proposedcpc0']")
	WebElement proposedcpc0;
	
	@FindBy(xpath="//input[@id='proposedcpc1']")
	WebElement proposedcpc1;
	
	@FindBy(xpath="//input[@id='totaltoolsprice']")
	WebElement totalToolPrice;
	
	@FindBy(xpath="//a[normalize-space()='Enquiry Shift Analysis']")
	WebElement enquiryShiftAnalysis;
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]")
	WebElement viewShiftDetails;
	
	@FindBy(xpath="//h1[normalize-space()='SHIFT ANALYSIS']")
	WebElement verifyShiftAnalysisTab;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement searchShiftAnalysis;
	
	@FindBy(xpath="//td[2]")
	WebElement verifySearchShiftAnalysis;
	
	public void clickEnquiryDropdown() {
		enquiryDropdown.click();
	}
	
	public void clickEnquiry() {
		enquiryTab.click();
	}
	
	public void searchEnquiries(String searchvalue) {
		searchEnquiries.sendKeys(searchvalue);
	}
	
	public void clickViewEnquiryDetails() {
		//viewEnquiryDetails.click();
		String url = "https://tms.pisystindia.com/admin/enquiry/viewEnquirydetails/10";
		ldriver.navigate().to(url);
	}
	
	public void searchQueries(String value) {
		searchEnquiries.sendKeys(value);
	}
	
	public void clickEnquiryShiftAnalysis() {
		enquiryShiftAnalysis.click();
	}
	
	public void clickViewShiftDetails() {
		viewShiftDetails.click();
		String url = "https://tms.pisystindia.com/admin/enquiry/viewShifts/10";
		ldriver.navigate().to(url);
	}
	
	public String getEnquiryPageIsOpenedText() {
		return verifyEnquiryTab.getText();
	}
	
	public String getEnquiryDetailsPageIsOpenedText() {
		return verifyEnquiryDetailsTab.getText();
	}
	
	public String getEnquiryDetailsIsOpenedText() {
		return verifyEnquiryTab.getText();
	}
	
	public String getComponentName() {
		return componentName.getText();
	}
	
	public String getComponentNameTextEnquiryDetails() {
		return verifyComponentNameonEnquiryDetails.getText();
	}
	
	public void getBack() {
		ldriver.navigate().back();
	}
	
	
	public void setNoOfComponentsManufactured(String val) {
		noOfComponentManufacturedTextField.sendKeys(val);
	}
	
	public void clearComponentManufactured() {
		noOfComponentManufacturedTextField.clear();
	}
	
	public String getNoOfComponentsManufacturedText() {
		return noOfComponentManufacturedTextField.getAttribute("value");
	}
	
	public String getTotalToolPriceCheck0() {
		return totalToolprice0.getAttribute("value");
	}
	

	public String getTotalToolPriceCheck1() {
		return totalToolprice1.getAttribute("value");
	}
	
	public String getProposedCpc0() {
		return proposedcpc0.getAttribute("value");
	}
	
	public String getProposedCpc1() {
		return proposedcpc1.getAttribute("value");
	}
	
	public String getTotalToolPrice() {
		return totalToolPrice.getAttribute("value");
	}
	
	public String getviewShiftEnquiryIsOpen() {
		return verifyShiftAnalysisTab.getText();
	}
	
	public void setSearchShiftAnalysis(String value) {
		searchShiftAnalysis.sendKeys(value);
	}
	
	public String getSearchShiftAnalysisResult() {
		return verifySearchShiftAnalysis.getText();
	}
}
