package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

@DefaultUrl("https://demoqa.com/sortable")
public class SortablePage extends PageObject {

    @FindBy(css = ".vertical-list-container div")
    private List<WebElementFacade> verticalList;
    @FindBy(css = ".create-grid div")
    private List<WebElementFacade> gridList;
    @FindBy(css = "#demo-tabpane-list")
    private WebElementFacade listFormat;
    @FindBy(css = "#demo-tab-list")
    private WebElementFacade listSection;
    @FindBy(css = "#demo-tab-grid")
    private WebElementFacade gridSection;

    public void clickListSection() {
        clickOn(listSection);
    }

    public void clickGridSection() {
        clickOn(gridSection);
    }

    public boolean verifyList(String text) {
        for (WebElementFacade webElement : verticalList) {
            if (webElement.getText().contains(text)) {
                return true;
            }
        }
        return false;
    }

    public boolean verifyListFormat() {
        listFormat.waitUntilVisible();
        waitFor(ExpectedConditions.visibilityOf(listFormat));
        boolean format = false;
        if (listFormat.getAttribute("aria-hidden").equals("false")) {
            format = true;
            System.out.println(verticalList);
        } else if (listFormat.getAttribute("aria-hidden").equals("true")) {
            format = true;
            System.out.println(gridList);
        }
        return format;
    }
}
