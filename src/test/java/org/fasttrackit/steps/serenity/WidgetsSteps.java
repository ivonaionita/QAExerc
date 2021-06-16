package org.fasttrackit.steps.serenity;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;
import org.junit.Assert;

public class WidgetsSteps {
    private AccordianPage accordianPage;
    private AutoCompletePage autoCompletePage;
    private DatePickerPage datePickerPage;
    private SliderPage sliderPage;
    private ProgressBarPage progressBarPage;
    private ToolTipsPage toolTipsPage;
    private SelectMenuPage selectMenuPage;

    //Accodridan Page

    @Step
    public void openAccordianPage(){
        accordianPage.open();
    }
    @Step
    public void extendSection(){
        accordianPage.clickSection();
    }
    @Step
    public void verifyExtendedSection(){
        Assert.assertTrue(accordianPage.verifyOpenedSection());
    }

    //AutoComplete Page

    @Step
    public void openAutoComplete(){
        autoCompletePage.open();
    }
    @Step
    public void selectColor(String color) throws InterruptedException {
        autoCompletePage.selectColor(color);
    }
    @Step
    public void verifySpecificColorIsSelected(String displayedColor){
       Assert.assertTrue(autoCompletePage.verifyColor(displayedColor));
    }


    //Date picker Page

    @Step
    public void openDatePickerPage(){
        datePickerPage.open();
    }
    @Step
    public void clickDatePicker(){
        datePickerPage.clickDatePicker();
    }
    @Step
    public void selectDate(){
        datePickerPage.selectDate();
    }
    @Step
    public void checkSelectedDate(String date){
        Assert.assertTrue(datePickerPage.checkDateIsCorrect(date));
    }

    //Slider Page
    @Step
    public void openSliderPage(){
        sliderPage.open();
    }
    @Step
    public void moveSlider(){
        sliderPage.moveSlider();
    }

    //Progress Bar Page
    @Step
    public void openProgressBarPage(){
        progressBarPage.open();
    }
    @Step
    public void startProgress(){
        progressBarPage.clickStart();
    }
    @Step
    public void checkProgress(){
        progressBarPage.waitForComplete();
    }

    //Tool tips page

    @Step
    public void openToolTipsPage(){
     toolTipsPage.open();
    }
    @Step
    public void hooverOverElement(){
        toolTipsPage.hooverOverButton();
    }
    @Step
    public void checkHoover(){
       Assert.assertTrue(toolTipsPage.verifyHoover());
    }

    //Select Menu Page

    @Step
    public void openSelectMenuPage(){
        selectMenuPage.open();
    }
    @Step
    public void openValuesList(){
        selectMenuPage.openValues();
    }
    @Step
    public void checkSelectedOption(String option){
        Assert.assertTrue(selectMenuPage.verifySelectedOption(option));
    }

}
