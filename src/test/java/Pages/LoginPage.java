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

    @FindBy(css = "#ry-modal-portal > div > ry-login-signup-dialog > div > ry-login-signup-container > ry-login-signup > ry-login-container > ry-form > div.content > form > div:nth-child(1) > ry-input > label > span._input_wrapper > input")
    private WebElement emailAddressField;

    @FindBy(css = "#ry-modal-portal > div > ry-login-signup-dialog > div > ry-login-signup-container > ry-login-signup > ry-login-container > ry-form > div.content > form > div:nth-child(2) > ry-input > label > span._input_wrapper > input")
    private WebElement passwordField;

    @FindBy(css = "#ry-modal-portal > div > ry-login-signup-dialog > div > ry-login-signup-container > ry-login-signup > ry-login-container > ry-form > div.content > form > div.form__group.no-gutter.submit > button")
    private WebElement loginButton;

    public void Login(String email, String password) {
        WaitForElement.waitUntilElementIsVisible(loginButton);
        emailAddressField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}
