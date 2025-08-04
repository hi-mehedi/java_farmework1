package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class FileUploadPage extends Form {
    private static final String NAME = "File Upload";
    private final By CHOOSE_FILE = By.id("file-upload");
    private final By UPLOAD_BUTTON = By.id("file-submit");
    private final ITextBox chooseFileOp = AqualityServices.getElementFactory().getTextBox(CHOOSE_FILE, "Upload");
    private final IButton uploadFileBtn = AqualityServices.getElementFactory().getButton(UPLOAD_BUTTON,"Submit");

    public FileUploadPage(){
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }

    public void ChooseFile(String filename){
        chooseFileOp.clearAndType(filename);
    }

    public void UploadFile(){
        uploadFileBtn.click();
    }
}
