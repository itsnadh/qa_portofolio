Untuk challenge 1 membuat test case sederhana dengan Gherkin,
rubahlah test case berikut yang masih dalam format imperative atau
prosedural kedalam bentuk Gherkin:
Steps:
1. User go to BinarMart login page
2. User input email using “test@gmail.com”
3. User input password using “password123”
4. User is on BinarMart homepage
5. User click add to Cart button on item “Susu Bendera”
6. User click Shopping Cart icon in the top right corner
7. User modify “Susu Bendera” item become “3”
8. User click checkout button
9. User select “BCA VA” as payment method
10. User select “SiSonic” as delivery method
11. User click Buy button
12. User is on Waiting For Payment Page
13. User should see BCA VA number displayed

Feature: Checkout
Scenario: User checkout 3 pcs Susu Bendera
    Given User launch "BinarMart" app
    And User is on "Login" page
    And User insert "test@gmail.com" as email
    And User insert "password123" as password
    When User click "Login" button
    Then User is logged in
    And User is on "Home" page
    And User click "Search field" 
    And User insert "Susu Bendera"
    When User click Enter
    Then User is on "Products" page
    And User is able to see product informations related to Susu Bendera 
    When User click on "Add to Cart" button on product Susu Bendera
    Then Susu Bendera is added to Shopping Cart
    And User click on "Shopping Cart" icon in the top right corner
    And User click on "+" icon twice
    And The quantity of Susu Bendera changed to "3"
    And User click on "Checkout" button
    And User select "BCA VA" as payment method
    And User select "SiSonic" as delivery method
    When User click "Buy" button
    Then User is on "Waiting For Payment" page
    And User is able to see "BCA VA number" displayed 