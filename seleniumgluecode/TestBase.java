package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pom.comicsPage;
import pom.homePage;

public class TestBase {

    protected WebDriver driver = Hooks.getDriver();
    protected homePage HomePage = PageFactory.initElements(driver, homePage.class);
    protected comicsPage ComicsPage= PageFactory.initElements(driver, comicsPage.class);

}
