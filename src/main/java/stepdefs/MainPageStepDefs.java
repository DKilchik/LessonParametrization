package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.MainPage;

public class MainPageStepDefs {

    MainPage mainPage = new MainPage();

    @When("user select {string} category")
    public void selectCategory(String category){
        mainPage.selectCategory(category);
    }

    @And("user click to first item in the list")
    public void userClickToFirstItemInTheList() {
        mainPage.clickToFirstItem();
    }
}
