package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@DefaultUrl("https://demoqa.com/date-picker")
public class DatePickerPage extends PageObject {

    @FindBy(css="#datePickerMonthYearInput")
    private WebElementFacade datePickerField;

    public void openPage(){
        open();
    }

    public void clickDatePicker() {
    clickOn(datePickerField);

}

    public void selectDate() {
            WebElement datePicker = getDriver().findElement((By.cssSelector("#datePickerMonthYearInput")));
            datePicker.click();
            WebElement selectMonth = getDriver().findElement(By.cssSelector(".react-datepicker__month-select option:nth-child(12)"));
            selectMonth.click();
            WebElement selectYear = getDriver().findElement(By.cssSelector(".react-datepicker__year-select option:nth-child(89)"));
            selectYear.click();
            WebElement selectDay = getDriver().findElement(By.cssSelector(".react-datepicker__day--015"));
            selectDay.click();
        }

    public void checkDateIsCorrect(String date){
        WebElement selectedDate = getDriver().findElement(By.cssSelector("#datePickerMonthYearInput"));
        Assert.assertEquals(date,selectedDate.getAttribute("value"));//Wrong element
    }



}



