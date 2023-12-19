package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * resultMessage locator and create methods 'String getResultMessage()' and
 * 'void confirmResultMessage(String expectedMessage)' (Note Use Assert.assertTrue)
 */
public class ResultPage extends Utility {
    @CacheLookup
    @FindBy(linkText = "  You will not need a visa to come to the UK")
    WebElement resultMessage;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You need a visa to work in health and care']")
    WebElement visaResult;
    public String getResultMessage(){
        return getTextFromElement(resultMessage);
    }
    public String   verifyResult(){
       return getTextFromElement(visaResult);
    }

}
