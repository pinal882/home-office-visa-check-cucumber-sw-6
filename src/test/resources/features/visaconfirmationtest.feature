Feature: visaConfirmationTest

  @regression
 Scenario: anAustralianComingToUKForTourism.
 Given  I am on Homepage
 When I Click on start button
 And  I Select a Nationality Australia
 And I Click on Continue button
And I Select reason Tourism
 And I Click on Continue button
 Then  I see result 'You will not need a visa to come to the UK'

  @regression
Scenario: aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths.
  Given  I am on Homepage
When  I Click on start button
And I Select a Nationality Chile
And I Click on Continue button
And I Select reason Work, academic visit or business
And I Click on Continue button
And I Select intendent to stay for longer than 6 months
And I Click on Continue tab
And I Select have planning to work for Health and care professional
And I Click on Continue button
Then I see result You need a visa to work in health and care
@@regression
Scenario: aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAn Article10 Or 20Card
  Given  I am on Homepage
When I Click on start button
And I Select a Nationality Colombia
And I Click on Continue button
And I Select reason Join partner or family for a long stay
And I Click on Continue button
#And I Select state My partner of family member have uk immigration status 'yes'
And I Click on Continue button
#Then I see result You’ll need a visa to join your family or partner in the UK

