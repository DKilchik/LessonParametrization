package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private final SelenideElement firstItem = $(By.xpath("//h4[@class=\"card-title\"]/a"));

    public void selectCategory(String category){
        $(By.xpath(String.format("//a[@onclick=\"byCat('%s')\"]", category)))
                .should(Condition.appear)
                .should(Condition.clickable)
                .click();
    }

    public void clickToFirstItem(){
        firstItem
                .should(Condition.appear)
                .should(Condition.clickable)
                .click();
    }
}
