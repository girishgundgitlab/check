package Level2Json;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {

	public static void main(String[] args) {
		Student std = new Student();
		
		std.setEmail("D.W2@gmail.com");
		std.setFirstName("D");
		std.setLastName("W1");
		std.setProgramme("CS");
		
		ScoreCard sc1 = new ScoreCard();
		sc1.setName("Java");
		sc1.setScore("32");
		
		ScoreCard sc2 = new ScoreCard();
		sc2.setName("Api");
		sc2.setScore("47");
		
		List<ScoreCard> l1= new ArrayList();
		l1.add(sc1);
		l1.add(sc2);
		
		std.setCourses(l1);
		
		RestAssured.baseURI = "http://localhost:8080/";
		RequestSpecification request = RestAssured.given();
		request.log().all();
		
		request.header("Content-Type","application/json");
		
		Response resp = request.body(std).post("/student/");
		System.out.println(resp.getStatusCode());
		

	}

}
