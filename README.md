# KATA bank
Simulation of a banking system written in Java for KATA.

### Prerequisites
* Reading: https://cucumber.io/school

### Exercise
Feature: Withdraw from account
  * As a client of the bank
  * I want to withdraw money from my account
  * In order to have cash

  Scenario: An existing client withdraws from his account
  * Given an existing client named "pierre-jean" with 100.0 EUR in his account
  * When he withdraws 10.0 EUR from his account
  * Then the new balance is 90.0 EUR

This scenario is written in Gherkin language.
### How do I model the application from user requirements ?
Firstly, I use the textual analysis method (Abbott) to identify the candidate items for my model element (UML).
After evaluation, I stick with the following model:
[Model component: class] 
* Actor: client represented in Account table
* Object: balance represented in Balance table (90.0)
* Operation or Use case: Withdraw implemented in MyPage class, existing client implemented in Authentication class
* Instance: "pierre-jean" (lastname of client) , 10 (withdrawal amount)
* Conditions: existing client (authentication), new balance

For sake of simplicity, think this application as an ATM

#### TDD & BDD (develoment cycle)
In this section, I explain each test cases designed from user requirements:
* For "existing client", add *should_client_existing* in AccountTest, by using an existing record in the database "pierre-jean".

* For "withdraw", add *should_new_balance_is_no_negative* in MyPageTest, by widthdrawing "100 EUR" on an account "90 EUR". 

I run these tests and correct the code if they fail, repeat until all tests are successful.

```
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


#### Known issues
* Level of detail in this scenario is low
* Code is developped in pure Java without automation => slow


### Author
* Anh-Hoang LE


