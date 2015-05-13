package tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import util.WebConnector;

    import java.net.MalformedURLException;

    @RunWith(Cucumber.class)
    @CucumberOptions(format = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber.json"},
            features = "src/test/resources",
            tags = {"@Newsletters"})

    public class TestRunner {

        @BeforeClass
        public static void setUp() throws MalformedURLException {
            WebConnector.getInstance().openBrowser();
        }


        @AfterClass
        public static void quitBrowser(){
            WebConnector.getInstance().quit();

        }
    }


