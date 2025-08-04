package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class UploadFilePage extends Form {
    public static String NAME = "File Uploaded!";
    private final By UPLOADED_FILE = By.id("uploaded-files");
    public ILabel chooseFileLbl = AqualityServices.getElementFactory().getLabel(UPLOADED_FILE, "File Name");

    public UploadFilePage(){
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }

    public String getFileName(){
        return chooseFileLbl.getText();
    }
}
