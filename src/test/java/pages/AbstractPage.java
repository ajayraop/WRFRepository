package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class AbstractPage {
    protected WebDriver driver;
    final static Logger logger = Logger.getLogger(AbstractPage.class.getName());
    public int DRIVER_WAIT = 60;


    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        ElementLocatorFactory factory =  new AjaxElementLocatorFactory(driver, DRIVER_WAIT);
        PageFactory.initElements(factory, this);
    }


    public void navigateToLandingPage() {
        driver.navigate().to(System.getProperty("baseUrl"));
        logger.info("Navigating to the LandingPage");
    }
}