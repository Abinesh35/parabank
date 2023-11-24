Feature: user is register and login the parabank webpage

  Scenario: User register the parabank webpage
    Given user launch the parabank website
    When User click register
    And User enter first name
    And user enter Last name
    And User enter Address
    And User enter city
    And User enter state
    And User enter Zipcode
    And user enter phone number
    And user enter SSN
    And User enter username
    And User enter Password
    And User confirmPassword
    Then User click register button

#    Scenario: User login into the parabank Webpage
#      When user enter username for login
#      And User enter password for login
#      Then user click login

Scenario: User create new account
  When user click open New Account
  And User select dropdown in account type
  Then User click open new account Button
#
Scenario: user transfer fund
  When User click transferFunds
  And user enter the amount
#  And user select to account
  Then User click transfer button

Scenario: User pay bill
  When user click bill pay
  And user enter Payee Name in billpay
  And user enter Address in billpay
  And user enter City in billpay
  And user enter State in billpay
  And user enter Zip Code in billpay
  And user enter Phone no in billpay
  And user enter Account in billpay
  And user enter Verify Account in billpay
  And User enter Amount
  Then user click send button



