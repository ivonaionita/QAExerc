package org.fasttrackit.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;

public class BasePage extends PageObject {

    public void doubleClick(WebElementFacade element) {
        Actions action = new Actions(getDriver());
        action.doubleClick(element).perform();
    }
}
