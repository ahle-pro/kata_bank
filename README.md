# KATA bank
Practice code (kata) about a banking system written in Java using BDD.

### Prerequisites
* Reading: https://cucumber.io/school

### Exercise
```feature
Feature: Withdraw from account
  As a client of the bank
  I want to withdraw money from my account
  In order to have cash

  Scenario: An existing client withdraws from his account
    Given an existing client named "pierre-jean" with 100.0 EUR in his account
    When he withdraws 10.0 EUR from his account
    Then the new balance is 90.0 EUR
```

This scenario is written in Gherkin language.
### How do I model the application from user requirements ?
Firstly, I use the textual analysis method (Abbott) to identify the candidate items for my model element (UML).
After evaluation, I stick with the following model:
[Model component: class] 
* Actor: client represented in Account table
* Object: balance represented in Balance table (90.0)
* Operation or Use case: Withdraw implemented in MyPage class, existing client implemented in Authentication class
* Instance: "pierre-jean" (name of client) , 10 (withdrawal amount)
* Conditions: existing client (authentication), new balance

For sake of simplicity, think this application as an ATM

#### BDD (develoment cycle)
BDD is an extension to TDD. As you can see, the requirements are still in low level of detail. In order to have more detail, in Cucumber method, we organize a little meeting among 3 amigos (tester, developer, product owner) and we did a good stuff, called "example mapping" to have an "shared understanding" and produce an "ubiquitous language" for this tiny project.

```feature
Scenario Outline: A user withdraws money from an ATM

Given <Name> has a valid Credit or Debit card

And their account balance is <OriginalBalance>

When they insert their card

And withdraw <WithdrawalAmount>

Then the ATM should return <WithdrawalAmount>

And their account balance is <NewBalance>

    Examples:
      | Name   | OriginalBalance | WithdrawalAmount | NewBalance |
      | Eric   | 100             | 45               | 55         |
      | Gaurav | 100             | 40               | 60         |
      | Ed     | 1000            | 200              | 800        |

```

With the help of cucumber plugin
I run these tests and correct the code if they fail, repeat until all tests are successful.










#### Known issues
* Level of detail in this scenario is low
* Code is developped in pure Java without automation => slow


### Author
* Anh-Hoang LE


