package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://demoqa.com/modal-dialogs")
public class ModalDialogsPage extends PageObject {
    @FindBy(css="#showSmallModal")
    private WebElementFacade smallModal;
    @FindBy(css="#closeSmallModal")
    private WebElementFacade closeSmallModal;
    @FindBy(css="div.fade.modal.show div.modal-body")
    private WebElementFacade smallModalMsg;


    public void clickSmallModal(){
        clickOn(smallModal);
    }

    public void clickCloseSmallModal(){
        clickOn(closeSmallModal);
    }

    public boolean verifySmallModalMsg(){
        if(smallModalMsg.containsText("This is a small modal. It has very less content")){
            return true;
        }return false;
    }
}
