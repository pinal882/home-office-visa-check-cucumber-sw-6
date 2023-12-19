package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * - nextStepButton, reasonForVisitList locators and create methods
 * 'void selectReasonForVisit(String reason)'
 * and 'void clickNextStepButton()'
 */
public class ReasonForTravelPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueTab;


    public void clickOnContinueTab() {
        clickOnElement(continueTab);
    }

    public void selectReasonForVisit(String reason) {
        //List<WebElement> reasons = getListOfElements((By)(reasonList));
        List<WebElement> reasons = driver.findElements(By.xpath("//div[@class='govuk-radios']"));
        //List<WebElement> reasons = driver.findElements(By.xpath("//h1[normalize-space()='What are you coming to the UK to do?']"));
        for (WebElement option : reasons) {
            if (option.getText().contains("Tourism or visiting family and friends")) {
                option.click();
            } else if (option.getText().contains("Work, academic visit or business")) {
                option.click();
            } else if (option.getText().contains("Join partner or family for a long stay")) {
                option.click();
            } else {
                System.out.println("options not available");
            }

        }
    }
}
