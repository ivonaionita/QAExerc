package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://demoqa.com/select-menu")
public class SelectMenuPage extends PageObject {
    @FindBy(css="#withOptGroup")
    private WebElementFacade selectValues;

    public void openPage(){
        open();
    }
    public void openValues(){
        clickOn(selectValues);
    }

}
