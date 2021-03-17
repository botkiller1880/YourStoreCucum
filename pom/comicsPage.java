package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class comicsPage extends BasePage {

    @FindBy(xpath = "/html/body/div[1]/section/div/div/div/div/header/h1/span")
    private WebElement pageTitleLocation;

    private String titlePage = "comics";

    public comicsPage(WebDriver driver){
        super(driver);
    }

    public boolean isTitleComicsDisplayed() throws Exception {
        return this.getText(pageTitleLocation).equals(titlePage);
    }

}
