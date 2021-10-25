package io.cucumber.simple;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.cucumber.simple.pages.soglasie.OsagoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class OsagoSteps {

    @Given("I verify OSAGO page is opened")
    public void isOsagoPageOpened() {
        new OsagoPage().isOsago();
    }

    @Given("I fill Name Osago claim form with values")
    public void fillOsagoClaimFormName(List<String> params){
        OsagoPage page = new OsagoPage();
        page.fillName(params.get(0));
        page.fillPhone(params.get(1));
        page.fillEmail(params.get(2));
        page.fillCity(params.get(3));
        page.fillNote(params.get(4));
        page.clickAgree();
        Selenide.sleep(10000);
    }


}
