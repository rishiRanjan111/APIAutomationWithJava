package testcases;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingExample3 {

	public static void main(String[] args) {
		Response res =	given() .contentType(ContentType.JSON) .when() .get(" http://localhost:3000/EmployeeInfo");
		
		String s = res.jsonPath().get("[6].address[0].addressType");
		System.out.println(s);
	}

}
