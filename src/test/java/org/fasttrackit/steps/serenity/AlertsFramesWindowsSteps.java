package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AlertsPage;
import org.fasttrackit.pages.FramesPage;
import org.fasttrackit.pages.ModalDialogsPage;
import org.junit.Assert;

public class AlertsFramesWindowsSteps {
    private AlertsPage alertsPage;
    private FramesPage framesPage;
    private ModalDialogsPage modalDialogsPage;

   //Alerts
    @Step
    public void openAlertsPage(){
        alertsPage.open();
    }
    @Step
    public void clickAlertButton(){
        alertsPage.selectClickAlert();
    }
    @Step
    public void acceptAlert(){
      alertsPage.checkAlert();
    }
    @Step
    public void click5SecAlertButton(){
        alertsPage.selectAlertAfter5Sec();
    }
    @Step
    public void check5SecAlert(){
        alertsPage.checkAfter5SecAlert();
    }
    @Step
    public void selectConfirmAlert(){
        alertsPage.clickConfirmAlertButton();
    }
    @Step
    public void confirmAlert(){
        alertsPage.confirmAlert();
    }
    @Step
    public void clickSendKeysAlert(){
        alertsPage.clickSendKKeysAlert();
    }
    @Step
    public void completeAlert(){
        alertsPage.typeInAlert();
    }

    //Frames
    @Step
    public void openFramesPage(){
        framesPage.open();
    }
    @Step
    public void switchFrame1(){
        framesPage.switchToFrame1();
    }
    @Step
    public void verifyFrame1(){
        framesPage.getTextFromFrame1();
    }
    @Step
    public void verifyNumberOfFrames(){
        framesPage.noOfFrames();
    }

    //Modal Dialogs page

    @Step
    public void openModalDialogPage(){
        modalDialogsPage.open();
    }
    @Step
    public void openSmallModal(){
        modalDialogsPage.clickSmallModal();
    }
    @Step
    public void verifySmallModal(){
        Assert.assertTrue(modalDialogsPage.verifySmallModalMsg());
    }

    @Step
    public void closeSmallModal(){
        modalDialogsPage.clickCloseSmallModal();
    }
}