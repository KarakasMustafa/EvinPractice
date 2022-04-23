package mustafa.pages;

import mustafa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    public WebElement loginButton;

    @FindBy(id = "search_query_top")
    public WebElement searchBox;



}
