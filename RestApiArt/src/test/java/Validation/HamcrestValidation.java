package Validation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.*;

public class HamcrestValidation {

	@Test
	public void tc1()
	{
		
		RestAssured.baseURI = "http://localhost:8080/";
		RequestSpecification request = RestAssured.given();
		
		Response response = request.get("/student/1");
		
		//chaining process in java
		//hard assert but multiple assertions in one go
		response.then().body("lastName", equalTo("Harper"))
						.body("courses[0]",equalTo("Accounting"));
		
		//soft assert but multiple assertions in one go
		
		response.then().body("lastName", equalTo("Harper"),"courses[0]",equalTo("Accounting"));
		
		
		
	}

}
