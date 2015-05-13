package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class NewsletterPage extends AbstractPage{
    public NewsletterPage(WebDriver driver) {
        super(driver);
        ElementLocatorFactory factory =  new AjaxElementLocatorFactory(driver, DRIVER_WAIT);
        PageFactory.initElements(factory, this);
    }


    @FindBy(css="#u16_under16")
    private WebElement underSixteenButton;


    @FindBy(css="#u16_over16")
    private WebElement sixteenOrOverButton;


    @FindBy(css=".newsletter-sidetip")
    @CacheLookup
    private WebElement childSafetyText;


    @FindBy(css=".imp>span>a")
    private WebElement changeEmailLink;


    @FindBy(css="div.email-container.newsletters-section-container>p>span.toggle-link")
    private WebElement howWillTheBbcUseMyInfoLink;


    @FindBy(css="div.email-container.newsletters-section-container>p.small-print")
    private WebElement howWillTheBbcUseMyInfoText;


    @FindBy(css="p.small-print>a>span.emph")
    private WebElement bbcPrivacyCookiePolicyLink;


    @FindBy(css="#u13-confirmation-tick")
    private WebElement confirmThirteenOrOverCheckBox;


    @FindBy(css=".newsletter-button.submit[value=Subscribe]")
    @CacheLookup
    private WebElement subscribeButton;


    @FindBy(css=".newsletter-button.cancel")
    @CacheLookup
    private WebElement cancelButton;


    @FindBy(css="#other-newsletters-tick")
    private WebElement subscribeToTheGeneralBbcNewsletterCheckBox;


    @FindBy(css="div.newsletter-checkbox-container.blq-clearfix>p.other-newsletters>span.toggle-link")
    private WebElement whatIsInTheGeneralBbcNewsletterLink;


    @FindBy(css="div.newsletter-checkbox-container.blq-clearfix>p.small-print")
    private WebElement whatIsInTheGeneralBbcNewsletterText;


    public void clickUnderSixteenButton() {
        logger.info("Clicking under sixteen button on NewsletterPage");
        underSixteenButton.click();
    }


    public void clickSixteenOrOverButton() {
        logger.info("Clicking sixteen or over button on NewsletterPage");
        sixteenOrOverButton.click();
    }


    public boolean isChildSafetyTextPresent() {
        logger.info("Checking the presence of child safety text on NewsletterPage");
        return childSafetyText.isDisplayed();
    }




    public void clickHowWillTheBbcUseMyInfoLink() {
        logger.info("Clicking how will BBC use my info link on NewsletterPage");
        howWillTheBbcUseMyInfoLink.click();
    }


    public String getHowWillTheBbcUseMyInfoText() {
        logger.info("Getting how will BBC use my info text on NewsletterPage");
        return howWillTheBbcUseMyInfoText.getText();
    }

    public void clickBbcPrivacyCookiePolicyLink() {
        logger.info("Clicking BBC privacy cookie policy link on NewsletterPage");
        bbcPrivacyCookiePolicyLink.click();
    }


    public void clickWhatIsInTheGeneralBbcNewsletterLink() {
        logger.info("Clicking what is the general BBC Newsletter link on NewsletterPage");
        whatIsInTheGeneralBbcNewsletterLink.click();
    }


    public String getWhatIsInTheGeneralBbcNewsletterText() {
        logger.info("Getting what is in the general BBC Newsletter text on NewsletterPage");
        return whatIsInTheGeneralBbcNewsletterText.getText();
    }


    public void clickSubscribeButton() {
        logger.info("Clicking subscribe button on NewsletterPage");
        subscribeButton.click();
    }

    public void clickConfirmThirteenOrOverCheckBox() {
        logger.info("Clicking confirm thirteen or over checkbox on NewsletterPage");
        confirmThirteenOrOverCheckBox.click();
    }

    public void clickSubscribeToTheGeneralBbcNewsletterCheckBox() {
        logger.info("Clicking subscribe to the general BBC Newsletter checkbox on NewsletterPage");
        subscribeToTheGeneralBbcNewsletterCheckBox.click();
    }

    public boolean isThirteenOrOverCheckBoxPresent() {
        logger.info("Checking the presence of thirteen or over checkbox on NewsletterPage");
        return confirmThirteenOrOverCheckBox.isDisplayed();
    }

    public boolean isSubscribeToTheGeneralBbcNewsletterCheckBoxPresent() {
        logger.info("Checking the presence of subscribe to the general BBC Newsletter checkbox on NewsletterPage");
        return subscribeToTheGeneralBbcNewsletterCheckBox.isDisplayed();
    }

    public String getNewsletterPageTitle() {
        logger.info("Getting the page title of NewsletterPage");
        return driver.getTitle();
    }

}

