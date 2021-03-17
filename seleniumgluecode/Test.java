package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Test extends TestBase {

    @Given("^El usuario se encuetra en la pantalla Home$")
    public void el_usuario_se_encuetra_en_la_pantalla_Home() throws Throwable {
        Assert.assertTrue(HomePage.homePageIsDisplayed());
    }

    @When("^El usuario selecciona el titulo The Little Tester Comics$")
    public void el_usuario_selecciona_el_titulo_The_Little_Tester_Comics() throws Throwable {
        HomePage.clickOnTitleComics();
    }

    @Then("^El sistema lo redireccionara a la pantalla Comics$")
    public void el_sistema_lo_redireccionara_a_la_pantalla_Comics() throws Throwable {
        Assert.assertTrue(ComicsPage.isTitleComicsDisplayed());

    }

}
