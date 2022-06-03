package WebAutomation.automation;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ComponentsTest extends BaseClass {
	
	ComponentsPage cp;

	@BeforeClass
	public void classSetup() {
		cp = new ComponentsPage(driver);
		loginUser();
	}
	
	@Test(priority=1)
	public void testEnquiryPageIsOpened() {
		sleep(5000);
		cp.ClickComponentUtility();
		sleep(5000);
		cp.ClickComponents();
		String value = cp.getComponentsPageIsOpenedText();
		Assert.assertEquals("COMPONENTS", value);
	}
	
	@Test(priority = 2)
	public void AddComponentTest(){
		String compname = "Test111";
		String compcode = "11111";
		String compmat = "raw";
		String compdesc = "dihf";
		cp.ClickComponentUtility();
		sleep(1000);
		cp.ClickComponents();
		sleep(2000);
		cp.clickAddComponent();
		sleep(1000);
		cp.EnterCompName(compname);
		cp.EnterCompCode(compcode);
		cp.EnterCompMaterial(compmat);
		cp.EnterCompDescription(compdesc);
		sleep(3000);
		cp.ClickAddComp();
		sleep(5000);
		String tabledata = cp.getFrowDataComp();
		if (tabledata.equals(compname)) {
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test(priority = 3)
	public void UpdateComponentTest() {
		String compname = "UpdatedTest1111";
//		cp.ClickComponentUtility();
//		sleep(1000);
//		cp.ClickComponents();
		sleep(2000);
		cp.ClickUpdate();
		sleep(1000);
		cp.EnterCompName(compname);
		sleep(3000);
		cp.SaveUpdate();
		sleep(5000);
		String tabledata = cp.getFrowDataComp();
		if (tabledata.equals(compname)) {
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.assertTrue(false);
		}
	}
	
//	------------------------------------------------------------------------------------
	
	@Test(priority=4)
	public void testMachinesPageIsOpened() {
		sleep(5000);
		cp.ClickComponentUtility();
		sleep(5000);
		cp.ClickMachines();
		String value = cp.getMachinesPageIsOpenedText();
		Assert.assertEquals("Machines", value);
	}
	
	@Test(priority = 5)
	public void AddMachineTest(){
		String machname = "Test1111";
		String machnum = "111111";
		String machdesc = "dihfd";
		cp.ClickComponentUtility();
		sleep(1000);
		cp.ClickMachines();
		sleep(2000);
		cp.clickAddMachine();
		sleep(1000);
		cp.EnterMachName(machname);
		cp.EnterMachNum(machnum);
		cp.EnterMachDescription(machdesc);
		sleep(3000);
		cp.ClickAddMach();
		sleep(5000);
		String tabledata = cp.getFrowDataMach();
		if (tabledata.equals(machnum)) {
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.assertTrue(false);
		}
	}
	
	
//	Asking to upload image when updating.
//	@Test(priority = 6)
//	public void UpdateMachTest() {
//		String machnum = "786";
//		String machname = "TTT";
////		cp.ClickComponentUtility();
////		sleep(1000);
////		cp.ClickMachines();
//		sleep(2000);
//		cp.ClickUpdatemech();
//		sleep(1000);
////		cp.EnterMachName(machname);
//		cp.EnterMechNum(machnum);
//		sleep(3000);
//		cp.SaveUpdatemech();
//		sleep(5000);
//		String tabledata = cp.getFrowDataMach();
//		if (tabledata.equals(machnum)) {
//			Assert.assertTrue(true);
//		}
//		else 
//		{
//			Assert.assertTrue(false);
//		}
//	}
	
	
//	---------------------------------------------------------------------------------------
	@Test(priority=7)
	public void testOperationsPageIsOpened() {
		sleep(5000);
		cp.ClickComponentUtility();
		sleep(5000);
		cp.ClickOperations();
		String value = cp.getOperationsPageIsOpenedText();
		Assert.assertEquals("Operations", value);
	}

	@Test(priority = 8)
	public void AddOperationTest(){
		String opname = "Test111";
		String opcode = "11111";
		String opdesc = "ddgghd";
		cp.ClickComponentUtility();
		sleep(1000);
		cp.ClickOperations();
		sleep(2000);
		cp.clickAddOperation();
		sleep(1000);
		cp.EnterOpName(opname);
		cp.EnterOpCode(opcode);
		cp.EnterOpDescription(opdesc);
		sleep(3000);
		cp.ClickAddOp();
		sleep(5000);
		String tabledata = cp.getFrowDataOp();
		if (tabledata.equals(opname)) {
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test(priority = 9)
	public void UpdateOperationsTest() {
		String opname = "UpdatedTest111";
//		cp.ClickComponentUtility();
//		sleep(1000);
//		cp.ClickOperations();
		sleep(2000);
		cp.ClickUpdateop();
		sleep(1000);
		cp.EnterOpName(opname);
		sleep(3000);
		cp.SaveUpdateop();
		sleep(5000);
		String tabledata = cp.getFrowDataOp();
		if (tabledata.equals(opname)) {
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.assertTrue(false);
		}
	}

}
