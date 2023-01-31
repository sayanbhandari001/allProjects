Feature: Login Feature

  @test
  Scenario Outline: Successfull login
    Given user is on login page
    When user enters valid "<username>" and "<password>"
    Then click on login button
    And user should navigate to home page

    Examples: 
      | username | password |
      |   Ravi       |     sam     |
