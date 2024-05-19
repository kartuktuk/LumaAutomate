package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[contains(.,'Sign In')]")
    WebElement signInLink;
    @FindBy(xpath = "//a[contains(text(),'Create')]")
    WebElement createAccountLink;

    public void goToSignInPage() {
        signInLink.click();
        SignInPage signInPage = new SignInPage(driver);
    }
    public void goToCreateAccountInPage() {
        createAccountLink.click();
    }

    public void goTo() {
        driver.get("https://magento.softwaretestingboard.com/");
    }
}
