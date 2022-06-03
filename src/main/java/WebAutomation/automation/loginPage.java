package WebAutomation.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    WebDriver ldriver;
    
    public loginPage(WebDriver driver){
        ldriver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(id="admin_email")
    WebElement userName;
    
    @FindBy(id="admin_password")
    WebElement passWord;
    
    @FindBy(xpath="//button[normalize-space()='Sign in']")
    WebElement loginButton;
    
    public void setUserName(String user) {
        userName.sendKeys(user);
    }
    
    public void setPassWord(String pass) {
        passWord.sendKeys(pass);
    }
    
    public void clickLogin() {
        loginButton.click();
    }
    
    
}