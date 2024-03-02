package testcases;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostMethodOrgSimple {

	public static void main(String[] args) {
		JSONObject js = new JSONObject();
		js.put("First Name", "Rishi");
		js.put("Last Name", "Ranjan");
		js.put("EmployeeID","BC23232h");
		js.put("Role", "SE");
		js.put("id", "2");
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(js.toString())
		.when()
		.post("http://localhost:3000/EmployeeInfo");
		
		System.out.println("Status Code is :"+res.statusCode());
		System.out.println("Json Data is :");
		System.out.println(res.asString());

	}

}
