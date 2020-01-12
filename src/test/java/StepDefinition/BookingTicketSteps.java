package StepDefinition;

import Base.BaseUtil;
import Pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

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
    public void iMakeABookingOneWayTicketsFromGdanskToLondonForTwoAdults() {
        HomePage homePage = new HomePage();
        homePage.AcceptingCookies();
        homePage.OneWayButton();
        homePage.DepartureCity();
        homePage.DestinationCity();
        homePage.DateFly();
        homePage.AddingOnePerson();
        homePage.ClickingSearchButton();
    }

    @And("^Select ticket price and choose baggage$")
    public void selectTicketPriceAndChooseBaggage() {
        BaggagePage baggagePage = new BaggagePage();
        baggagePage.SelectTicketPrice();
        baggagePage.SelectBaggage();
    }


    @And("^Fill out all needed flight information with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\", \"([^\"]*)\"$")
    public void fillOutAllNeededFlightInformationWithAndAnd(String first_name1, String lastName1, String first_name2, String lastName2) {
        BaggagePage baggagePage = new BaggagePage();
        baggagePage.SelectFirstPassengerTitle();
        baggagePage.FirstNameFirstPassenger(first_name1);
        baggagePage.LastNameFirstPassenger(lastName1);
        baggagePage.SelectSecondPassengerTitle();
        baggagePage.FirstNameSecondPassenger(first_name2);
        baggagePage.LastNameSecondPassenger(lastName2);
        baggagePage.ClickingContinueButton();
    }

    @And("^Choose random seats for passengers$")
    public void chooseRandomSeatsForPassengers() {
        SitsPage sitsPage = new SitsPage();
        sitsPage.ChooseRandomSits();

    }

    @And("^Choose Cabin Bag$")
    public void chooseCabinBag() {
        CabinBagPage cabinBagPage = new CabinBagPage();
        cabinBagPage.selectSmallBagForPassengers();
        cabinBagPage.clickingContinueButton();

    }

    @And("^Don't choose any additives and go next$")
    public void donTChooseAnyAdditivesAndGoNext() {
        AdditivesPage additivesPage = new AdditivesPage();
        additivesPage.clickingContinueButton();

    }

    @When("^Go to basket and login by login \"([^\"]*)\" and \"([^\"]*)\"$")
    public void goToBasketAndLoginByLoginAnd(String login, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.BasketButton();
        loginPage.Login(login, password);
    }

    @When("^I pay for booking with card details \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\" and cvv \"([^\"]*)\"$")
    public void iPayForBookingWithCardDetailsAndCvv(String cardNumber, int month, int year, int cvv) throws InterruptedException {
        PaymentPage paymentPage = new PaymentPage();
        paymentPage.ChoosInsurence();
        paymentPage.PaymentMethods();
        Thread.sleep(5000);
    }

//    @And("^Provide billing address \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\",\"([^\"]*)\"$")
//    public void provideBillingAddress(String arg0, String arg1, String arg2, String arg3, String arg4) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
}
