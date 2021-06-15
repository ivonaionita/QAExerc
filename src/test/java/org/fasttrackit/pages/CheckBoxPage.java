package org.fasttrackit.pages;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://demoqa.com/checkbox")
public class CheckBoxPage extends PageObject {

    @FindBy(css=".rct-checkbox [fill=\"currentColor\"] ")
    private WebElementFacade checkBox;
    @FindBy(css="#result")
    private WebElementFacade successMessage;


    public void clickCheckBox(){
        clickOn(checkBox);
    }

    public void successMessageIsDisplayed(){
        shouldBeVisible(successMessage);
    }
}
