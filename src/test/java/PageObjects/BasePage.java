package PageObjects;

import org.openqa.selenium.WebDriver;

public class BasePage extends BaseClass{

    public BasePage(WebDriver driver) {
        super(driver);
    }

    public void openBasePage(String url){
        driver.get(url);
    }
}
