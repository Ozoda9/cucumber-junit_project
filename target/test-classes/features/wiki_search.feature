Feature: Wikipedia Search Functionality and verifications

  Background:
    Given User is on Wikipedia home page

  Scenario: Wikipedia Search Functionality Title Verification
    #Given User is on Wikipedia home page
    When User types Steve Jobs in the wiki search box
    And User clicks wiki search button
    Then User sees Steve Jobs is in the wiki title


  Scenario: Wikipedia Search Functionality Title Verification
    #Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title


  Scenario: Wikipedia Search Functionality Title Verification
    #Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the main header

  @scenarioOutline
  Scenario Outline: Wikipedia Search Functionality Title Verification using DDT
    Given User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the main header

    Examples:
      | searchValue        | expectedTitle      |
      | Steve Jobs         | Steve Jobs         |
      | Bill Gates         | Bill Gates         |
      | Christiano Ronaldo | Christiano Ronaldo |
      | Elon Musk          | Elon Musk          |
      | Albert Einstein    | Albert Einstein    |
      | Chuck Norris       | Chuck Norris       |
      | Alisher Usmanov    | Alisher Usmanov    |

