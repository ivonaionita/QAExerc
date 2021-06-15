package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

@DefaultUrl("https://demoqa.com/auto-complete")
public class AutoCompletePage extends PageObject {
        @FindBy(css="#autoCompleteMultipleInput")
        private WebElementFacade autoCompleteField;
        @FindBy(css="div.css-12jo7m5.auto-complete__multi-value__label")
        private WebElementFacade selectedColor;

    public void openAutoCompletePage(){
        open();
    }

    public void selectColor(String color) throws InterruptedException {

        autoCompleteField.click();
        autoCompleteField.sendKeys(color);
        Thread.sleep(2000);
        autoCompleteField.sendKeys(Keys.ARROW_DOWN);
        autoCompleteField.sendKeys(Keys.ENTER);
    }

    public void verifyColorIsSelected(String displayedColor) {
        Assert.assertEquals(displayedColor,selectedColor.getText());
    }
}

