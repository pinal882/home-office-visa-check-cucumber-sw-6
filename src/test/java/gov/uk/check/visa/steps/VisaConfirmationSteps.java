package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VisaConfirmationSteps {
    @Given("I am on Homepage")
    public void iAmOnHomepage() {
    }

    @When("I Click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }
    @And("I Select a Nationality Australia")
    public void iSelectANationalityAustralia() {
        new SelectNationalityPage().selectNationality("Australia");
    }

    @And("I Click on Continue button")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickOnContinueButton();
    }

    @And("I Select reason Tourism")
    public void iSelectReasonTourism() {
        new ReasonForTravelPage().selectReasonForVisit("Tourism or visiting family and friends");
    }

    @Then("I see result {string}")
    public void iSeeResultYouWillNotNeedAVisaToComeToTheUK() {
        String expectedText = "You will not need a visa to come to the UK";
        String actualText = new ResultPage().getResultMessage();
        Assert.assertEquals(actualText,expectedText,"Text does not match");
    }

    @And("I Select a Nationality Chile")
    public void iSelectANationalityChile() {
        new SelectNationalityPage().selectNationality("Chile");
    }


    @And("I Select reason Work, academic visit or business")
    public void iSelectReasonWorkAcademicVisitOrBusiness() {
        new ReasonForTravelPage().selectReasonForVisit("Work, academic visit or business");
    }

    @And("I Select intendent to stay for longer than {int} months")
    public void iSelectIntendentToStayForLongerThanMonths(int months) {
        new DurationOfStayPage().selectLengthOfStay("longer than 6 months");
    }
    @And("I Click on Continue tab")
    public void iClickOnContinueTab() {
        new DurationOfStayPage().clickOnContinueTb();
    }

    @And("I Select have planning to work for Health and care professional")
    public void iSelectHavePlanningToWorkForHealthAndCareProfessional() {
        new WorkTypePage().selectJobType("Health and care professional");
    }

    @Then("I see result You need a visa to work in health and care")
    public void iSeeResultYouNeedAVisaToWorkInHealthAndCare() {
        String expectedText = "You need a visa to work in health and care";
        String actualText = new ResultPage().verifyResult();
        Assert.assertEquals(actualText,expectedText,"Text does not match");
    }

    @And("I Select a Nationality Colombia")
    public void iSelectANationalityColombia() {
        new SelectNationalityPage().selectNationality("Colombia");
    }

    @And("I Select reason Join partner or family for a long stay")
    public void iSelectReasonJoinPartnerOrFamilyForALongStay() {
        new ReasonForTravelPage().selectReasonForVisit("Join partner or family for a long stay");
    }


}
