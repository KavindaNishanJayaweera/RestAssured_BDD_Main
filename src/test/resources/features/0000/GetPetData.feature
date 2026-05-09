
Feature: GetPetData

@Regression
  Scenario: Get available pets
    Given the petstore endpoint "https://petstore.swagger.io/v2/pet/findByStatus?status=available"
    When I send GET request
    Then response status code should be 200
    And response data should be mapped to pet object model
    And all pets status should be "available"
    

    