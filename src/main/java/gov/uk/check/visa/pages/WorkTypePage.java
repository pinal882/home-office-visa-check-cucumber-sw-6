package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * nextStepButton, selectJobtypeList locators and create methods 'void
 * selectJobType(String job)'
 * and 'void clickNextStepButton()'
 */
public class WorkTypePage extends Utility {
    @CacheLookup
    @FindBy(id = "response-0")
    WebElement jobTypeList;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    public void selectJobType(String job){
        clickOnElement(jobTypeList);
    }
    public void clickOnNextStepButton(){
        clickOnElement(nextStepButton);
    }
}
