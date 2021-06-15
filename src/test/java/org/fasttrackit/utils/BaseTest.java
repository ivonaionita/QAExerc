package org.fasttrackit.utils;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTest {
    @Managed(uniqueSession = false)
    private WebDriver webDriver;

    @Before
    public void setup(){
        webDriver.manage().window().maximize();
    }


}
