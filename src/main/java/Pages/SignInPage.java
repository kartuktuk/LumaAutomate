package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage {

    private WebDriver driver;

    public SignInPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[.=\"What's New\"]")
    WebElement whatsNewButton;
    @FindBy(id = "email")
    WebElement userNameInput;
    @FindBy(id = "pass")
    WebElement passwordInput;
    @FindBy(id = "send2")
    WebElement signInButton;
    @FindBy(xpath = "//span[text()='Forgot Your Password?']")
    WebElement forgotPasswordLink;
    @FindBy(xpath = "//span[text()='Create an Account']")
    WebElement createAccountLink;

    public void signIn(String email, String pass) {
        userNameInput.sendKeys(email);
        passwordInput.sendKeys(pass);
        signInButton.click();
    }
}