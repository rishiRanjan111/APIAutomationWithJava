package testcases;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostMethodOrgJsonArray {

	public static void main(String[] args) {
		
		JSONObject inner1 = new JSONObject();
		inner1.put("Ward No", "11");
		inner1.put("Type", "Primary");
		inner1.put("State", "Bihar");
		inner1.put("ZipCode", "1102225");
		
		JSONObject inner2 = new JSONObject();
		inner2.put("Ward No", "11");
		inner2.put("Type", "Secondary");
		inner2.put("State", "Delhi");
		inner2.put("ZipCode", "11000025");
		
		JSONArray array = new JSONArray();
		array.put(0, inner1);
		array.put(1, inner2);
		
		JSONObject outer = new JSONObject();
		outer.put("Name", "Rishi Ranjan");
		outer.put("College", "IIT Delhi");
		outer.put("RollNo", "1222525");
		outer.put("id", "245");
		outer.put("Address", array);
		
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
