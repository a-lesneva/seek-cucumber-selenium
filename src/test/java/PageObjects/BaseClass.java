package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {
    public static WebDriver driver;

    public BaseClass(WebDriver driver){
        BaseClass.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    public static void init(){
//        System.setProperty("webdriver.chrome.driver", "/Users/alesneva/Tools/chromedriver 2");
//        driver = new ChromeDriver();
//    }
}