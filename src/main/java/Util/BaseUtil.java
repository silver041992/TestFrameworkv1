package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class BaseUtil {

    public abstract WebDriver getWebDriver();


    public void openUrl(String url){
        getWebDriver().get(url);
    }


    /**
     * return WebElement witch find by input locator
     * @param locator
     * @return WebElement
     */
    public WebElement $(By locator){
        return getWebDriver().findElement(locator);
    }

    public WebElement $(String locator){
        return getWebDriver().findElement(By.xpath(locator));
    }

    public List<WebElement> $$(By locator){
        return getWebDriver().findElements(locator);
    }
}
