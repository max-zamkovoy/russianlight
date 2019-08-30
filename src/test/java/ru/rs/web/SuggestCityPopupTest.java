package ru.rs.web;

import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.example.spring.ExampleFluentTest;
import org.junit.Test;
import ru.rs.page.HomePage;

public class SuggestCityPopupTest extends ExampleFluentTest {

    @Page
    private HomePage homePage;

    @Test
    public void suggestCityPopup() {
        goTo(homePage)
                .clickOnSuggestCityButton();
    }
}
