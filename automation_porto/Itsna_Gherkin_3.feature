Untuk challenge 3 membuat test case dengan menggunakan
Background,
Buatlah Gherkin scenario berdasarkan login step hingga ke homepage
yang ada pada challange sebelumnya, dan buatlah test case dengan
scenario-scenario berikut
- User search “Kecap Indofood” on search bar
- User buy prepaid pulsa
- User go to transaction list page and cancel transaction

Feature: Transaction
Background: User lauch app and login using valid credentials
    Given User launch "BinarMart" app
    And User is on "Login" page
    And User insert "test@gmail.com" as email
    And User insert "password123" as password
    When User click "Login" button
    Then User is logged in
    And User is on "Home" page
    
Scenario Outline: User search “Kecap Indofood” on search bar 
    When User click on "Search field" 
    And User insert "Kecap Indofood"
    When User click Enter
    Then User is on "Products" page
    And User is able to see product informations related to Kecap Indofood

Scenario Outline: User buy prepaid pulsa
    When User click on "Pulsa & Data" button
    Then User is on "Pulsa & Data" page
    And User click on "Pulsa" button
    And User insert valid number phone
    And User click on "20.000"
    When User click on "Buy" button
    Then User is on "Checkout" page
    And User select "Gopay" as payment method
    And User click "Pay" button
    Then User is on "Payment" page
    And User is able to see "Gopay account number" 

Scenario Outline: User go to transaction list page and cancel transaction
    When User click "Transaction" button
    Then User is on "Transaction" page
    And User is able to see transaction lists
    When User click on "Pulsa 20.000" transaction
    And User click on "Cancel Transaction" button
    Then Confirmation message "Are you sure to cancel this transaction?" will appear
    When User click on "Yes, Cancel" button
    Then The transaction is canceled
    And The "Pulsa 20.000" transaction status is changed to "canceled"