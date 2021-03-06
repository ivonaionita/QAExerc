package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;


@DefaultUrl("https://demoqa.com/links")
public class LinksPage extends PageObject {
    @FindBy(css = "#simpleLink")
    private WebElementFacade homeLink;

    public void clickHomeLink() {
        clickOn(homeLink);

    }

    public void switchNewTab() {
        ArrayList<String> tabs2 = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs2.get(1));
        getDriver().findElement(By.cssSelector(" div.home-banner a img"));
        getDriver().close();
        getDriver().switchTo().window(tabs2.get(0));

    }


}
