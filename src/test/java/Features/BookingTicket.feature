Feature: Interview Task

  Scenario Outline: Booking tickets with wrong credit card number

    Given Open browser and navigate to Ryanair page
    And I make a booking one way tickets from Gdansk to London for two adults
    And Select ticket price and choose baggage
    And Fill out all needed flight information with "<nameFirstPerson>" and "<surnameFirstPerson>" and "<nameSecondPerson>", "<surnameSecondPerson>"
    And Choose random seats for passengers
    And Choose Cabin Bag
    And Don't choose any additives and go next
    And Go to basket and login by login "<login>" and "<password>"
    When I pay for booking with card details "<number>", "<month/year>", cvv "<cvv>" and "<cardholder>"
    And Provide billing address "<city>" "<address>" "<zipCode>" and select country
    Then I should get payment declined message

    Examples:
      | login                       | password | nameFirstPerson | surnameFirstPerson | nameSecondPerson | surnameSecondPerson | number           | month/year | cvv | cardholder     | city      | address | zipCode |
      | sebastianwild1988@gmail.com | Testing1 | Sebastian       | Wild               | Katarzyna        | Kowalska            | 1234567891234567 | 0223       | 123 | Sebastian Wild | Barcelona | street  | 12345   |
