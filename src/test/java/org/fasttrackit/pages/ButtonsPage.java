package org.fasttrackit.pages;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.fasttrackit.utils.BasePage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://demoqa.com/buttons")
public class ButtonsPage extends BasePage {


    @FindBy(css=".col-12.mt-4.col-md-6  div div:nth-child(1) [type=\"button\"]")
    private WebElementFacade doubleClickButton;
    @FindBy(id="doubleClickMessage")
    private WebElementFacade doubleClickSuccess;
    @FindBy(css=".col-12.mt-4.col-md-6  div div:nth-child(3) [type=\"button\"]")
    private WebElementFacade clickButton;
    @FindBy(css="#dynamicClickMessage")
    private WebElementFacade clickSuccessMessage;
    @FindBy(css=".col-12.mt-4.col-md-6  div div:nth-child(2) [type=\"button\"]")
    private WebElementFacade rightClickButton;
    @FindBy(css="#rightClickMessage")
    private WebElementFacade rightClickSuccessMessage;

    private  Object DoubleClickAction;

    public void doubleClick(){
        doubleClick(doubleClickButton);
    }

    public void successMessageIsDisplayed(){
       doubleClickSuccess.containsText("You have done a double click");
    }

    public void clickButton(){
        clickOn(clickButton);
    }

    public void clickSuccessMessage(){
        clickSuccessMessage.containsText("You have done a dynamic click");
    }

    public void clickRightClickButtton(){
        Actions action=new Actions(getDriver());
        action.contextClick(rightClickButton).perform();
    }

    public void rightClickSuccessMessage(){
        rightClickSuccessMessage.containsText("You have done a right click");
    }
}
