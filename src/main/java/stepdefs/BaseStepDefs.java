package stepdefs;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.BasePage;

public class BaseStepDefs {

    BasePage basePage = new BasePage();

    @Given("application is opened")
    public void appOpened(){

    }

    @And("Sleep {int}")
    public void sleep(int milliseconds){
        Selenide.sleep(milliseconds);
    }

    @And("user navigate to Cart Page")
    public void userNavigateToCartPage() {
        basePage.navigateToCart();
    }

    @When("pass some {string} parameter")
    public void passSomeParameter(String arg0) {
        System.out.println(arg0);
    }

    @When("user click to buy {string} phone")
    public void userClickToBuyPhone(String arg0) {
        System.out.println(arg0);
    }

    @And("user select {string}")
    public void userSelectTariffPlan() {
    }
}
