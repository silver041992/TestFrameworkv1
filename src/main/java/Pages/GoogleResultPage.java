package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleResultPage extends GoogleMainSearchPage {

    public By firstResultLink = By.xpath("//div[@class='g']//a[1]");

    public GoogleResultPage(WebDriver driver) {
        super(driver);
    }

}
