package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.fasttrackit.utils.BasePage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;


@DefaultUrl("https://demoqa.com/alerts")
public class AlertsPage extends BasePage {
    @FindBy(css = "#alertButton")
    private WebElementFacade clickAlert;
    @FindBy(css = "#timerAlertButton")
    private WebElementFacade clickAlert5Sec;
    @FindBy(css = "#confirmButton")
    private WebElementFacade confirmAlert;
    @FindBy(css = "#promtButton")
    private WebElementFacade sendKeysAlert;


    public void selectClickAlert() {
        clickAlert.click();
    }

    public void checkAlert() {
        verifyAlert();
    }

    public void selectAlertAfter5Sec() {
        clickOn(clickAlert5Sec);
    }

    public void checkAfter5SecAlert() {
        withTimeoutOf(Duration.ofSeconds(5)).waitFor(ExpectedConditions.alertIsPresent());
        acceptAlert();
    }

    public void clickConfirmAlertButton() {
        clickOn(confirmAlert);
    }

    public void confirmAlert() {
        acceptAlert();
    }

    public void clickSendKKeysAlert() {
        clickOn(sendKeysAlert);
    }

    public void typeInAlert(String text) {
        sendKeysToAlert(text);
    }


}