package io.cucumber.simple.pages.soglasie;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$x;

public class SoglasieMainPage {

    private static final String OSAGO_BUTTON = "//*[@id=\"__layout\"]/div/div[3]/div[3]/div/div/div/div/div[1]/a";

    public void openOsago() {
        $x(OSAGO_BUTTON).scrollTo().click();
    }
}
