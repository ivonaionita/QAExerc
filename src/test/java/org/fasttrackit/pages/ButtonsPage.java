package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import java.sql.Driver;

@DefaultUrl("https://demoqa.com/buttons")
public class ButtonsPage extends PageObject {

    @FindBy(css=".col-12.mt-4.col-md-6  div div:nth-child(1) [type=\"button\"]")
    private WebElementFacade doubleClickButton;
    @FindBy(id="doubleClickMessage")
    private WebElementFacade doubleClickSuccess;
    @FindBy(css=".col-12.mt-4.col-md-6  div div:nth-child(3) [type=\"button\"]")
    private WebElementFacade clickButton;
    @FindBy(css="#dynamicClickMessage")
    private WebElementFacade clickSuccessMessage;
    @FindBy(css=".col-12.mt-4.col-md-6  div div:nth-child(2) [type=\"button\"]")
    private WebElementFacade rightClickButton;
    @FindBy(css="#rightClickMessage")
    private WebElementFacade rightClickSuccessMessage;

    public void doubleClick(){
        Actions action=new Actions(getDriver());
        action.doubleClick(doubleClickButton).perform();
    }

   public void successMessageIsDisplayed(){
       doubleClickSuccess.containsText("You have done a double click");
    }

    public void clickButton(){
        clickOn(clickButton);
    }

    public void clickSuccessMessage(){
        clickSuccessMessage.containsText("You have done a dynamic click");
    }

    public void clickRightClickButtton(){
        Actions action=new Actions(getDriver());
        action.contextClick(rightClickButton).perform();
    }
    public void rightClickSuccessMessage(){
        rightClickSuccessMessage.containsText("You have done a right click");
    }
}
