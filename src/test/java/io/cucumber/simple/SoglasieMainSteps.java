package io.cucumber.simple;

import io.cucumber.java.en.Given;
import io.cucumber.simple.pages.soglasie.SoglasieMainPage;

import static com.codeborne.selenide.Selenide.open;

public class SoglasieMainSteps {

    @Given("I open Soglasie Main Page")
    public void openSoglasieMain() {
        open("https://www.soglasie.ru/individuals/avto/");
    }

    @Given("I select OSAGO department")
    public void selectOsago() {
        new SoglasieMainPage().openOsago();
    }
}
