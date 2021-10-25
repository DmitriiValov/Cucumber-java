package io.cucumber.simple.pages.soglasie;

import com.codeborne.selenide.Selenide;
import jdk.jshell.spi.ExecutionControl;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class OsagoPage {

    private static final String OSAGO_CAPTION = "#__layout > div > div.detail-product-page.osago > div.main-slider > div > div > div > div > div > div > div > div > div > div > h1";
    private static final String OSAGO_CLAIM_FORM_NAME = "//*[@id=\'form\']/div[2]/div[1]/div/div[2]/input";
    private static final String OSAGO_CLAIM_FORM_PHONE = "//*[@id=\"form\"]/div[2]/div[2]/div/div[2]/input";
    private static final String OSAGO_CLAIM_FORM_EMAIL = "//*[@id=\"form\"]/div[2]/div[3]/div/div[2]/input";
    private static final String OSAGO_CLAIM_FORM_CITY = "//*[@id=\"form\"]/div[2]/div[4]/div/div[2]/input";
    private static final String OSAGO_CLAIM_FORM_NOTE = "//*[@id=\"form\"]/div[2]/div[5]/div/div[2]/textarea";
    private static final String AGREE_PERSONALDATA = "//*[@id=\"form\"]/div[2]/div[6]/label/input";

    public void isOsago() {
        $(OSAGO_CAPTION).isDisplayed();
    }

//    public void fillWithValue(String value, String field) {
//        $x(field)
//                .scrollTo()
//                .setValue(value)
//                .sendKeys(Keys.ENTER);
//
//    }

    public void fillName(String item) {
        $x(OSAGO_CLAIM_FORM_NAME)
                .scrollTo()
                .setValue(item)
                .sendKeys(Keys.ENTER);
    }

    public void fillPhone(String item) {
        $x(OSAGO_CLAIM_FORM_PHONE)
                .scrollTo()
                .setValue(item)
                .sendKeys(Keys.ENTER);
    }

    public void fillEmail(String item) {
        $x(OSAGO_CLAIM_FORM_EMAIL)
                .scrollTo()
                .setValue(item)
                .sendKeys(Keys.ENTER);
    }

    public void fillCity(String item) {
        $x(OSAGO_CLAIM_FORM_CITY)
                .scrollTo()
                .setValue(item)
                .sendKeys(Keys.ENTER);
    }

    public void fillNote(String item) {
        $x(OSAGO_CLAIM_FORM_NOTE)
                .scrollTo()
                .setValue(item)
                .sendKeys(Keys.ENTER);
    }

    public void clickAgree() {
        JavascriptExecutor executor = (JavascriptExecutor) Selenide.webdriver();
        executor.executeScript("arguments[0].click();", $x(AGREE_PERSONALDATA));
    }
}
