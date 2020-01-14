package Pages;

import Base.DriverManager;
import Waits.WaitForElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CabinBagPage {
    public CabinBagPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(xpath = "/html/body/bags-root/bags-app-container/div/main/div/ry-spinner/section[1]/bags-cabin-bag/bags-bag-layout/div/div/div[2]/bags-cabin-bag-journey-container/bags-cabin-bag-row[1]/bags-cabin-bag-products-container/bags-cabin-bag-product[1]/div/ry-checkbox/label/div/div[1]")
    private WebElement selectSmallBagForFirstPerson;
    @FindBy(xpath = "/html/body/bags-root/bags-app-container/div/main/div/ry-spinner/section[1]/bags-cabin-bag/bags-bag-layout/div/div/div[2]/bags-cabin-bag-journey-container/bags-cabin-bag-row[2]/bags-cabin-bag-products-container/bags-cabin-bag-product[1]/div/ry-checkbox/label/div/div[1]")
    private WebElement selectSmallBagForSecondPerson;
    @FindBy(css = "body > bags-root > bags-app-container > div > main > div > ry-spinner > section.app-content__section.app-content__section--continue-flow.ng-star-inserted > bags-continue-flow-container > bags-continue-flow > button")
    private WebElement continueButton;

    public CabinBagPage selectSmallBagForPassengers(){
        WaitForElement.waitUntilElementIsClickable(selectSmallBagForFirstPerson);
        selectSmallBagForFirstPerson.click();
        WaitForElement.waitUntilElementIsClickable(selectSmallBagForSecondPerson);
        selectSmallBagForSecondPerson.click();
        return new CabinBagPage();
    }

    public AdditivesPage clickingContinueButton(){
        WaitForElement.waitUntilElementIsClickable(continueButton);
        continueButton.click();
        return new AdditivesPage();
    }
}
