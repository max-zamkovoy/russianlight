package ru.rs.page;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

@PageUrl("/")
public class HomePage extends FluentPage {

    @FindBy(className = "suggest-city-btn-confirm")
    private FluentWebElement suggestCityButton;

    public void clickOnSuggestCityButton() {
        suggestCityButton.click();
    }

}
