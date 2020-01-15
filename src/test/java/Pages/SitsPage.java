package Pages;

import Base.DriverManager;
import Waits.WaitForElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SitsPage {

    public SitsPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }


    @FindBy(xpath = "/html/body/seats-root/div/main/seats-container/div/div[3]/div[2]/div/seats-actions/span[1]/ry-tooltip")
    private WebElement randomSitsButton;

    @FindBy(xpath = "//*[@class='seats-action__button ry-button ry-button--gradient-yellow']")
    private WebElement continueButton;

    @FindBy(xpath = "//*[@class='seats-modal__cta ry-button--gradient-blue']")
    private WebElement popupButton;

    public void ChooseRandomSits() {
        WaitForElement.waitUntilElementIsClickable(randomSitsButton);
        randomSitsButton.click();
        }
}
