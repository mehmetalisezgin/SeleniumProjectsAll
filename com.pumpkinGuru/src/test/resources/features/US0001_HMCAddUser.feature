Feature: US0001 HMCAddUser
  @hmce2e

  Scenario: TC001_HMC Add User E2E test

    Given kullanici hmc sayfasina gider
    And login linkine tiklar
    Then kullanici username olarak "HMCValidUsername" girer
    Then kullanici password olarak "HMCValidPassword" girer
    And kullanici login butonuna tiklar


  @hmce2e
   Scenario Outline: TC001_HMC AddUser username negative E2E Box Test
   Given the user clicks the add user button
   Then the user writes "<userName>" as a username
   And The user clicks the save button
   Then The user tests the negativeusername box

   Examples:
   |userName|
   | kjj    |
   |asdf    |
   |mustafa  |


