package org.fasttrackit.pages;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;


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


    public void selectClickAlert() {
        clickAlert.click();
    }

    public void checkAlert(){
        waitFor(ExpectedConditions.alertIsPresent());
        Alert alert=getDriver().switchTo().alert();
    }

    public void selectAlertAfter5Sec(){
        clickOn(clickAlert5Sec);
    }

    public void checkAfter5SecAlert(){
        withTimeoutOf(Duration.ofSeconds(5)).waitFor(ExpectedConditions.alertIsPresent());
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
        getDriver().switchTo().alert().sendKeys("test");
    }




}