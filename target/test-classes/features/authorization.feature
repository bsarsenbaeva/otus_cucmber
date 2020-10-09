Feature: Validate otus authorization

  Scenario: As an user I can authorize to site
    Given I navigate to Otus main page by 'https://otus.ru/'
    When I open LoginPage
    And I enter 'bakytgul.sarsenbayeva@btsdigital.kz' and 'VXuVrCLpT8su' in Login Page
    Then I should be authorized

  Scenario: As an user I can logout
    Given  I navigate to Otus main page by 'https://otus.ru/'
    When I open LoginPage
    And I enter 'bakytgul.sarsenbayeva@btsdigital.kz' and 'VXuVrCLpT8su' in Login Page
    And I click logout button
    Then I should be unauthorized
