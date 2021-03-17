package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class homePage extends BasePage {

    @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/div/div/nav[1]/div/ul/li[2]/a")
    private WebElement titleComicsLocatorNotCached;

    @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/div/div/nav[1]/div/ul/li[2]/a")
    @CacheLookup
    private WebElement titleComicsLocator;

    private String titleHomePage = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";

    public homePage(WebDriver driver){
        super(driver);
    }

    public boolean homePageIsDisplayed() throws Exception {
        return this.getTitle().equals(titleHomePage);
    }

    public void clickOnTitleComics() throws Exception {
        this.click(titleComicsLocator);
    }

}
