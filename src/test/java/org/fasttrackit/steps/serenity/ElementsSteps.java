package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;
import org.junit.Assert;

public class ElementsSteps {
    private TextBoxPage textBoxPage;
    private CheckBoxPage checkBoxPage;
    private RadioButtonPage radioButtonPage;
    private WebTablesPage webTablesPage;
    private ButtonsPage buttonsPage;
    private LinksPage linksPage;
    private BrokenLinksPage brokenLinksPage;
    private UploadAndDownLoadPage uploadAndDownLoadPage;
    private DynamicProperties dynamicProperties;


    //Text Box
    @Step
    public void openTextBoxPage() {
        textBoxPage.open();
    }

    @Step
    public void completeFullNameField(String text) {
        textBoxPage.completeFullNameField(text);
    }

    @Step
    public void completeEmailField(String email) {
        textBoxPage.typeEmail(email);
    }

    @Step
    public void completeAddress(String address) {
        textBoxPage.typeAddress(address);
    }

    @Step
    public void completeAddress2(String address) {
        textBoxPage.typeAddress2(address);
    }

    @Step
    public void submitFrom() {
        textBoxPage.clickSubmit();
    }

    @Step
    public void verifyForm(String name, String address, String address2) {
        Assert.assertTrue(textBoxPage.verifyForm(name, address, address2));
    }

    //Check Box
    @Step
    public void openCheckBoxPage() {
        checkBoxPage.open();
    }

    @Step
    public void selecctHomeFolder() {
        checkBoxPage.clickCheckBox();
    }

    @Step
    public void verifySuccessMessage() {
        checkBoxPage.successMessageIsDisplayed();
    }


    //Radio Button
    @Step
    public void openRadioButtonPage() {
        radioButtonPage.open();
    }

    @Step
    public void selectOption() {
        radioButtonPage.clickYes();
    }

    @Step
    public void verifyOption() {
        radioButtonPage.verifyMessage();
    }

    //Web Tables
    @Step
    public void openWebTablesPage() {
        webTablesPage.open();
    }

    @Step
    public void addRegister() {
        webTablesPage.clickAdd();
    }

    @Step
    public void completeFirstNameFieldRF(String name) {
        webTablesPage.typeFirstName(name);
    }

    @Step
    public void completeLastNameFieldRF(String name) {
        webTablesPage.typeLastName(name);
    }

    @Step
    public void completeEmailFieldRF(String email) {
        webTablesPage.typeEmail(email);
    }

    @Step
    public void completeAgeFieldRF(int age) {
        webTablesPage.typeAge(age);
    }

    @Step
    public void completeSalaryFieldRF(int salary) {
        webTablesPage.typeSalary(salary);
    }

    @Step
    public void completeDepartmentFieldRF(String department) {
        webTablesPage.typeDepartment(department);
    }

    @Step
    public void submitRegistrationForm() {
        webTablesPage.clickSubmit();
    }

    @Step
    public void verifyRegistrationTable(String firstName, String lastName) {
        Assert.assertTrue(webTablesPage.isElementInTable(firstName, lastName));
    }

    //Buttons
    @Step
    public void openButtonsPage() {
        buttonsPage.open();
    }

    @Step
    public void doubleClickButton() {
        buttonsPage.doubleClick();
    }

    @Step
    public void verifyDoubleClick() {
        buttonsPage.successMessageIsDisplayed();
    }

    @Step
    public void clickButton() {
        buttonsPage.clickButton();
    }

    @Step
    public void verifyClickSuccessMessage() {
        buttonsPage.clickSuccessMessage();
    }

    @Step
    public void clickRightButton() {
        buttonsPage.clickRightClickButtton();
    }

    @Step
    public void verifyRightClickSuccess() {
        buttonsPage.rightClickSuccessMessage();
    }

    //Links
    @Step
    public void openLinksPage() {
        linksPage.open();
    }

    @Step
    public void clickHomeLink() {
        linksPage.clickHomeLink();
    }

    @Step
    public void switchTab() {
        linksPage.switchNewTab();
    }

    //Broken links page
    @Step
    public void openBrokenLinksPage() {
        brokenLinksPage.open();
    }

    @Step
    public void clickOnValidLink() {
        brokenLinksPage.clickValidLink();
    }

    @Step
    public void verifyValidLink() {
        brokenLinksPage.verifyValidLink();
    }

    //Upload&Download Page
    @Step
    public void openDwnldPage() {
        uploadAndDownLoadPage.open();
    }

    @Step
    public void clickDownloadBttn() {
        uploadAndDownLoadPage.clickDwnld();
    }

    @Step
    public void checkFile() {
        uploadAndDownLoadPage.checkFile("\"C:\\\\Users\\\\ivonaionita\\\\Downloads", "sampleFile");
    }

    @Step
    public void chooseFile() {
        uploadAndDownLoadPage.clickUploadFile();
    }

    @Step
    public void uploadSelectedFile() {
        uploadAndDownLoadPage.uploadFile();
    }

    //Dynamic Properties Page
    @Step
    public void openPropertiePage() {
        dynamicProperties.open();
    }

    @Step
    public void enableProp() {
        dynamicProperties.clickFiveSecButton();
    }

    @Step
    public void verifyFiveSeconds() {
        Assert.assertTrue(dynamicProperties.verifyFiveSeconds());
    }


}
