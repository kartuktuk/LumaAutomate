package Karthik;

import Pages.BasePage;
import Pages.SignInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTests {

    @Test
    public void login() {

        WebDriver driver = new ChromeDriver();
        BasePage basePage = new BasePage(driver);
        basePage.goToSignInPage();
        //SignInPage("test@kar.test","Tester123");
        String title =  driver.getTitle();
        System.out.println(title);
        driver.close();
    }

    @Test
    public void createAccount() {


    }
}
