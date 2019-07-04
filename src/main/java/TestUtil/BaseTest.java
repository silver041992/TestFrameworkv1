package TestUtil;

import Util.BaseUtil;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest extends BaseUtil {

    public static WebDriver driver;

    /**
     * initialize WebDriver
     */
    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    public WebDriver getWebDriver() {
        return driver;
    }

    /**
     * fill element input text and press ENTER
     * @param field
     * @param line
     */
    public void fillField(WebElement field,String line){
        field.clear();
        field.sendKeys(line, Keys.ENTER);
    }

    public void fillField(By locatorFieldElement, String line){
        fillField($(locatorFieldElement),line);
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
