package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.ElementsSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class ElementsTest extends BaseTest {
    @Steps
    private ElementsSteps elementsSteps;

    @Test
    public void textBoxTest(){
        elementsSteps.openTextBoxPage();
        elementsSteps.completeFullNameField("ana");
        elementsSteps.completeEmailField("alabala@ana.com");
        elementsSteps.completeAddress("str1");
        elementsSteps.completeAddress2("str2");
        elementsSteps.submitFrom();
        elementsSteps.verifyForm("ana","str1","str2");
    }

    @Test
    public void checkBoxTest(){
        elementsSteps.openCheckBoxPage();
        elementsSteps.selecctHomeFolder();
        elementsSteps.verifySuccessMessage();
    }

    @Test
    public void radioButtonTest(){
        elementsSteps.openRadioButtonPage();
        elementsSteps.selectOption();
        elementsSteps.verifyOption();
    }
    @Test
    public void addElementInWebTableTest(){
        elementsSteps.openWebTablesPage();
        elementsSteps.addRegister();
        elementsSteps.completeFirstNameFieldRF("ana");
        elementsSteps.completeLastNameFieldRF("asa");
        elementsSteps.completeEmailFieldRF("a@yahoo.com");
        elementsSteps.completeAgeFieldRF(23);
        elementsSteps.completeSalaryFieldRF(1000);
        elementsSteps.completeDepartmentFieldRF("legal");
        elementsSteps.submitRegistrationForm();
        elementsSteps.verifyRegistrationTable("ana","asa");
    }

    @Test
    public void doubleClickButton(){
        elementsSteps.openButtonsPage();
        elementsSteps.doubleClickButton();
        elementsSteps.verifyDoubleClick();
    }

    @Test
    public void clickOnButton(){
        elementsSteps.openButtonsPage();
        elementsSteps.clickButton();
        elementsSteps.verifyClickSuccessMessage();
    }

    @Test
    public void rightClickOnButton(){
        elementsSteps.openButtonsPage();
        elementsSteps.clickRightButton();
        elementsSteps.verifyRightClickSuccess();
    }

    @Test
    public void openNewTabLink(){
        elementsSteps.openLinksPage();
        elementsSteps.clickHomeLink();
        elementsSteps.switchTab();
    }

    @Test
    public void verifyValidLink(){
        elementsSteps.openBrokenLinksPage();
        elementsSteps.clickOnValidLink();
        elementsSteps.verifyValidLink();
    }

    @Test
    public void downloadFile(){
        elementsSteps.openDwnldPage();
        elementsSteps.clickDownloadBttn();
        elementsSteps.checkFile();

    }

    @Test
    public void uploadFile(){
        elementsSteps.openDwnldPage();
//        elementsSteps.chooseFile();
        elementsSteps.uploadSelectedFile();
    }

    @Test
    public void checkDynamicButton(){
        elementsSteps.openPropertiePage();
        elementsSteps.enableProp();
        elementsSteps.verifyFiveSeconds();
    }

}
