package Pages;

import Base.DriverManager;
import Waits.WaitForElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdditivesPage {
    public AdditivesPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(xpath = "//*[@class='ry-button--full ry-button--gradient-yellow ry-button--large']")
    private WebElement continueButton;

    public void clickingContinueButton() {
        WaitForElement.waitUntilElementIsClickable(continueButton);
        continueButton.click();
    }
}
