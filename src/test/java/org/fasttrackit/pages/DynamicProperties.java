package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://demoqa.com/dynamic-properties")
public class DynamicProperties extends PageObject {

    @FindBy(css="#enableAfter")
    private WebElementFacade fiveSecButton;
    @FindBy(css="#visibleAfter")
    private WebElementFacade visibleAfterFiveButton;


    public void clickFiveSecButton(){
        clickOn(fiveSecButton);
    }

    public boolean verifyFiveSeconds(){
        if (visibleAfterFiveButton.isDisplayed()){
            return true;
        }return false;
    }
}
