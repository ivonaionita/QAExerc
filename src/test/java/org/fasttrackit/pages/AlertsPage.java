package org.fasttrackit.pages;

import io.cucumber.java.cs.Ale;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

@DefaultUrl("https://demoqa.com/alerts")
public class AlertsPage extends PageObject {
    @FindBy(css = "#alertButton")
    private WebElementFacade clickAlert;
    @FindBy(css="#timerAlertButton")
    private WebElementFacade clickAlert5Sec;
    @FindBy(css="#confirmButton")
    private WebElementFacade confirmAlert;
    @FindBy(css="#promtButton")
    private WebElementFacade sendKeysAlert;

    public void openAlertPage() {
        open();
    }


    public void selectClickAlert() {
        //clickOn(clickAlert);
        clickAlert.click();
    }

   /* public void isAlertPresent() {
        try {
            //
            getDriver().switchTo().alert().accept();
            System.out.println(" Alert is Displayed");
        } catch (NoAlertPresentException ex) {
            System.out.println("Alert is NOT Displayed");
        }
    } */

    public void checkAlert(){

        waitFor(ExpectedConditions.alertIsPresent());
        Alert alert=getDriver().switchTo().alert();
        System.out.println(alert.getText());

    }

    public void selectAlertAfter5Sec(){
        clickOn(clickAlert5Sec);
    }

    public void checkAfter5SecAlert(){
        withTimeoutOf(Duration.ofSeconds(5)).waitFor(ExpectedConditions.alertIsPresent());
        System.out.println(getDriver().switchTo().alert().getText());
        getDriver().switchTo().alert().accept();
    }

    public void clickConfirmAlertButton(){
        clickOn(confirmAlert);
    }
    public void confirmAlert(){
        getDriver().switchTo().alert().accept();
    }

    public void clickSendKKeysAlert(){
        clickOn(sendKeysAlert);
    }
    public void typeInAlert(){
        //waitABit(5000);
        getDriver().switchTo().alert().sendKeys("test");
        System.out.println(getDriver().switchTo().alert().getText());
    }




}