package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


@DefaultUrl("https://demoqa.com/progress-bar")
public class ProgressBarPage extends PageObject {

    @FindBy(css="#startStopButton")
    private WebElementFacade startButton;
    @FindBy(css="#progressBar > div")
    private WebElementFacade progressBar;


    public void clickStart(){
        clickOn(startButton);
    }

    public void waitForComplete() {

        waitFor(ExpectedConditions.attributeContains(progressBar, "style", "width: 48%"));
        System.out.println("48%");
        clickOn(startButton);
        System.out.println("stop");

    }


}
