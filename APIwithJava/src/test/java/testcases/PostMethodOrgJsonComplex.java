package testcases;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostMethodOrgJsonComplex {

	public static void main(String[] args) {
		
		JSONObject inner = new JSONObject();
		inner.put("Ward No", "11");
		inner.put("House No", "21");
		inner.put("Area", "Sector 2");
		inner.put("ZipCode", "1102225");
		
		JSONObject outer = new JSONObject();
		outer.put("Name", "Rishi Ranjan");
		outer.put("College", "IIT Delhi");
		outer.put("RollNo", "1222525");
		outer.put("id", "123");
		outer.put("Address", inner);
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(outer.toString())
		.when()
		.post("http://localhost:3000/StudenInfo");
		
		System.out.println("Status Code "+res.statusCode());
		System.out.println(res.asString());
		

	}

}
