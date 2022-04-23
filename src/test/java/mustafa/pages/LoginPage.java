package mustafa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{


    @FindBy(id = "email_create")
    public WebElement emailRegistrationBox;

    @FindBy(id = "SubmitCreate")
    public WebElement createAccountButton;

    @FindBy(id = "email")
    public WebElement emailInputBox;

    @FindBy(id = "passwd")
    public WebElement password;

    @FindBy(id = "SubmitLogin")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@id='center_column']//h1")
    public WebElement authenticationHeader;

    @FindBy(id = "email_create")
    public WebElement emailAdressBox;

    @FindBy(xpath = "//div[@id='create_account_error']//li")
    public WebElement invalidEmailMessage;

    @FindBy(xpath = "(//div[@class='account_creation'])[1]//h3")
    public WebElement personalInfoHeader;





}
