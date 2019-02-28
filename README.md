# minibank
Simulation of a banking system written in Java for KATA project

# Exercise
Feature: Withdraw from account
  * As a client of the bank
  * I want to withdraw money from my account
  * In order to have cash

  Scenario: An existing client withdraws from his account
  * Given an existing client named "pierre-jean" with 100.0 EUR in his account
  * When he withdraws 10.0 EUR from his account
  * Then the new balance is 90.0 EUR

# How can I implement the application from user requirements
Firstly, I use the textual analysis method (Abott) to identify the candidate items for my model element (UML).
After evaluation, I stick with the model element:
Model component: class 
* Actor: Account
* Object: Balance
* Property: Balance (10.0, 90.0)
* Operation: Withdraw
* Instance: pierre-jean, 10, 90

# Test-driven develoment cycle




