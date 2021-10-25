Feature: User calculates Osago

  Scenario: User select Osago
    Given I open Soglasie Main Page
    When  I select OSAGO department
    Then  I verify OSAGO page is opened
    Then  I fill Name Osago claim form with values
      | Иванов Иван  |
      | +7923546554  |
      | none@mail.ru |
      | Новосибирск  |
      | Note note no |



#    Then  I fill Name Osago claim form with phone "+79236701107"

