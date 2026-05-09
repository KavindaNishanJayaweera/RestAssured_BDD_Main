package API;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import API.ObjectMapper.PetResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getPetData {
	
	
	 static int responseCode;

	/*
	 * Sends GET request to PetStore API and saves response to JSON file
	 
	public static void getDataMethod222() {

		Response test = RestAssured.get("https://petstore.swagger.io/v2/pet/findByStatus?status=available");
		int code= test.getStatusCode();
		String data = test.getBody().asString();
		System.out.println(code);
		System.out.println(data);


	} */

	 public static List<PetResponse.Pet> getDataMethod1() {
	        
		 
		 	Response response = RestAssured.get("https://petstore.swagger.io/v2/pet/findByStatus?status=available");
	        
	        int statusCode = response.getStatusCode();
	        System.out.println("Status Code: " + statusCode);
	        
	        String jsonString = response.getBody().asString();
	        System.out.println("Response Body: " + jsonString);
	        
	        responseCode = response.getStatusCode();
	        
	        // Deserialize JSON string to List<PetResponse.Pet>
	        ObjectMapper mapper = new ObjectMapper();
	        try {
	            List<PetResponse.Pet> pets = mapper.readValue(jsonString, new TypeReference<List<PetResponse.Pet>>() {});
	            for (PetResponse.Pet pet : pets) {
	                System.out.println("===== Pet =====");
	                System.out.println("ID: " + pet.getId());
	                System.out.println("Name: " + pet.getName());
	                System.out.println("Status: " + pet.getStatus());
	                
	                
	                // Category
	                PetResponse.Category category = pet.getCategory();
	                if (category != null) {
	                    System.out.println("Category ID: " + category.getId());
	                    System.out.println("Category Name: " + category.getName());
	                }
	                
	                // Photo URLs
	                System.out.println("Photo URLs: " + pet.getPhotoUrls());
	                
	                // Tags
	                List<PetResponse.Tag> tags = pet.getTags();
	                if (tags != null) {
	                    for (PetResponse.Tag tag : tags) {
	                        System.out.println("  Tag ID: " + tag.getId() + ", Name: " + tag.getName());
	                    }
	                }
	                System.out.println(); // blank line between pets
	                
	                if (pet.getId().equals("865251058354043900")) {
	                	
	                	  System.out.println("ID Found ############################################"+pet.getId());
	                	  break;
	                }
	            }
	            
	            ///
	            return pets;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
	 
	 
	 public static void verifyStatusCode(int statuscode) {

		 assertEquals(responseCode, statuscode);
		 System.out.println("Verified Sataus Code is" +responseCode);
	 }
	
}
