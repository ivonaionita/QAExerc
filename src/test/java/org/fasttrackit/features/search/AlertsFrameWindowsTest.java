package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.AlertsFramesWindowsSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class AlertsFrameWindowsTest extends BaseTest {
    @Steps
    private AlertsFramesWindowsSteps alertsFramesWindowsSteps;

    @Test
    public void verifyAlert(){
        alertsFramesWindowsSteps.openAlertsPage();
        alertsFramesWindowsSteps.clickAlertButton();
        alertsFramesWindowsSteps.acceptAlert();
    }

    @Test
    public void verify5SecAlert(){
        alertsFramesWindowsSteps.openAlertsPage();
        alertsFramesWindowsSteps.click5SecAlertButton();
        alertsFramesWindowsSteps.check5SecAlert();
    }

    @Test
    public void confirmAlert(){
        alertsFramesWindowsSteps.openAlertsPage();
        alertsFramesWindowsSteps.selectConfirmAlert();
        alertsFramesWindowsSteps.confirmAlert();
    }

    @Test
    public void sendKeysToAlert(){
        alertsFramesWindowsSteps.openAlertsPage();
        alertsFramesWindowsSteps.clickSendKeysAlert();
        alertsFramesWindowsSteps.completeAlert("test");
    }

    @Test
    public void switchToFrame1(){
        alertsFramesWindowsSteps.openFramesPage();
        alertsFramesWindowsSteps.switchFrame1();
     //   alertsFramesWindowsSteps.verifyFrame1();
    }
    @Test
    public void checkNumberOfFrames(){
        alertsFramesWindowsSteps.openFramesPage();
        alertsFramesWindowsSteps.verifyNumberOfFrames();
    }

    @Test
    public void verifySmallModal(){
        alertsFramesWindowsSteps.openModalDialogPage();
        alertsFramesWindowsSteps.openSmallModal();
        alertsFramesWindowsSteps.verifySmallModal();
        alertsFramesWindowsSteps.closeSmallModal();
    }

}
