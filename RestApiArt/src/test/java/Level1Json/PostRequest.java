package Level1Json;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {

	public static void main(String[] args) {

		Student std =  new Student();
		std.setEmail("abc123@gmail.com");
		std.setFirstName("D");
		std.setLastName("W");
		std.setProgramme("CS");
		
		List<String> l1 = new ArrayList();
		l1.add("Java");
		l1.add("API");
		l1.add("Python");
		
		std.setCourses(l1);
		
		RestAssured.baseURI = "http://localhost:8080/";
		RequestSpecification request = RestAssured.given();
		
		request.header("Content-Type","application/json");
		
		Response resp = request.body(std).post("/student/");
		
		System.out.println(resp.getStatusCode());
		
	}

}
