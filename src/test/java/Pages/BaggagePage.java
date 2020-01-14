package Pages;

import Base.DriverManager;
import Waits.WaitForElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BaggagePage {

    public BaggagePage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(css = "body > flights-root > div > flights-summary-container > flights-summary > div > div:nth-child(1) > journey-container > journey > flight-list > div > flight-card")
    private WebElement ticketPrice;
    @FindBy(css = "body > flights-root > div > flights-summary-container > flights-summary > div > div:nth-child(1) > journey-container > journey > flight-list > div > flight-card > div > div.card-panel.ng-trigger.ng-trigger-expandFareTable.ng-tns-c26-9.ng-star-inserted > fare-table-container > fare-table > div > div:nth-child(2)")
    private WebElement baggeage;
    @FindBy(css = "#title-0-error-message > div.dropdown.b2 > button")
    private WebElement firstPassengerTitle;
    @FindBy(css = "#title-0-error-message > div.dropdown.b2.dropdown--opened > div > div > ry-dropdown-item:nth-child(1) > button > div > div.dropdown-item__label.b2")
    private WebElement mrTitle;
    @FindBy(css = "#title-0-error-message > div.dropdown.b2")
    private WebElement secondPassengerTitle;
    @FindBy(css = "#title-0-error-message > div.dropdown.b2.dropdown--opened > div > div > ry-dropdown-item:nth-child(3)")
    private WebElement msTitle;
    @FindBy(id = "formState.passengers.ADT-0.name")
    private WebElement firstName;
    @FindBy(id = "formState.passengers.ADT-0.surname")
    private WebElement lastName;
    @FindBy(id = "formState.passengers.ADT-1.name")
    private WebElement firstNameSecondPassenger;
    @FindBy(id = "formState.passengers.ADT-1.surname")
    private WebElement lastNameSecondPassenger;
    @FindBy(css = "body > flights-root > div > ng-component > continue-flow-container > continue-flow > div > div > button")
    private WebElement continueButton;

    public void ClickingContinueButton() {
        WaitForElement.waitUntilElementIsVisible(continueButton);

        continueButton.click();
    }

    public void FirstNameSecondPassenger(String firstName) {
        WaitForElement.waitUntilElementIsClickable(firstNameSecondPassenger);
        firstNameSecondPassenger.sendKeys(firstName);
    }

    public void LastNameSecondPassenger(String lastName) {
        WaitForElement.waitUntilElementIsClickable(lastNameSecondPassenger);
        lastNameSecondPassenger.sendKeys(lastName);
    }

    public void FirstNameFirstPassenger(String first_Name) {
        WaitForElement.waitUntilElementIsClickable(firstName);
        firstName.sendKeys(first_Name);
    }

    public void LastNameFirstPassenger(String last_Name) {
        WaitForElement.waitUntilElementIsClickable(lastName);
        lastName.sendKeys(last_Name);
    }

    public void SelectFirstPassengerTitle() {
        WaitForElement.waitUntilElementIsClickable(firstPassengerTitle);
        firstPassengerTitle.click();
        WaitForElement.waitUntilElementIsClickable(mrTitle);
        mrTitle.click();
    }

    public void SelectSecondPassengerTitle() {
        WaitForElement.waitUntilElementIsClickable(secondPassengerTitle);
        secondPassengerTitle.click();
        WaitForElement.waitUntilElementIsClickable(msTitle);
        msTitle.click();
    }

    public void SelectTicketPrice() {
        WaitForElement.waitUntilElementIsClickable(ticketPrice);
        ticketPrice.click();
    }

    public void SelectBaggage() {
        WaitForElement.waitUntilElementIsClickable(baggeage);
        baggeage.click();
    }
}
