Untuk challenge 2 membuat test case dengan format scenario outline,
Buatlah Gherkin scenario berdasarkan test step yang ada pada
challenge sebelumnya, namun dengan memberikan variable opsi
pada Payment Method dan Delivery Method.

Feature: Checkout
Scenario: User checkout 3 pcs Susu Bendera
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
    And User select <payment>
    And User select <shipping>
    When User click "Buy" button
    Then User is on "Waiting For Payment" page
    And User is able to see "BCA VA number" displayed 

Examples:
|  payment | shipping |
|  BCA VA  | SiSonic  |
|  Gopay   | JTT      |
