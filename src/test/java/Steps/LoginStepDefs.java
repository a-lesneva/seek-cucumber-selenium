package Steps;

import PageObjects.JobSearchPage;
import PageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.awt.*;

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

    @And("I enter email={string}, password={string}")
    public void iEnterUsernameAndPassword(String email, String password) {
        LoginPage page = new LoginPage(driver);
        page.enterCredentials(email,password);
    }

    @And("I click login button")
    public void iClickLoginButton() {
        LoginPage page = new LoginPage(driver);
        page.clickSubmit();
    }

    @Then("I should see Job Search page")
    public void iShouldSeeJobSearchPage() {
        JobSearchPage page = new JobSearchPage(driver);
        Assert.assertTrue(page.jobSearchPageOpened());
    }
}
