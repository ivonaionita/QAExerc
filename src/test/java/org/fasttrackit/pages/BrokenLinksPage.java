package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.Collections;

import java.util.List;

@DefaultUrl("https://demoqa.com/broken")
public class BrokenLinksPage extends PageObject {

    @FindBy(css = "#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > a:nth-child(10)")
    private WebElementFacade validLink;

    public void openBrokenLinksPage() {
        open();
    }

    public void clickValidLink() {
        clickOn(validLink);
    }

    public void verifyValidLink() {
        WebElement linkname = getDriver().findElement(By.linkText("https://demoqa.com/"));
        if (linkname.isDisplayed()) {
            System.out.println("valid link");
        } else {
            System.out.println("invalid link");

        }
    }



}