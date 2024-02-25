
    Feature: Deposit test

    Here we would write extra explanation about our Feature file


    Scenario: We give scenario name here


      Given Bank account 1 exists with balance $1000

      When Bank account 1 deposits $100

      Then Bank account 1 should have $1100 in balance

      Scenario: Money transfer with enough balance
        Given User  account number 123456 is registered

        And  User  account number 123456 deposited $500
        When User with account number 123456 transferred $300
        And  User with account number 123456 transferred $200
        When User with account number 123456 should have $0 in the balance.