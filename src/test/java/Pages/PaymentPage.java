package Pages;

import Base.DriverManager;
import Waits.WaitForElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

    public PaymentPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(xpath = "/html/body/app-root/ng-component/ry-spinner/div/payment-form/form/div[1]/contact-details/div/div/div[1]/div[2]/ry-input-d/div/input")
    private WebElement phoneNumber;
    @FindBy(xpath = "/html/body/app-root/ng-component/ry-spinner/div/payment-form/form/div[2]/insurance/div/div[4]/div[1]/ry-checkbox/label/div/div[1]")
    private WebElement insured;
    @FindBy(xpath = "/html/body/app-root/ng-component/ry-spinner/div/payment-form/form/div[5]/payment-methods/div/div/div[1]/div/div/ry-checkbox/label/div/div[1]")
    private WebElement paymentMethods;
    @FindBy(xpath = "/html/body/app-root/ng-component/ry-spinner/div/payment-form/form/div[8]/div/terms-and-conditions/div/div/ry-checkbox/label/div/div[1]")
    private WebElement termsAndConditions;
    @FindBy(xpath = "/html/body/app-root/ng-component/ry-spinner/div/payment-form/form/div[5]/payment-methods/div/div/div[1]/div/add-method-modal/form/div/div/div[1]/div/card-details/form/ry-input-d[1]/div/input")
    private WebElement card_Number;
    @FindBy(xpath = "/html/body/app-root/ng-component/ry-spinner/div/payment-form/form/div[5]/payment-methods/div/div/div[1]/div/add-method-modal/form/div/div/div[1]/div/card-details/form/expiry-date/label/span[2]/input")
    private WebElement cardDate;
    @FindBy(xpath = "/html/body/app-root/ng-component/ry-spinner/div/payment-form/form/div[5]/payment-methods/div/div/div[1]/div/add-method-modal/form/div/div/div[1]/div/card-details/form/verification-code/div/ry-input-d/div/input")
    private WebElement cvvNumber;
    @FindBy(xpath = "/html/body/app-root/ng-component/ry-spinner/div/payment-form/form/div[5]/payment-methods/div/div/div[1]/div/add-method-modal/form/div/div/div[1]/div/card-details/form/ry-input-d[2]/div/input")
    private WebElement cardHolderName;
    @FindBy(xpath = "/html/body/app-root/ng-component/ry-spinner/div/payment-form/form/div[5]/payment-methods/div/div/div[1]/div/add-method-modal/form/div/div/div[2]/billing-address/address-form/form/ry-input-d[1]/div/input")
    private WebElement addressLine1;
    @FindBy(xpath = "/html/body/app-root/ng-component/ry-spinner/div/payment-form/form/div[5]/payment-methods/div/div/div[1]/div/add-method-modal/form/div/div/div[2]/billing-address/address-form/form/ry-input-d[3]/div/input")
    private WebElement city;
    @FindBy(xpath = "//div/payment-form/form/div[5]/payment-methods/div/div/div[1]/div/add-method-modal/form/div/div/div[2]/billing-address/address-form/form/ry-dropdown/div[2]/button")
    private WebElement country;
    @FindBy(xpath = "/html/body/app-root/ng-component/ry-spinner/div/payment-form/form/div[5]/payment-methods/div/div/div[1]/div/add-method-modal/form/div/div/div[2]/billing-address/address-form/form/ry-dropdown/div[2]/div/div/ry-dropdown-item[5]/button")
    private WebElement pickUpCountryFromTheList;
    @FindBy(xpath = "/html/body/app-root/ng-component/ry-spinner/div/payment-form/form/div[5]/payment-methods/div/div/div[1]/div/add-method-modal/form/div/div/div[2]/billing-address/address-form/form/ry-input-d[4]/div/input")
    private WebElement zipCode;
    @FindBy(xpath = "/html/body/app-root/ng-component/ry-spinner/div/payment-form/form/div[5]/payment-methods/div/div/div[1]/div/add-method-modal/form/div/div/div[1]/div/card-details/form/ry-input-d[1]/span[1]")
    private WebElement errorMsg;

    public String PaymentErrorMsg() {
        WaitForElement.waitUntilElementIsVisible(errorMsg);
        String errorMessage = errorMsg.getText();
        return errorMessage;
    }

    public void ProvideZipCode(String zip) {
        WaitForElement.waitUntilElementIsClickable(zipCode);
        zipCode.clear();
        zipCode.sendKeys(zip);
    }

    public void SelectCountry() {
        WaitForElement.waitUntilElementIsClickable(country);
        country.click();
        WaitForElement.waitUntilElementIsClickable(pickUpCountryFromTheList);
        pickUpCountryFromTheList.click();
    }

    public void ProvideAddress(String address) {
        WaitForElement.waitUntilElementIsClickable(addressLine1);
        addressLine1.clear();
        addressLine1.sendKeys(address);
    }

    public void ProvideCity(String cty) {
        WaitForElement.waitUntilElementIsClickable(city);
        city.clear();
        city.sendKeys(cty);
    }

    public void ProvidePhoneNumber() {
        WaitForElement.waitUntilElementIsClickable(phoneNumber);
        phoneNumber.clear();
        phoneNumber.sendKeys("693366254");
    }

    public void ChoosInsurence() {
        WaitForElement.waitUntilElementIsClickable(insured);
        insured.click();
    }

    public void ProvideCardHolderName(String name) {
        WaitForElement.waitUntilElementIsClickable(cardHolderName);
        cardHolderName.clear();
        cardHolderName.sendKeys(name);
    }

    public void PaymentMethods() {
        WaitForElement.waitUntilElementIsClickable(paymentMethods);
        paymentMethods.click();
    }

    public void CardNumber(String cardNumber) {
        WaitForElement.waitUntilElementIsClickable(card_Number);
        card_Number.clear();
        card_Number.sendKeys(cardNumber);
    }

    public void Date(String date) {
        WaitForElement.waitUntilElementIsClickable(cardDate);
        cardDate.clear();
        cardDate.sendKeys(date);
    }

    public void CvvNumber(String cvv) {
        WaitForElement.waitUntilElementIsClickable(cvvNumber);
        card_Number.clear();
        cvvNumber.sendKeys(cvv);
    }

    public void AcceptTermsAndConditions() {
        WaitForElement.waitUntilElementIsClickable(termsAndConditions);
        termsAndConditions.click();
    }
}
