package org.fasttrackit.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends PageObject {

    public void clickRightOnButton(WebElementFacade element) {
        Actions action = new Actions(getDriver());
        action.contextClick(element).perform();
    }

    public void doubleClick(WebElementFacade element) {
        Actions action = new Actions(getDriver());
        action.doubleClick(element).perform();
    }

    public void verifyAlert() {
        waitFor(ExpectedConditions.alertIsPresent());
        getDriver().switchTo().alert();
    }

    public void acceptAlert() {
        getDriver().switchTo().alert().accept();
    }

    public void sendKeysToAlert(String text) {
        getDriver().switchTo().alert().sendKeys(text);
    }
}
