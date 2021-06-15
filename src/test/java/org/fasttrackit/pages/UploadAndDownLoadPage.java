package org.fasttrackit.pages;

import io.cucumber.java.en_old.Ac;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import java.io.File;

@DefaultUrl("https://demoqa.com/upload-download")
public class UploadAndDownLoadPage extends PageObject {

    @FindBy(css="#downloadButton")
    private WebElementFacade downloadButton;
    @FindBy(css="#uploadFile")
    private WebElementFacade uploadButton;
    @FindBy(css="#uploadedFilePath")
    private WebElementFacade uploadedFile;

    public void openDownloadPage(){
        open();
    }

    public void clickDwnld(){
        clickOn(downloadButton);
    }
    public boolean checkFile(String downloadPath, String fileName){
      boolean file=false;
        File dir = new File("C:\\Users\\ivonaionita\\Downloads");
        File[] dirContents = dir.listFiles();

        for (int i = 0; i < dirContents.length; i++) {
            if (dirContents[i].getName().equals(fileName)) {
                dirContents[i].delete();
                return file=true;
                // File has been found, it can now be deleted:
            }
        }
        return file;

    }

    public void clickUploadFile(){
        clickOn(uploadButton);
    }

    public boolean verifyFile() {
      //  File path = new File("C:\\Users\\ivonaionita\\Downloads");
        uploadButton.sendKeys("C:\\Users\\ivonaionita\\Downloads");
        if(uploadedFile.containsText("C:\\fakepath\\sampleFile.jpeg\n")){
            return true;
        }
        return false;
    }



}
