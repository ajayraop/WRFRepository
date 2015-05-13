package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;


public class SignInPage extends AbstractPage{

    public SignInPage(WebDriver driver) {
        super(driver);
        ElementLocatorFactory factory =  new AjaxElementLocatorFactory(driver, DRIVER_WAIT);
        PageFactory.initElements(factory, this);
    }


    @FindBy(css="#bbcid_unique")
    @CacheLookup
    private WebElement usernameInputBox;

    @FindBy(css="#bbcid_password")
    @CacheLookup
    private WebElement passwordInputBox;

    @FindBy(css="#bbcid_submit_button")
    @CacheLookup
    private WebElement signInButton;

    @FindBy(css=".bbcid-button.cancel")
    @CacheLookup
    private WebElement cancelButton;

    @FindBy(css="#bbcid-signin-form.bbcid-form")
    @CacheLookup
    private WebElement signInForm;


    public void enterUsername(String username) {
        usernameInputBox.clear();
        usernameInputBox.sendKeys(username);
        logger.info("Entering username in username input field on SignInPage");
    }


    public void enterPassword(String password) {
        passwordInputBox.clear();
        passwordInputBox.sendKeys(password);
        logger.info("Entering password in password input field on SignInPage");
    }

    public void clickSubmitButton() {
        logger.info("Clicking submit button on SignInPage");
        signInButton.click();
    }

    public void clickCancelButton() {
        logger.info("Clicking cancel button on SignInPage");
        cancelButton.click();
    }

    public boolean isSignInFormPresent(){
        logger.info("Checking the presence of SignIn form on SignInPage");
        return signInForm.isDisplayed();
    }



    public NewsletterPage doLoginAsSixteenOrOverUser() throws InterruptedException {
        enterUsername(System.getProperty("username"));
        enterPassword(System.getProperty("password"));
        clickSubmitButton();
        logger.info("Logging in as a sixteen or over user on SignInPage");
        return new NewsletterPage(driver);
    }


    public NewsletterPage doLoginAsUnderSixteenUser() throws InterruptedException {
        enterUsername(System.getProperty("under16username"));
        enterPassword(System.getProperty("under16password"));
        clickSubmitButton();
        logger.info("Logging in as an under sixteen or over user on SignInPage");
        return new NewsletterPage(driver);
    }


}

