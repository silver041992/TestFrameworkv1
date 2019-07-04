package Pages;

import Util.BaseUtil;
import org.openqa.selenium.WebDriver;


public class BasePage extends BaseUtil {

    private WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver=driver;
    }


    public WebDriver getWebDriver() {
        return driver;
    }
}
