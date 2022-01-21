import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FetchinValueFromResponseUsingJSONPath {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification request = RestAssured.given();
		
		Response resp = request.get("api/users/2");
		System.out.println(resp.getStatusCode());
		
		// print the response in pretty decorated format
//		System.out.println(resp.getBody().prettyPrint());
		
		String str = resp.getBody().asString();
		
		// JSONPath -- class used to parse the response 
		JsonPath js = new JsonPath(str);
		
		//access the response objects
		System.out.println(js.get("data"));
		System.out.println(js.get("support"));
		
		//access the fields within objects
		System.out.println(js.get("data.id"));
		System.out.println(js.get("data.avatar"));
		
		System.out.println(js.get("support.url"));
		
		
		
	}

}
