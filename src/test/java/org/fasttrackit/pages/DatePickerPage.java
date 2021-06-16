package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://demoqa.com/date-picker")
public class DatePickerPage extends PageObject {

    @FindBy(css="#datePickerMonthYearInput")
    private WebElementFacade datePickerField;
    @FindBy(css=".react-datepicker__month-select option:nth-child(12)")
    private WebElementFacade selectedMonth;
    @FindBy(css=".react-datepicker__year-select option:nth-child(89)")
    private WebElementFacade selectedYear;
    @FindBy(css=".react-datepicker__day--015")
    private WebElementFacade selectedDay;

    public void clickDatePicker() {
    clickOn(datePickerField);

}   public void selectDate() {
            datePickerField.click();
            selectedMonth.click();
            selectedYear.click();
            selectedDay.click();
        }

    public boolean checkDateIsCorrect(String date) {
        return datePickerField.getText().equals(date);
    }


}



