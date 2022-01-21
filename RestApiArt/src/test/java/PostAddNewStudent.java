import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostAddNewStudent {
	
	public static void main(String[] args)
	{
		RestAssured.baseURI = "http://localhost:8080";
		
		RequestSpecification request =  RestAssured.given();
		
		String payload = "		{\r\n" + 
				"    \"firstName\": \"David\",\r\n" + 
				"	\"lastName\": \"Warner\",\r\n" + 
				"	\"email\": \"David.Warner8@gmail.com\",\r\n" + 
				"    \"programme\": \"computer science\",\r\n" + 
				"    \"courses\":[\r\n" + 
				"		\"Accounting\",\r\n" + 
				"		\"Statistics\"	\r\n" + 
				"]\r\n" + 
				"}";
		
		request.header("Content-Type", "application/json");
		Response response = request.body(payload).post("/student/");
		
		System.out.println(response.getStatusCode());
		response.getBody().prettyPrint();
		//System.out.println(response.getBody().prettyPrint());
	
		//find out recently added student and its unique id
		Response resp = request.get("/student/");
		String str1 = resp.getBody().asString();
		JsonPath js = new JsonPath(str1);
		//System.out.println(js.get("[100].id"));
		
		//find out total number of students
		int totalStudents = js.get("student.size()");
		
		for(int i=0; i<totalStudents;i++)
		{
			if(js.get("["+i+"].email").equals("David.Warner8@gmail.com"))
			{
				System.out.println(js.get("["+i+"].id"));
				break;
			}
		}
	}
}
