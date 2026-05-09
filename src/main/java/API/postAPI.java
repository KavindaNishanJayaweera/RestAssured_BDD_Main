package API;
import static org.junit.Assert.assertEquals;

import API.ObjectMapper.PetResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.http.ContentType;
public class postAPI {
	
	
	public static int responseStatusCode;
	static Response	 response	;


	public static void send_post_request(int code, String type, String message) {

	    String body = "{\n" +
	            "  \"id\": " + code + ",\n" +
	            "  \"name\": \"" + type + "\",\n" +
	            "  \"status\": \"" + message + "\"\n" +
	            "}";

	    Response response = RestAssured
	            .given()
	            .contentType(ContentType.JSON)
	            .body(body)
	            .post("https://petstore.swagger.io/v2/pet");

	    responseStatusCode = response.getStatusCode();
	    System.out.println("Status Code: " + responseStatusCode);
	    System.out.println("Response Body: " + response.getBody().asString());
	} 
	
	
	public static void verify_status(int statusCode) {
       
		 assertEquals(responseStatusCode, statusCode);
    }

}