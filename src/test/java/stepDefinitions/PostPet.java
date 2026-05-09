package stepDefinitions;

import API.postAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PostPet {
	


	@Given("the pets attributes PetID {string} PetName {string} and Status {string}")
	public void the_pets_attributes_PetID_PetName_and_Status(String petID, String petName, String status) {
	
		int id = Integer.parseInt(petID);
		postAPI.send_post_request(id,petName,status);
	}

	@Then("Verify the status code {int}")
	public void verify_the_status_code(Integer statusCode) {
		postAPI.verify_status(statusCode);
	}


}
