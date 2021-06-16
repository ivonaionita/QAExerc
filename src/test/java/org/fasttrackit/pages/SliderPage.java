package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://demoqa.com/slider")
public class SliderPage extends PageObject {

    @FindBy(css=".range-slider")
    private WebElementFacade slider;

    public void moveSlider(){
        Actions move=new Actions(getDriver());
        Action action = (Action) move.dragAndDropBy(slider, 0, 12).build();
        action.perform();
    }
}
