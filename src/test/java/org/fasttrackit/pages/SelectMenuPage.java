package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://demoqa.com/select-menu")
public class SelectMenuPage extends PageObject {
    @FindBy(css=".css-1hwfws3 div")
    private WebElementFacade selectValues;


    public void openValues(){
        clickOn(selectValues);
    }

    public boolean verifySelectedOption(String option){
        System.out.println(selectValues.getText());
        if(selectValues.getAttribute("class").contains("singleValue")&&selectValues.getText().equals(option)){
            return true;
        }return false;
    }

}
