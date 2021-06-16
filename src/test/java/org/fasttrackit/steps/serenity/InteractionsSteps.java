package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.SortablePage;
import org.junit.Assert;

public class InteractionsSteps {

    private SortablePage sortablePage;

    //Sortable Page

    @Step
    public void openSortablePage(){
        sortablePage.open();
    }
    @Step
    public void selectListSection(){
        sortablePage.clickListSection();
    }
    @Step
    public void selectGridSection(){
        sortablePage.clickGridSection();
    }
    @Step
    public void checkList(String value){
        Assert.assertTrue(sortablePage.verifyList(value));
    }
    @Step
    public void checkListFormat(){
        Assert.assertTrue(sortablePage.verifyListFormat());
    }
}
