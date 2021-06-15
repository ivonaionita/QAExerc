package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.yecht.Data;

import java.util.List;

@DefaultUrl("https://demoqa.com/webtables")
public class WebTablesPage extends PageObject {

    @FindBy(css="#addNewRecordButton")
    private WebElementFacade addButton;
    @FindBy(css="#firstName")
    private WebElementFacade firstNameField;
    @FindBy(css="#lastName")
    private WebElementFacade lastNameField;
    @FindBy(css="#userEmail")
    private WebElementFacade emailField;
    @FindBy(css="#age")
    private WebElementFacade ageField;
    @FindBy(css="#salary")
    private WebElementFacade salaryField;
    @FindBy(css="#department")
    private WebElementFacade departmentField;
    @FindBy(css="#submit")
    private WebElementFacade submitButton;
    @FindBy(css=".rt-tbody .rt-tr:not(.-padRow)")
    private List<WebElementFacade> table;

    public void openWebTablesPage(){
        open();
    }
    public void clickAdd(){
        clickOn(addButton);
    }
    public void typeFirstName(String name){
        typeInto(firstNameField,name);
    }
    public void typeLastName(String name){
        typeInto(lastNameField,name);
    }
    public void typeEmail(String email){
        typeInto(emailField,email);
    }
    public void typeAge(int ageValue){
        String age=String.valueOf(ageValue);
        typeInto(ageField,age);
    }
    public void typeSalary(int salaryValue){
        String salary=String.valueOf(salaryValue);
        typeInto(salaryField,salary);
    }
    public void typeDepartment(String department){
        typeInto(departmentField,department);
    }
    public void clickSubmit(){
        clickOn(submitButton);
    }

    public boolean isElementInTable(String firstName, String lastName){
        for(WebElementFacade webElementFacade:table){
            if(webElementFacade.findElement(By.cssSelector(".rt-td:nth-child(1)")).getText().equals(firstName)&&
            webElementFacade.findElement(By.cssSelector(".rt-td:nth-child(2)")).getText().equals(lastName)){
                return true;
            }
        }return false;
    }

}
