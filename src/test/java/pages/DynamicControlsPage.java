package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class DynamicControlsPage extends Form {
    private static final String NAME = "Dynamic Controls";
    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By ENABLE = By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "Enable"));
    private final By INPUT = By.xpath("//input[@type='text']");
    private IButton enableBtn = elementFactory.getButton(ENABLE, "Status Enable");
    private ITextBox textField = elementFactory.getTextBox(INPUT, "Text Status");

    public DynamicControlsPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }

    public void EnableButtonClick(){
        enableBtn.click();
    }

    public boolean isInputEnabled(){
        return textField.state().waitForEnabled();
    }

    public void InputText(String text){
        textField.clearAndType(text);
    }

    public String GetInput(){
        return textField.getValue();
    }
}
