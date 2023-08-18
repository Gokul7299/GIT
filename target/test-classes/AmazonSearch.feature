
@smoke
Feature: Amazon Search
    
Background: 
Given user launchBrowser "https://www.amazon.com/" 



@smoke 
  Scenario: Mobile Search
  
    When user selects Mobile Name
    And user searches Mobile
    And user gets Details
    Then I validate the outcomes
   

 
 
