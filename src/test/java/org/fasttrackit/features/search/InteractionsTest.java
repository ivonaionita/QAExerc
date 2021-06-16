package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.InteractionsSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class InteractionsTest extends BaseTest {

    @Steps
    private InteractionsSteps interactionsSteps;

    @Test
    public void verifyListOnPage(){
        interactionsSteps.openSortablePage();
        interactionsSteps.checkList("One");
    }

    @Test
    public void verifyGridListOnPage(){
        interactionsSteps.openSortablePage();
        interactionsSteps.selectGridSection();
        interactionsSteps.checkListFormat();
    }
}
