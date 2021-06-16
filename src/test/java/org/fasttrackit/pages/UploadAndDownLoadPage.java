package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;
import java.io.File;

@DefaultUrl("https://demoqa.com/upload-download")
public class UploadAndDownLoadPage extends PageObject {

    @FindBy(css="#downloadButton")
    private WebElementFacade downloadButton;
    @FindBy(css="#uploadFile")
    private WebElementFacade uploadButton;
    @FindBy(css="#uploadedFilePath")
    private WebElementFacade uploadedFile;


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

    public void uploadFile() {
        upload("src/test/resources/files/text.txt").to(uploadButton);

    }


}
