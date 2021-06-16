package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://demoqa.com/auto-complete")
public class AutoCompletePage extends PageObject {
    @FindBy(css = "#autoCompleteMultipleInput")
    private WebElementFacade autoCompleteField;
    @FindBy(css = ".auto-complete__multi-value__label")
    private WebElementFacade selectedColor;

    public void selectColor(String color) {
        autoCompleteField.click();
        autoCompleteField.sendKeys(color);
        autoCompleteField.sendKeys(Keys.ARROW_DOWN);
        autoCompleteField.sendKeys(Keys.ENTER);
    }

    public boolean verifyColor(String color) {
        return (selectedColor.getText().equals(color));
    }
}

