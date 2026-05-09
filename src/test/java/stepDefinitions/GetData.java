package stepDefinitions;

import API.getPetData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetData  {
	
	
	
	@Given("the petstore endpoint {string}")
	public void the_petstore_endpoint(String string) {
		
		getPetData.getDataMethod1();
	}

	@When("I send GET request")
	public void i_send_GET_request() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("response status code should be {int}")
	public void response_status_code_should_be(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		getPetData.verifyStatusCode(int1);
	}

	@Then("response data should be mapped to pet object model")
	public void response_data_should_be_mapped_to_pet_object_model() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("all pets status should be {string}")
	public void all_pets_status_should_be(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


}
