import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FirstRestAssuredProgram {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://reqres.in/";  // whats the baseURI which is going to be used
		RequestSpecification request = RestAssured.given(); // start building the request on top of baseURI
		
		Response resp = request.get("api/users?page=2"); // request to be fired alongwith resources and path parameter
		System.out.println(resp.statusCode()); // to check the response code
//		System.out.println(resp.getBody().asString()
		System.out.println(resp.getBody().prettyPrint()); // print the response in good format
		
		
		
	}

}
