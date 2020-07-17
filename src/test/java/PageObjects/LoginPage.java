package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public static String pageUrl = "https://www.seek.com.au/sign-in";

    public static String title = "Candidate Sign in - SEEK";

    @FindBy(how = How.ID, using = "email")
    public static WebElement txtEmail;

    @FindBy(how = How.ID, using = "password")
    public static WebElement txtPassword;

    @FindBy(how = How.CSS, using = "[data-automation=signin-submit]")
    public static WebElement btnSubmit;

    @FindBy(how = How.CSS, using = "[data-automation=email-validation-error]")
    public static WebElement emailErrorMessage;

    @FindBy(how = How.CSS, using = "[data-automation=password-validation-error]")
    public static WebElement passwordErrorMessage;

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
        this.isPageOpened(title);
        return true;
    }

    public String getEmailErrorMessageDisplayed(){
        return LoginPage.emailErrorMessage.getText();
    }

    public String getPasswordErrorMessageDisplayed(){
        return LoginPage.passwordErrorMessage.getText();
    }
}

