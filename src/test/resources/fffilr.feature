@sanity
Feature: SignUp

Background:
When user runs for a scenario

@sanity
Scenario Outline: AccountCreation
   
    When user enters firstname "<fname>"
    And user enters lastname  "<lname>"
    And user enters phno "<ph>"
    And user enters password "<pass>"
     And user selects dob "<day>""<month>""<year>"
      And user selects gender
       And user creates account "<caseb>"
    Then I validate the outcomes "<casea>"
  
Examples:

|fname|lname|ph|pass|caseb|casea|day|month|year|
|name1|lname1|4513545434|pass1|case1|case1|16|Jan|1998|
|name2|lname1|45135454342222|pass1|case2|case2|6|Mar|2000|
|name2|lname2|4555|pass1|case3|case3|29|Nov|2022|