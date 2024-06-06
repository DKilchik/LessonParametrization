package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DevicePage;

public class DeviceStepDefs {

    DevicePage devicePage = new DevicePage();

    @Then("device page should be opened")
    public void isPageOpened(){
        devicePage.isOpened();
    }

    @When("user click to Add to Cart button")
    public void userClickToAddToCartButton() {
        devicePage.clickToAddToCart();
    }

    @And("confirm alert notification")
    public void confirmAlertNotification() {
        devicePage.confirmNotification();
    }
}
