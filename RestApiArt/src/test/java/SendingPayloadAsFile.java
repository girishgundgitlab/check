import java.io.File;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SendingPayloadAsFile {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "http://localhost:8080/";
		RequestSpecification request = RestAssured.given();
		
		request.header("Content-Type","application/json");
		
		File f = new File("E:\\13Nov21\\RestApiArt\\src\\test\\java\\payload.json");
		Response resp = request.body(f).post("/student/");
		
		System.out.println(resp.getStatusCode());
		resp.getBody().prettyPrint();

	}

}
