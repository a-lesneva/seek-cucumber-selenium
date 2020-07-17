package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage extends BaseClass{

    public BasePage(WebDriver driver) {
        super(driver);
    }

    public void openBasePage(String url){
        driver.get(url);
    }

    public boolean isPageOpened(String title){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs(title));
        return driver.getTitle().contentEquals(title);
    }
}
