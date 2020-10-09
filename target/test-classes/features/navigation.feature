Feature: Validate Otus navigation

  Scenario Outline: As an user I can navigate to categories page
    Given I navigate to Otus main page by 'https://otus.ru/'
    When I select tab '<tabName>'
    Then I should see <numberOfCourses> courses on '<tabName>' page
    Examples:
      | tabName                       | numberOfCourses |
      | Программирование              | 56              |
      | Инфраструктура                | 31              |
      | Информационная безопасность   | 7               |

    Scenario: As an user I can open about Otus Page
      Given I navigate to Otus main page by 'https://otus.ru/'
      When I navigate to AboutOtusPage
      Then I should see AboutOtusPage
