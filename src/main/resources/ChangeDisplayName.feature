Feature: Login

  Scenario: Login Functionality
    Given User is on the login page
    And User Enters UserName
    And User Enters Password
    And User clicks login button
#    Then User Should get a successful login message

  Scenario: Home Page Functionality
    When user clicks on leads tab
    When user clicks on new button
    When user clicks continue
    Then user should be on New Lead Page

  Scenario: New Lead
    When user creates lead
    And user clicks on save

  Scenario: Oppurtunity New Services Pitched
#    Given user is on Oppurtunity Page
    When user clicks on New Services Pitched
    And user clicks on Save All Service Request
    Then user should be navigated to Opportunity Details Page


  Scenario: Generate Order
    When user is on opportunity details page
    And user generates order




