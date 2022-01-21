import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostUsingJsonObject {

	public static void main(String[] args) {

		RestAssured.baseURI = "http://localhost:8080/";
		RequestSpecification request = RestAssured.given();
		
		//printing the log helps to print all the things
		request.log().all();
		
		request.header("Content-Type","application/json");
		JSONObject js = new JSONObject();
		
		js.put("firstName", "David");
		js.put("lastName", "Warner");
		js.put("email", "David.Warner12@gmail.com");
		js.put("programme", "computer science");
		
		JSONArray jArray = new JSONArray();
		jArray.put("Accounting");
		jArray.put("Statistics");
		
		js.put("courses", jArray);
		
		Response resp = request.body(js.toString()).post("/student/");
		System.out.println(resp.getStatusCode());
		
		
	}

}
