package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.WidgetsSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class WidgetsTest extends BaseTest {
    @Steps
    private WidgetsSteps widgetsSteps;


    @Test
    public void verifyExtendedSection(){
        widgetsSteps.openAccordianPage();
        widgetsSteps.verifyExtendedSection();
    }

    @Test
    public void selectColor() throws InterruptedException {
      widgetsSteps.openAutoComplete();
      widgetsSteps.selectColor("Green");
      widgetsSteps.verifySpecificColorIsSelected("Green");
    }

   @Test
    public void setDate(){
        widgetsSteps.openDatePickerPage();
        widgetsSteps.clickDatePicker();
        widgetsSteps.selectDate();
        widgetsSteps.checkSelectedDate("12/15/1988");
   }

   @Test
    public void checkSlider(){
        widgetsSteps.openSliderPage();
        widgetsSteps.moveSlider();
   }

   @Test
    public void checkProgressBar(){
        widgetsSteps.openProgressBarPage();
        widgetsSteps.startProgress();
        widgetsSteps.checkProgress();
   }

   @Test
    public void hooverOnElements(){
        widgetsSteps.openToolTipsPage();
        widgetsSteps.hooverOverElement();
        widgetsSteps.checkHoover();
   }

   @Test
    public void selectValueFromMenu(){
        widgetsSteps.openSelectMenuPage();
        widgetsSteps.openValuesList();
   }

}
