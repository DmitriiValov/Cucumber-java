package io.cucumber.simple.pages.soglasie;

import static com.codeborne.selenide.Selenide.$;

public class OsagoPage {

    private static final String OSAGO_CAPTION = "#__layout > div > div.detail-product-page.osago > div.main-slider > div > div > div > div > div > div > div > div > div > div > h1";

    public void isOsago() {
        $(OSAGO_CAPTION).isDisplayed();
    }
}
