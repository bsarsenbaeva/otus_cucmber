Feature: Validate otus profile

  Scenario: As an user I can open My courses page
    Given I navigate to Otus main page by 'https://otus.ru/'
    When I open LoginPage
    And I enter 'bakytgul.sarsenbayeva@btsdigital.kz' and 'VXuVrCLpT8su' in Login Page
    And I open My courses page
    Then I should see My courses list

    Scenario: As an user I can open Payment page
      Given I navigate to Otus main page by 'https://otus.ru/'
      When I open LoginPage
      And I enter 'bakytgul.sarsenbayeva@btsdigital.kz' and 'VXuVrCLpT8su' in Login Page
      And I open Payment page
      Then I should see My payments

  Scenario: As an user I can add Personal info
    Given I navigate to Otus main page by 'https://otus.ru/'
    When I open LoginPage
    And I enter 'bakytgul.sarsenbayeva@btsdigital.kz' and 'VXuVrCLpT8su' in Login Page
    And I navigate to My profile page
    And I add personal info and save
    Then The info should be saved

  Scenario: As an user I can add my specialization
    Given I navigate to Otus main page by 'https://otus.ru/'
    When I open LoginPage
    And I enter 'bakytgul.sarsenbayeva@btsdigital.kz' and 'VXuVrCLpT8su' in Login Page
    And I navigate to My profile page
    And I add my specialization and save
    Then The specialization should be saved
