Feature: Interview Task

  Scenario Outline: Booking tickets with wrong credit card number

    Given Open browser and navigate to Ryanair page
    And I make a booking one way tickets from Gdansk to London  for two adults
#    And Login under test user with login: "<login>" and password "<password>"
#    When I pay for booking with card details “5555 5555 5555 5557”, “10/18” and “265”
#    Then I should get payment declined message

    Examples:
      | login                       | password  | title | name      | surname | number           | month | year | cvv | cardholder     | country | city | address | code  |
      | sebastianwild1988@gmail.com | Testing1  | MR    | Sebastian | Wild    | 1234567891234567 | 2     | 2023 | 123 | Sebastian Wild | Spain   | Faro | street  | 12345 |
