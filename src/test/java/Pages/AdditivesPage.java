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

    @FindBy(xpath = "/html/body/app-root/ng-component/main/products-list-container/products-list/div/div/div[2]/div[2]/div[2]/button")
    private WebElement continueButton;

    public void clickingContinueButton(){
        WaitForElement.waitUntilElementIsClickable(continueButton);
        continueButton.click();
    }
}
