package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class DevicePage {

    private final SelenideElement moreInfo = $(By.id("more-information"));
    private final SelenideElement clickToCart = $(By.xpath("//a[@onclick='addToCart(1)']"));

    public void isOpened(){
        moreInfo.should(Condition.appear);

    }

    public void clickToAddToCart() {
        clickToCart
                .should(Condition.appear)
                .should(Condition.clickable)
                .click();
    }

    public void confirmNotification() {
        switchTo().alert(Duration.ofSeconds(5)).accept();
    }
}
