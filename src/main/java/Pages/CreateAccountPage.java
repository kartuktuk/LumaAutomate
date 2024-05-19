package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends BasePage {
    private WebDriver driver;

    public CreateAccountPage(WebDriver driver) {
        super(driver);
        //this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id= "firstname")
    WebElement firstNameInput;
    @FindBy(id= "lastname")
    WebElement lastNameInput;
    @FindBy(id="email_address")
    WebElement emailInput;
    @FindBy(id="password")
    WebElement passwordInput;
    @FindBy(id="password-confirmation")
    WebElement confirmPasswordInput;
    @FindBy(xpath = "//span[.='Create an Account']")
    WebElement createAccountButton;


    public void createAccount(String fname, String lname, String email, String pass) {
        firstNameInput.sendKeys(fname);
        lastNameInput.sendKeys(lname);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(pass);
        confirmPasswordInput.sendKeys(pass);
        createAccountButton.click();
    }




}