package tests;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.NewsletterPage;
import pages.SignInPage;
import util.WebConnector;

public class commonUtil {
    WebConnector selenium = WebConnector.getInstance();
    private NewsletterPage newsletterPage = new NewsletterPage(selenium.driver);
    private SignInPage signInPage = new SignInPage(selenium.driver);

    @After()
    public void tearDown(Scenario scenario) throws InterruptedException {
        if (scenario.isFailed()) {
            scenario.write("Failed Scenario: "+ scenario.getName());
            // Take a screenshot
            final byte[] screenshot = ((TakesScreenshot)selenium.driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
       selenium.signOut();
    }
}
