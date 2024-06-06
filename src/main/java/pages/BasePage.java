package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    private final SelenideElement cartBtn = $(By.id("cartur"));

    public void navigateToCart() {
        cartBtn.should(Condition.clickable).click();
    }
}
