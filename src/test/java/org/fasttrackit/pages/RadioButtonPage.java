package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://demoqa.com/radio-button")
public class RadioButtonPage extends PageObject {

    @FindBy(css="#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > div:nth-child(2) > label")
    private WebElementFacade yesButton;
    @FindBy(css=".text-success")
    private WebElementFacade selectedMessage;

    public void openRadioButtonPage(){
        open();
    }
    public void clickYes(){
        clickOn(yesButton);
    }
    public void verifyMessage(){
        selectedMessage.containsText("Yes");
    }


}
