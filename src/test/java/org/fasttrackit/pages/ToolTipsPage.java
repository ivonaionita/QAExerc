package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://demoqa.com/tool-tips")
public class ToolTipsPage extends PageObject {
    @FindBy(css="#toolTipButton")
    private WebElementFacade hooverButton;


    public void hooverOverButton() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(hooverButton).perform();
    }

     public boolean verifyHoover(){
        if(hooverButton.getAttribute("aria-describedby").contains("buttonToolTip")){
            return true;
        }return false;
    }

}
