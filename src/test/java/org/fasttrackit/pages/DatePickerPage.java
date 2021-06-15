package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
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

    public void selectDate(){
        WebElement dateTable=getDriver().findElement(By.className("react-datepicker-ignore-onclickoutside"));
        List<WebElement>days=dateTable.findElements(By.className("react-datepicker__day"));
        for(WebElement day:days){
            if(day.getText().equals("12")){
                day.findElement(By.linkText("12")).click();
                System.out.println(day);
            }
        }
    }

}
