package org.fasttrackit.pages;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://demoqa.com/accordian")
public class AccordianPage extends PageObject {

    @FindBy(css="#section1Heading")
    private WebElementFacade section;

     public void openAccordianPage(){
         open();
     }
     public void clickSection(){
         clickOn(section);
     }

     public boolean verifyOpenedSection(){
         waitABit(2000);
         String className=getDriver().findElement(By.cssSelector("#accordianContainer > div > div:nth-child(1) > div.collapse")).getAttribute("class");
         System.out.println(className);
         if(className.contains("collapse show")){
             return true;
         }return false;
     }
}
