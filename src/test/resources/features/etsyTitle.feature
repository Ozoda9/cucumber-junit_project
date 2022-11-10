Feature: Etsy Title Verification
  User story: As a user I should see the correct title


  Scenario: Etsy title verification
    When User is on the etsy website
    Then User should see title as expected


  Scenario: Etsy Search Functionality Title Verification
    Given User is on the etsy website
    When User types Wooden Spoon in the search box and clicks search button
    Then User sees Wooden Spoon is in the title


  Scenario: Etsy Search Functionality Title Verification
    Given User is on the etsy website
    When User types "Wooden Spoon" in the search box and clicks search button
    Then User sees "Wooden spoon" is in the title


