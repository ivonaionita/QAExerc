package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("https://demoqa.com/text-box")
public class TextBoxPage extends PageObject {

    @FindBy(css = "#userName")
    private WebElementFacade fullNameField;
    @FindBy(css = ".text-field-container form div:nth-child(2)  div:nth-child(2) [type=\"email\"]")
    private WebElementFacade emailField;
    @FindBy(css = "#currentAddress")
    private WebElementFacade addressField;
    @FindBy(css = "#permanentAddress")
    private WebElementFacade addressField2;
    @FindBy(css = "#submit")
    private WebElementFacade submitButton;
    @FindBy(css = ".border p")
    private List<WebElementFacade> form;

    public void completeFullNameField(String text) {
        typeInto(fullNameField, text);
    }

    public void typeEmail(String email) {
        if (email.contains("@") && email.endsWith(".com")) {
            typeInto(emailField, email);
        } else typeInto(emailField, "invalid email");
    }

    public void typeAddress(String address) {
        typeInto(addressField, address);
    }

    public void typeAddress2(String address2) {
        typeInto(addressField2, address2);
    }

    public void clickSubmit() {
        clickOn(submitButton);
    }

    public boolean verifyForm(String name, String address, String address2) {
        return form.get(0).getText().contains(name)
                && form.get(2).getText().contains(address)
                && form.get(3).getText().contains(address2);
    }

}
