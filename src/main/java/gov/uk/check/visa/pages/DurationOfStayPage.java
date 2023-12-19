package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * nextStepButton, lessThanSixMonths, moreThanSixMonths locators
 * and create methods
 * 'void selectLengthOfStay(String moreOrLess)' (Note: use switch statement for select
 * moreOrLess stay) and
 * 'void clickNextStepButton()'
 */
public class DurationOfStayPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='How long are you planning to work in the UK for?']")
    WebElement stay;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueTb;
    public void selectLengthOfStay(String moreOrLess){
        int stay = 0;
        switch (stay){
            case 1:
                System.out.println("lessThanSixMonths");
                break;
            case 2:
                System.out.println("moreThanSixMonths");
                break;
            default:
                break;

        }

    }
    public void clickOnContinueTb(){
        clickOnElement(continueTb);
    }
}
