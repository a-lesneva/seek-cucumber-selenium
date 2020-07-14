package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public static String pageUrl = "https://www.seek.com.au/sign-in";

    @FindBy(how = How.ID, using = "email")
    public static WebElement txtEmail;

    @FindBy(how = How.ID, using = "password")
    public static WebElement txtPassword;

    @FindBy(how = How.CSS, using = "[data-automation=signin-submit]")
    public static WebElement btnSubmit;

    public void setEmail(String email) {
        LoginPage.txtEmail.sendKeys(email);
    }

    public void setPassword(String password) {
        LoginPage.txtPassword.sendKeys(password);
    }

    public void clickSubmit(){
        LoginPage.btnSubmit.click();
    }

    public void login(String email, String password){
        setEmail(email);
        setPassword(password);
        clickSubmit();
    }

    public void enterCredentials(String email, String password){
        setEmail(email);
        setPassword(password);
    }

    public LoginPage openPage(){
        openBasePage(pageUrl);
        return new LoginPage(driver);
    }

    public boolean isPageOpened(){
        return driver.getCurrentUrl().contentEquals(pageUrl);
    }


}

