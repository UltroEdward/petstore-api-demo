Feature: Pet store

  Background: prepare new pet
    Given I add pet to store
    And I have got http status "200"
    And I have got pet in response

  @test1
  @pet.crud
  Scenario: Add pet to store
    Then The pet was added to store successfully

  @test2
  @pet.crud
  Scenario: Remove pet from store
    When I remove pet from store
    Then I have got http status "200"
    And The pet was removed from successfully

  @test3
  Scenario: Place order to buy a pet
    When I place order to buy the pet
    Then I have got http status "200"
    And The order status is "placed"

  @test4
  @bug
  Scenario: Place order to buy a pet
    Then The pet has status "sold"
