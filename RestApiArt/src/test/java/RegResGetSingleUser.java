import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RegResGetSingleUser {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification request = RestAssured.given();
		
		Response resp = request.get("api/users/2");
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getBody().prettyPrint());

	}

}
