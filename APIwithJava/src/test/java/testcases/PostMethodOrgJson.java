package testcases;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostMethodOrgJson {

	public static void main(String[] args) {
		JSONObject js = new JSONObject();
		js.put("First Name","Rishi");
		js.put("Last Name","Ranjan");
		js.put("Role", "PSE");
		js.put("id", "12323");
		
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(js.toString())
		.when()
		.post("http://localhost:3000/StudenInfo");
		
		System.out.println("Status Code is : "+res.statusCode());
		System.out.println("Response Data: "+res.asPrettyString());
		
	}

}
