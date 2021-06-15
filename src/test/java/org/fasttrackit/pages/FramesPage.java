package org.fasttrackit.pages;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

@DefaultUrl("https://demoqa.com/frames")
public class FramesPage extends PageObject {

    @FindBy(css="#frame1")
    private WebElementFacade frame1;

    @FindBy(css="#frame2")
    private WebElementFacade frame2;
    @FindBy(css="#sampleHeading")
    private WebElementFacade textFrame2;

    public void openFramesPage(){
      open();
     }
     public void switchToFrame1(){
        getDriver().switchTo().frame(frame1);
    }
    public void getTextFromFrame1(){
        System.out.println(getDriver().switchTo().frame(frame1).findElement(By.id("sampleHeading")).getText());
    }

    public void noOfFrames(){
       Dimension frames;
       frames= getDriver().findElement(By.tagName("iframe")).getSize();
        System.out.println(frames);
    }

}
