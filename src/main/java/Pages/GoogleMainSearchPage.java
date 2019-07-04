package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleMainSearchPage extends BasePage{

    public By searchField = By.name("q");


    public GoogleMainSearchPage(WebDriver driver) {
        super(driver);
    }
}
