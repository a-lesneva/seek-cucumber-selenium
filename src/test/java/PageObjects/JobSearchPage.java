package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class JobSearchPage extends BasePage{

    public JobSearchPage(WebDriver driver) {
        super(driver);
    }

    public static String pageUrl = "https://www.seek.com.au";
    public static String title = "SEEK - Australia's no. 1 jobs, employment, career and recruitment site";

    @FindBy(how = How.CSS, using = "#app > div > div > header > div > span > nav > ul > li:nth-child(1) > a")
    public static WebElement menuJobSearch;

    public JobSearchPage openPage(){
        openBasePage(pageUrl);
        return new JobSearchPage(driver);
    }

    public boolean jobSearchPageOpened(){
        JobSearchPage page = new JobSearchPage(driver);
        return driver.getCurrentUrl().contentEquals(page.pageUrl);
    }
}
