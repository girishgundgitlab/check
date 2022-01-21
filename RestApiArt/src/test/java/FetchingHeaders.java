import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FetchingHeaders {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification request = RestAssured.given();
		
		Response resp = request.get("api/users/2");
		System.out.println(resp.getStatusCode());
		
		//print the Headers
		System.out.println(resp.getHeaders());
		
		// print particular header value
		System.out.println(resp.getHeader("Connection"));
	}

}
