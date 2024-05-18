package Karthik;

import Pages.SignInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartTest {

    @Test
    public void openDriver() {

        WebDriver driver = new ChromeDriver();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.goTo();
        signInPage.signIn("test@kar.test","Tester123");
        String title =  driver.getTitle();
        System.out.println(title);
        driver.close();
    }
}
