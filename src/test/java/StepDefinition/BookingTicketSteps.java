package StepDefinition;

import Base.BaseUtil;
import Pages.HomePage;
import Pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import static Base.BaseUtil.APPLICATION_URL;

public class BookingTicketSteps {

    private BaseUtil baseUtil;

    public BookingTicketSteps(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;
    }

    @Given("^Open browser and navigate to Ryanair page$")
    public void openBrowserAndNavigateToRyanairPage() {
        BaseUtil.navigateToPage(APPLICATION_URL);
    }

    @And("^I make a booking one way tickets from Gdansk to London  for two adults$")
    public void iMakeABookingOneWayTicketsFromGdanskToBarcelonaForTwoAdults() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.OneWayButton();
        homePage.DepartureCity();
        homePage.DestinationCity();
        homePage.DateFly();
        homePage.AddingOnePerson();
        homePage.ClickingSearchButton();
        Thread.sleep(3000);
    }

    @And("^Login under test user with login: \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void loginUnderTestUserWithLoginAndPassword(String login, String password) {
        HomePage homePage = new HomePage();
        homePage.ClickLogin();
        LoginPage loginPage = new LoginPage();
        loginPage.Login(login, password);
    }

}
