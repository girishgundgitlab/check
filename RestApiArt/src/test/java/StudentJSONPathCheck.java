import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StudentJSONPathCheck {

	public static void main(String[] args) {
		RestAssured.baseURI = "http://localhost:8080/";
		RequestSpecification request = RestAssured.given();
		
		Response resp = request.get("student/2");
		System.out.println(resp.getStatusCode());
		
		
		JsonPath js = new JsonPath(resp.getBody().asString()); // pass the response body as String to JsonPath Object
		
		
		
		//fetch the value of id
		System.out.println(js.get("id"));
		
		//fetch the first course here
		System.out.println(js.get("courses[0]"));
		

	}

}
