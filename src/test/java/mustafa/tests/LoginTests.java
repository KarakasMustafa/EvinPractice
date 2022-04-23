package mustafa.tests;

import mustafa.pages.HomePage;
import mustafa.pages.LoginPage;
import mustafa.utilities.BrowserFactory;
import mustafa.utilities.ConfigurationReader;
import mustafa.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests {

    HomePage homePage;
    LoginPage loginPage;

    WebDriverWait wait;

    @Test
    public void goToLoginPage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("Url"));
        wait = new WebDriverWait(Driver.getDriver(),30);
        homePage = new HomePage();
        loginPage = new LoginPage();
        wait.until(ExpectedConditions.elementToBeClickable(homePage.loginButton));
        homePage.loginButton.click();
        wait.until(ExpectedConditions.visibilityOf(loginPage.authenticationHeader));
        Assert.assertEquals(loginPage.authenticationHeader.getText(),"AUTHENTICATION");

    }

    @Test
    public void signUp() {
        LoginTests loginTests = new LoginTests();
        loginPage = new LoginPage();
        loginTests.goToLoginPage();
        wait = new WebDriverWait(Driver.getDriver(),30);
        wait.until(ExpectedConditions.elementToBeClickable(loginPage.emailInputBox));
        loginPage.emailInputBox.sendKeys("mustafa_ka@gmail.com");
        loginPage.createAccountButton.click();
        wait.until(ExpectedConditions.visibilityOf(loginPage.personalInfoHeader));
        Assert.assertEquals(loginPage.personalInfoHeader.getText(),"Your personal information");
        Driver.getDriver().close();

    }

}

