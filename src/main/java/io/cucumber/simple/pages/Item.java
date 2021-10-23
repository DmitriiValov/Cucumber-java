package io.cucumber.simple.pages;

import com.codeborne.selenide.SelenideElement;

import java.util.Objects;

public class Item {

    private final SelenideElement root;

    public Item(SelenideElement root) {
        this.root = root;
    }

    public String getTitle() {
        return root.$("label").getText();
    }

    public boolean isChecked() {
        return Objects.requireNonNull(root.getAttribute("class")).equalsIgnoreCase("completed");
    }

    public void toggleItem() {
        root.$("input").click();
    }
}
