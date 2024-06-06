package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    private final SelenideElement product = $(By.className("success"));
    private final SelenideElement placeOrderBtn = $(By.xpath("//button[@class='btn btn-success']"));
    private final SelenideElement usernameFld = $(By.id("name"));
    private final SelenideElement countryFld = $(By.id("country"));
    private final SelenideElement cityFld = $(By.id("city"));
    private final SelenideElement creditCardFld = $(By.id("card"));
    private final SelenideElement monthFld = $(By.id("month"));
    private final SelenideElement yearFld = $(By.id("year"));
    private final SelenideElement purchaseBtn = $(By.xpath("//button[@onclick='purchaseOrder()']"));

    public void isProductPresent() {
        product.should(Condition.appear);
    }

    public void clickToPlaceOrder() {
        placeOrderBtn
                .should(Condition.appear)
                .should(Condition.clickable)
                .click();
    }

    public CartPage enterName(String username){
        usernameFld.should(Condition.appear).sendKeys(username);
        return this;
    }

    public CartPage enterCountry(String country){
        countryFld.should(Condition.appear).sendKeys(country);
        return this;
    }

    public CartPage enterCity(String city){
        cityFld.should(Condition.appear).sendKeys(city);
        return this;
    }

    public CartPage enterCreditCard(String creditCard){
        creditCardFld.should(Condition.appear).sendKeys(creditCard);
        return this;
    }

    public CartPage enterMonth(String month){
        monthFld.should(Condition.appear).sendKeys(month);
        return this;
    }

    public CartPage enterYear(String year){
        yearFld.should(Condition.appear).sendKeys(year);
        return this;
    }

    public void clickToPurchase() {
        purchaseBtn
                .should(Condition.appear)
                .should(Condition.clickable)
                .click();
    }
}
