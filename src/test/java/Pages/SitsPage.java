package Pages;

import Base.DriverManager;
import Waits.WaitForElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SitsPage {

    public SitsPage()
    {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(css = "body > seats-root > div > main > seats-container > div > div.seatmap-container.ng-tns-c15-1.seatmap-container--displaying-alert.ng-star-inserted > div:nth-child(2) > div > seats-actions > span:nth-child(1) > ry-tooltip")
    private WebElement randomSitsButton;

    public void ChooseRandomSits(){
        WaitForElement.waitUntilElementIsClickable(randomSitsButton);
        randomSitsButton.click();
    }
}
