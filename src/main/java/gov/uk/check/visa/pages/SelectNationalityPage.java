package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * -nationalityDropDownList, nextStepButton locators and create
 * methods 'void selectNationality(String nationality)'
 * and 'void clickNextStepButton()'
 */
public class SelectNationalityPage extends Utility {
    @CacheLookup
    @FindBy(id = "response")
    WebElement nationalityDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;
    public void selectNationality(String nationality){
        selectByVisibleTextFromDropDown(nationalityDropDown,nationality);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
}
