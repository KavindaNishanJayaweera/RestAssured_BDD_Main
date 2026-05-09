
Feature: GetPetData

@Regression
    Scenario: Post Pet Data
    Given the pets attributes PetID "1" PetName "Kiti" and Status "Active"
    Then Verify the status code 200
    