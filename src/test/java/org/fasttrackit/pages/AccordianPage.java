package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.fasttrackit.utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://demoqa.com/accordian")
public class AccordianPage extends BasePage {

    @FindBy(css = "#section1Heading")
    private WebElementFacade section;

    public void clickSection() {
        clickOn(section);
    }

    public boolean verifyOpenedSection() {
        String className = getDriver().findElement(By.cssSelector("#accordianContainer > div > div:nth-child(1) > div.collapse")).getAttribute("class");
        return className.contains("collapse show");
    }
}
