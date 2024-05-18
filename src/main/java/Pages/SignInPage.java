package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    private WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
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

    public void goTo() {
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/");
    }



}
/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object encapsulates the Sign-in page.



public class SignInPage {
    protected WebDriver driver;

    // <input name="user_name" type="text" value="">
    private By usernameBy = By.name("user_name");
    // <input name="password" type="password" value="">
    private By passwordBy = By.name("password");
    // <input name="sign_in" type="submit" value="SignIn">
    private By signinBy = By.name("sign_in");

    public SignInPage(WebDriver driver){
        this.driver = driver;
        if (!driver.getTitle().equals("Sign In Page")) {
            throw new IllegalStateException("This is not Sign In Page," +
                    " current page is: " + driver.getCurrentUrl());
        }
    }

    /**
     * Login as valid user
     *
     * @param userName
     * @param password
     * @return HomePage object

    public HomePage loginValidUser(String userName, String password) {
        driver.findElement(usernameBy).sendKeys(userName);
        driver.findElement(passwordBy).sendKeys(password);
        driver.findElement(signinBy).click();
        return new HomePage(driver);
    }
}
*/
