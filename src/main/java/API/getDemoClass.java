package API;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class getDemoClass {
	
	
	
	@Test
	public void getData() {
		
		
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		Response response =RestAssured
		.given()
		.header("Content-Type","application/json")
	//Query Parameters
	.queryParam("status", "available")
	//	.queryParam("status", "pending")
		.when()
		.get("/pet/findByStatus")
		.then()
		.extract().response ();
		
		int code = response.statusCode();
        //String data1 = response.getBody().toString();
		String petData=response.asString();
	
		System.out.println("StatusCode" +code);
		//System.out.println("Data" +response.asString());
		System.out.println("Data" +petData);

        //Expected - code vs Actual - 200
		Assert.assertEquals(code, 200);



	}




}
