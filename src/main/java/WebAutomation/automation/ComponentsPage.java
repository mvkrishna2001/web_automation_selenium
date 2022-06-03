package WebAutomation.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComponentsPage {

    WebDriver ldriver;
    
    public ComponentsPage(WebDriver driver){
        ldriver = driver;
        PageFactory.initElements(driver, this);
    }
    
//  --------------------------------------------Components Page WebElements Started -----------------------------------
    
    @FindBy(xpath="/html/body/div[1]/div/div[1]/ul/li[5]/a")
    WebElement ComponentUtilButton;
    
    @FindBy(linkText="Components")
    WebElement Components;
    
    @FindBy(xpath="/html/body/div[3]/div/div/div[1]/div[1]/div/div/h1")
    WebElement VerifyComponentsTab;
    
    @FindBy(linkText="Add Component")
    WebElement AddComponent;
    
    @FindBy(id="component_name")
    WebElement ComponentName;
   
    @FindBy(id="component_code")
    WebElement ComponentCode;
    
    @FindBy(id="component_material")
    WebElement ComponentMaterial;
    
    @FindBy(id="component_description")
    WebElement ComponentDescription;
    
    @FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div/div/div/div[3]/button")
    WebElement AddCompButton;
    
    @FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[2]")
    WebElement frowdatacomp;
    
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[8]/a")
    WebElement Updatebtn;
    
    @FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div/div/div/div[3]/button")
    WebElement UpdateButton;
    
//    --------------------------------------------Components Page WebElements finished -----------------------------------
//    --------------------------------------------- Machines Page WebElements Started --------------------------------------

    @FindBy(linkText="Machines")
    WebElement Machines;
    
    @FindBy(xpath="/html/body/div[3]/div/div/div[1]/div[1]/div/div/h1")
    WebElement VerifyMachinesTab;
    
    @FindBy(linkText="Add Machine")
    WebElement AddMachine;
    
    @FindBy(id="machine_name")
    WebElement MachineName;
   
    @FindBy(id="machine_no")
    WebElement MachineNumber;
    
    @FindBy(id="machine_description")
    WebElement MachineDescription;
    
    @FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div/div/div/div[5]/button")
    WebElement AddMachButton;
    
    @FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[2]")
    WebElement frowdatamach;
    
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[7]/a")
    WebElement Updatebtnmech;
    
    @FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div/div/div/div[5]/button")
    WebElement UpdateButtonmech;
    
//    ------------------------------------------------Machines Page WebElements Finished -----------------------------------

//    --------------------------------------------------Operations Page WebElements Started --------------------------------
    @FindBy(linkText="Operations")
    WebElement Operations;
    
    @FindBy(xpath="/html/body/div[3]/div/div/div[1]/div[1]/div/div/h1")
    WebElement VerifyOperationsTab;
    
    @FindBy(linkText="Add operation")
    WebElement AddOperation;
    
    @FindBy(id="operation_name")
    WebElement OpName;
   
    @FindBy(id="operation_code")
    WebElement OpCode;
    
    @FindBy(id="operation_description")
    WebElement OpDescription;
    
    @FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div/div/div/div[3]/button")
    WebElement AddOpButton;
    
    @FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[2]")
    WebElement frowdataop;
    
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[7]/a")
    WebElement Updatebtnop;
    
    @FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div/div/div/div[3]/button")
    WebElement UpdateButtonop;
//    --------------------------------------------------- Operations Page WebElements Finished -------------------------------

    
//    -------------------------------------------------------Components Page Methods Starts ------------------------------------
    
    public void ClickComponentUtility() {
    	ComponentUtilButton.click();
    }
    
    public void ClickComponents() {
    	Components.click();
    }
    
    public void clickAddComponent() {
        AddComponent.click();
    }
    
    public void EnterCompName(String compname) {
    	ComponentName.clear();
    	ComponentName.sendKeys(compname);
    }
    
    public void EnterCompCode(String compname) {
    	ComponentCode.sendKeys(compname);
    }
    
    public void EnterCompMaterial(String compname) {
    	ComponentMaterial.sendKeys(compname);
    }
    
    public void EnterCompDescription(String compname) {
    	ComponentDescription.sendKeys(compname);
    }
    
    public String getFrowDataComp() {
    	System.out.println(frowdatacomp.getText());
    	return frowdatacomp.getText();
    	
    }
    
	public String getComponentsPageIsOpenedText() {
		return VerifyComponentsTab.getText();
	}
    
    public void ClickAddComp() {
    	AddCompButton.click();
    }
    
    public void ClickUpdate() {
    	Updatebtn.click();
    }

    public void SaveUpdate() {
    	UpdateButton.click();
    }
    
//    ----------------------------------------Components Page methods Finished --------------------------------

//    --------------------------------------- Machines Page methods Starts -------------------------------------
    
    public void ClickMachines() {
    	Machines.click();
    }
    
	public String getMachinesPageIsOpenedText() {
		return VerifyMachinesTab.getText();
	}
	
    public void clickAddMachine() {
        AddMachine.click();
    }
    
    public void EnterMachName(String machname) {
    	MachineName.clear();
    	MachineName.sendKeys(machname);
    }
    
    public void EnterMachNum(String machnum) {
    	MachineNumber.sendKeys(machnum);
    }
    
    public void EnterMachDescription(String machdesc) {
    	MachineDescription.sendKeys(machdesc);
    }
    
    public void ClickAddMach() {
    	AddMachButton.click();
    }
    
    public String getFrowDataMach() {
    	System.out.println(frowdatamach.getText());
    	return frowdatamach.getText();
    }
    
    public void ClickUpdatemech() {
    	Updatebtnmech.click();
    }

    public void SaveUpdatemech() {
    	UpdateButtonmech.click();
    }
    
    public void EnterMechNum(String mechnum) {
    	MachineNumber.clear();
    	MachineNumber.sendKeys(mechnum);
    }
//    --------------------------------------- Machines Page methods Finished -----------------------------------
//	----------------------------------------- Operations Page methods Started ---------------------------------
    public void ClickOperations() {
    	Operations.click();
    }
	
	public String getOperationsPageIsOpenedText() {
		return VerifyOperationsTab.getText();
	}
	
    public void clickAddOperation() {
        AddOperation.click();
    }
    
    public void EnterOpName(String opname) {
    	OpName.clear();
    	OpName.sendKeys(opname);
    }
    
    public void EnterOpCode(String opcode) {
    	OpCode.sendKeys(opcode);
    }
    
    public void EnterOpDescription(String opdesc) {
    	OpDescription.sendKeys(opdesc);
    }
    
    public void ClickAddOp() {
    	AddOpButton.click();
    }
    
    public String getFrowDataOp() {
    	System.out.println(frowdataop.getText());
    	return frowdataop.getText();
    }
    
    public void ClickUpdateop() {
    	Updatebtnop.click();
    }

    public void SaveUpdateop() {
    	UpdateButtonop.click();
    }
    
    public void EnterOpName1(String Opname) {
    	OpName.clear();
    	OpName.sendKeys(Opname);
    }
//	-------------------------------------- Operations Page methods Finished ------------------------------------



}
