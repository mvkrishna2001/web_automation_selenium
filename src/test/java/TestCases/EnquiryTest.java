package TestCases;

import java.text.DecimalFormat;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import WebAutomation.automation.EnquiryPage;

public class EnquiryTest extends BaseClass {
	
	EnquiryPage ep;
	
	@BeforeClass
	public void classSetUp() {
		ep = new EnquiryPage(driver);
		loginUser();
	}
	
	@Test(priority=1)
	public void testEnquiryPageIsOpened() {
		sleep(5000);
		ep.clickEnquiryDropdown();
		sleep(5000);
		ep.clickEnquiry();
		String value = ep.getEnquiryPageIsOpenedText();
		Assert.assertEquals("ENQUIRY", value);
	}
	
	@Test(priority=2)
	public void testEnquiryDetailsPageIsOpened() {
		sleep(5000);
		ep.clickViewEnquiryDetails();
		sleep(5000);
		String actualValue = ep.getEnquiryDetailsPageIsOpenedText();
		Assert.assertEquals("ENQUIRY DETAILS",actualValue);
		ep.getBack();
		sleep(5000);
	}
	
	@Test(priority=3)
	public void testCorrectEnquiryIsOpened() {
		sleep(5000);
		String actualValue = ep.getComponentName();
		sleep(5000);
		ep.clickViewEnquiryDetails();
		sleep(5000);
		String expectedValue = ep.getComponentNameTextEnquiryDetails();
		String[] trimmed = expectedValue.split(" ");
		Assert.assertEquals(actualValue, trimmed[5]);
	}
	
	@Test(priority=4)
	public void testNoOfComponentsManufacturedIntegerInput() {
		sleep(5000);
		ep.setNoOfComponentsManufactured("10");
		sleep(2000);
		String value = ep.getNoOfComponentsManufacturedText();
		System.out.println("Integer input check 1: "+value);
		Assert.assertEquals("10", value);
		ep.clearComponentManufactured();
	}
	
	@Test(priority=5)
	public void testNoOfComponentsManufacturedStringInput() {
		sleep(2000);
		ep.setNoOfComponentsManufactured("qwqwdsd");
		String actualValue = ep.getNoOfComponentsManufacturedText();
		System.out.println("Integer input check 2: "+actualValue);
		Assert.assertEquals("",actualValue);
		sleep(5000);
		ep.clearComponentManufactured();
	}
	
	@Test(priority=6)
	public void testTotalPriceForComponents() {
		final DecimalFormat df = new DecimalFormat("0.00");
		sleep(5000);
		ep.clearComponentManufactured();
		ep.setNoOfComponentsManufactured("10");
		String price0 = ep.getTotalToolPriceCheck0();
		System.out.print("Tool Price 0: "+price0);
		String proposedcpc0 = ep.getProposedCpc0();
		System.out.println("Proposed cpc 0 price fetched"+proposedcpc0);
		double val = Double.parseDouble(proposedcpc0);
		val*=10;
		System.out.println("Value converted: "+ val);
		Assert.assertEquals(price0,df.format(val));
		sleep(5000);
		String price1 = ep.getTotalToolPriceCheck1();
		System.out.print("Tool Price 1: "+price1);
		String proposedcpc1 = ep.getProposedCpc1();
		double value = Double.parseDouble(proposedcpc1);
		System.out.println("Value converted: "+ value);
		value*=10;
		System.out.println("Value converted: "+ value);
		System.out.println("Proposed cpc 0 price fetched"+proposedcpc1);
		Assert.assertEquals(price1,df.format(value));
		String total = ep.getTotalToolPrice();
		double totalFetched = val + value ;
		Assert.assertEquals(df.format(totalFetched), total);
		
	}
	
}
