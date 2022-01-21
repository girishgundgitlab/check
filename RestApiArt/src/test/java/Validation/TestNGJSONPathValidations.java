package Validation;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestNGJSONPathValidations {
	
	@Test
	public void tc1()
	{
		
		RestAssured.baseURI = "http://localhost:8080/";
		RequestSpecification request = RestAssured.given();
		
		Response response = request.get("/student/1");
		
		System.out.println(response.getStatusCode());
		response.getBody().prettyPrint();
		
		String str = response.getBody().asString();
		
		JsonPath js = new JsonPath(str);
		
		String expectedValue= "Harper";
		String ActualValue = js.get("lastName");
		
		Assert.assertEquals(expectedValue, ActualValue);
		
		String expectedValue1= "Accounting";
		String ActualValue1 = js.get("courses[0]");
		
		Assert.assertEquals(expectedValue1, ActualValue1);
		
		
		
	}

}
