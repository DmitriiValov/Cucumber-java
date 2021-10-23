package io.cucumber.simple;

import io.cucumber.java.en.Given;
import io.cucumber.simple.pages.soglasie.OsagoPage;

public class OsagoSteps {

    @Given("I verify OSAGO page is opened")
    public void isOsagoPageOpened() {
        new OsagoPage().isOsago();
    }
}
