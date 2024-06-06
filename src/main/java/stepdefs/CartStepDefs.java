package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;

public class CartStepDefs {
    CartPage cartPage = new CartPage();

    @Then("product should be in the cart")
    public void isProductPresent (){
        cartPage.isProductPresent();
        }

    @When("user click to Place Order button")
    public void userClickToPlaceOrderButton() {
        cartPage.clickToPlaceOrder();
    }

    @And("fill form with valid date")
    public void fillFormWithValidDate() {
        cartPage
                .enterName("Jhon")
                .enterCountry("France")
                .enterCity("Paris")
                .enterCreditCard("1234123412341234")
                .enterMonth("10")
                .enterYear("2028");
    }

    @And("click to Purchase button")
    public void clickToPurchaseButton() {
        cartPage.clickToPurchase();
    }
}
