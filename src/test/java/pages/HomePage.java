package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class HomePage extends AbstractPage{


    public HomePage(WebDriver driver) {
        super(driver);
        ElementLocatorFactory factory =  new AjaxElementLocatorFactory(driver, DRIVER_WAIT);
        PageFactory.initElements(factory, this);
    }


    public String getTitle() {
        logger.info("Getting page title on HomePage");
        return driver.getTitle();
    }

}

