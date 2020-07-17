package Steps;

import PageObjects.JobSearchPage;
import PageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginStepDefs {
    WebDriver driver;

    public LoginStepDefs() {
        System.setProperty("webdriver.chrome.driver", "/Users/alesneva/Tools/chromedriver 2");
        driver = new ChromeDriver();
    }

    @Given("I navigate to login page")
    public void iNavigateToLoginPage() {
        LoginPage page = new LoginPage(driver);
        Assert.assertTrue(page.openPage().isPageOpened());
    }

    @And("I login with email={string}, password={string}")
    public void iLoginWithUsernameAndPassword(String email, String password) {
        LoginPage page = new LoginPage(driver);
        page.login(email,password);
    }

    @Then("I should see Job Search page")
    public void iShouldSeeJobSearchPage() {
        JobSearchPage page = new JobSearchPage(driver);
        Assert.assertTrue(page.isPageOpened());
    }

    @Then("I should see email error message {string} on login page")
    public void iShouldSeeErrorMessageOnLoginPage(String msg) {
        LoginPage page = new LoginPage(driver);
        Assert.assertEquals(page.getEmailErrorMessageDisplayed(),msg);
    }

    @And("I should see password error message {string} on login page")
    public void iShouldSeePasswordErrorMessageOnLoginPage(String msg) {
        LoginPage page = new LoginPage(driver);
        Assert.assertEquals(page.getPasswordErrorMessageDisplayed(), msg);
    }
}
