@Newsletters
Feature: Signed user subscribing a newsletter
  As a signed user wanting to subscribe to newsletter
  I want to be presented with an option to subscribe to newsletter
  So that I can receive the newsletter I am interested in


  @Newsletters
  Scenario: Under sixteen user able to see the subscription form
    Given I am signed in as an under sixteen user
    When I choose under sixteen option
    Then I should see the under sixteen subscription form


  @Newsletters
  Scenario Outline: Under sixteen user able to know how BBC will use his information
    Given I am signed in as an under sixteen user
    When I choose under sixteen option
    Then I should be able to see how BBC will use his information "<message>"

    Examples:
        | message                                                                                    |
        | We'll store your information securely and use it to provide the services you've requested. |

