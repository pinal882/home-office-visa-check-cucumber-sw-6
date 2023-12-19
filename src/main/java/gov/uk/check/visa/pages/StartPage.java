package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * startNowButton locatores and create method 'void clickStartNow()'
 */
public class StartPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[@class='gem-c-button govuk-button govuk-button--start']")
    WebElement startNowButton;
    public void clickStartNow(){
        clickOnElement(startNowButton);
    }

}
