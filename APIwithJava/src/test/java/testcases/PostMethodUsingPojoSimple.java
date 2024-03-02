package testcases;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostMethodUsingPojoSimple {

	public static void main(String[] args) {
		
		
		
		BasicInformation basic = new BasicInformation();
		basic.setName("Rishi Ranjan");
		basic.setEmplyeeCode("BCE87987");
		basic.setRole("Sr. Lead");
		basic.setId("1235658");
		
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(basic)
		.when()
		.post("http://localhost:3000/EmployeeInfo");
		System.out.println("Status Code "+res.statusCode());
		System.out.println(res.asString());
		

	}

}
