import Pages.GoogleMainSearchPage;
import Pages.GoogleResultPage;
import TestUtil.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;

public class GoogleTest extends BaseTest {

    @Test
    public void runPageTest(){
        openUrl("https://www.google.ru/");
        Assert.assertEquals("Google",getWebDriver().getTitle());
    }
    @Title("check find results by input text to searchLine")
    @Test
    public void searchTest(){
        openUrl("https://www.google.ru/");
        GoogleMainSearchPage searchPage = new GoogleMainSearchPage(getWebDriver());
        Assert.assertEquals("Google",getWebDriver().getTitle());
        fillField(searchPage.searchField,"Hello, World!");
        GoogleResultPage resultPage = new GoogleResultPage(getWebDriver());
        Assert.assertTrue($(resultPage.firstResultLink).getText().contains("Hello, world!"));
    }
}