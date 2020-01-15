package Pages;

import Base.DriverManager;
import Waits.WaitForElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(css = "body > app-root > ry-spinner > div > trip-header-wrapper > header > ry-header > div > div.header__right > div > ng-component > ry-basket-total-container > ry-basket-total")
    private WebElement basketButton;
    @FindBy(xpath = "//*[@id=\"ry-tooltip-5\"]/div[2]/ry-price-breakdown-container/ry-price-breakdown-footer/div/div/ry-basket-continue-flow-container/ry-basket-continue-flow/button")
    private WebElement checkOutButton;
    @FindBy(css = "#ry-modal-portal > div > ry-login-signup-dialog > div > ry-login-signup-container > ry-login-signup > ry-login-container > ry-form > div.content > form > div:nth-child(1) > ry-input > label > span._input_wrapper > input")
    private WebElement emailAddressField;
    @FindBy(css = "#ry-modal-portal > div > ry-login-signup-dialog > div > ry-login-signup-container > ry-login-signup > ry-login-container > ry-form > div.content > form > div:nth-child(2) > ry-input > label > span._input_wrapper > input")
    private WebElement passwordField;
    @FindBy(css = "#ry-modal-portal > div > ry-login-signup-dialog > div > ry-login-signup-container > ry-login-signup > ry-login-container > ry-form > div.content > form > div.form__group.no-gutter.submit > button")
    private WebElement loginButton;

    public void BasketButton() {
        WaitForElement.waitUntilElementIsClickable(basketButton);
        basketButton.click();
        WaitForElement.waitUntilElementIsClickable(checkOutButton);
        checkOutButton.click();
    }

    public void Login(String email, String password) {
        WaitForElement.waitUntilElementIsVisible(loginButton);
        emailAddressField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}
