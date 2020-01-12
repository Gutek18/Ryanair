Feature: Interview Task

  Scenario Outline: Booking tickets with wrong credit card number

    Given Open browser and navigate to Ryanair page
    And I make a booking one way tickets from Gdansk to London  for two adults
    And Select ticket price and choose baggage
    And Fill out all needed flight information with "<name1>" and "<surname1>" and "<name2>", "<surname2>"
    And Choose random seats for passengers
    And Choose Cabin Bag
    And Don't choose any additives and go next
    And Go to basket and login by login "<login>" and "<password>"
    When I pay for booking with card details "<number>", "<month>","<year>" and cvv "<cvv>"
#    And Provide billing address "<country>" "<city>" "<address>" "<code>","<cardholder>"
#    Then I should get payment declined message

    Examples:
      | login                       | password | name1     | surname1 | name2     | surname2 | number           | month | year | cvv | cardholder     | country | city | address | code  |
      | sebastianwild1988@gmail.com | Testing1 | Sebastian | Wild     | Katarzyna | Kowalska | 1234567891234567 | 2     | 2023 | 123 | Sebastian Wild | Spain   | Faro | street  | 12345 |
