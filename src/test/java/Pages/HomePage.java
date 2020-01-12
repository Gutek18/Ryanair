package Pages;

import Base.DriverManager;
import Waits.WaitForElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    public HomePage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(css = "body > hp-app-root > hp-home-container > hp-home > hp-header-container > header > hp-header > ry-header > div > div.header__center > div > hp-header-menu-item:nth-child(4) > button > span")
    private WebElement loginButton;
    @FindBy(xpath = "/html/body/hp-app-root/hp-home-container/hp-home/hp-search-widget/div/hp-flight-search-widget-container/hp-flight-search-widget/hp-trip-type-container/hp-trip-type/hp-trip-type-button[2]/button/icon")
    private WebElement oneWayButton;
    @FindBy(xpath = "//*[@id=\"input-button__departure\"]")
    private WebElement departure;
    @FindBy(css = "#ry-tooltip-0 > div.tooltip-inner > hp-lazy-controls-tooltips > hp-app-controls-tooltips > hp-controls-tooltips-container > hp-controls-tooltips > hp-origin-container > hp-airports > hp-countries > div:nth-child(4) > div:nth-child(8)")
    private WebElement countryDeparture;
    @FindBy(css = "#ry-tooltip-0 > div.tooltip-inner > hp-lazy-controls-tooltips > hp-app-controls-tooltips > hp-controls-tooltips-container > hp-controls-tooltips > hp-origin-container > hp-airports > hp-airports-list > div.list__airports-container.ng-star-inserted > div.list__airports-scrollable-container > hp-airport-item:nth-child(2) > span > span")
    private WebElement cityDeparture;
    @FindBy(css = "#input-button__destination")
    private WebElement destination;
    @FindBy(css = "#ry-tooltip-1 > div.tooltip-inner > hp-lazy-controls-tooltips > hp-app-controls-tooltips > hp-controls-tooltips-container > hp-controls-tooltips > hp-destination-container > hp-airports > hp-countries > div:nth-child(5) > div:nth-child(9)")
    private WebElement countryDestination;
    @FindBy(css = "#ry-tooltip-1 > div.tooltip-inner > hp-lazy-controls-tooltips > hp-app-controls-tooltips > hp-controls-tooltips-container > hp-controls-tooltips > hp-destination-container > hp-airports > hp-airports-list > div.list__airports-container.ng-star-inserted > div > hp-airport-item:nth-child(6) > span")
    private WebElement cityDestination;
    @FindBy(css = "#ry-tooltip-8 > div.tooltip-inner > hp-lazy-controls-tooltips > hp-app-controls-tooltips > hp-controls-tooltips-container > hp-controls-tooltips > hp-datepicker-container > hp-datepicker > ry-datepicker-desktop > div > calendar:nth-child(3) > calendar-body > div:nth-child(5) > div:nth-child(16)")
    private WebElement dateFly;
    @FindBy(css = "#ry-tooltip-9 > div.tooltip-inner > hp-lazy-controls-tooltips > hp-app-controls-tooltips > hp-controls-tooltips-container > hp-controls-tooltips > hp-passengers-container > hp-passengers > hp-passengers-picker > ry-counter:nth-child(2) > div.counter > div.counter__button-wrapper--enabled")
    private WebElement addPerson;
    @FindBy(css = "body > hp-app-root > hp-home-container > hp-home > hp-search-widget > div > hp-flight-search-widget-container > hp-flight-search-widget > div > div > button")
    private WebElement searchButton;
    @FindBy(id = "glyphs.close")
    private WebElement cookies;

    public void DepartureCity() {
        WaitForElement.waitUntilElementIsVisible(departure);
        departure.click();
        WaitForElement.waitUntilElementIsClickable(countryDeparture);
        countryDeparture.click();
        WaitForElement.waitUntilElementIsClickable(cityDeparture);
        cityDeparture.click();
    }

    public void DestinationCity() {
        WaitForElement.waitUntilElementIsVisible(departure);
        destination.click();
        WaitForElement.waitUntilElementIsClickable(countryDestination);
        countryDestination.click();
        WaitForElement.waitUntilElementIsClickable(countryDestination);
        cityDestination.click();
    }

    public void ClickingSearchButton(){
        WaitForElement.waitUntilElementIsClickable(searchButton);
        searchButton.click();
    }

    public void DateFly() {
        WaitForElement.waitUntilElementIsVisible(dateFly);
        dateFly.click();
    }

    public void AddingOnePerson(){
        WaitForElement.waitUntilElementIsClickable(addPerson);
        addPerson.click();
    }

    public void OneWayButton() {
        WaitForElement.waitUntilElementIsClickable(oneWayButton);
        oneWayButton.click();
    }

    public void ClickLogin() {
        WaitForElement.waitUntilElementIsClickable(loginButton);
        loginButton.click();
    }
    public void AcceptingCookies(){
     WaitForElement.waitUntilElementIsClickable(cookies);
     cookies.click();
    }
}
