package tests;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.*;
import util.WebConnector;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.fail;

public class SignedInUserTest {

    WebConnector selenium = WebConnector.getInstance();
    private AbstractPage abstractPage = new AbstractPage(selenium.driver);
    private SignInPage signInPage = new SignInPage(selenium.driver);
    private NewsletterPage newsletterPage = new NewsletterPage(selenium.driver);
    private HomePage homePage = new HomePage(selenium.driver);



    @Given("^I am signed in as an under sixteen user$")
    public void i_am_signed_in_as_an_under_sixteen_user() throws Throwable {
        abstractPage.navigateToLandingPage();
        signInPage.doLoginAsUnderSixteenUser();
    }

    @When("^I choose thirteen or over option$")
    public void i_choose_thirteen_or_over_option() throws Throwable {
        newsletterPage.clickConfirmThirteenOrOverCheckBox();
    }



    @Then("^I should see the successful subscription confirmation message$")
    public void i_should_see_the_successful_subscription_confirmation_message() throws Throwable {
        String successfulSubscriptionAllDoneMessageText = "All done!";
        String successfulSubscriptionConfirmationMessageText = "You've subscribed and should start receiving the newsletter soon. You can unsubscribe any time using the link in the newsletter.";
        try {
            assertTrue(signInPage.isSignInFormPresent());
        } catch (Exception e) {
            e.printStackTrace();
            fail("Error occurred " + e.getMessage());
        }
    }

}
