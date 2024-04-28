package testcases;

import static io.restassured.RestAssured.*;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingExample1 {

	public static void main(String[] args) {
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(" http://localhost:3000/EmployeeInfo");
		
//		System.out.println(res.asString());
		
		
		JSONArray array = new JSONArray(res.asString()); //JSOnArray object
		int L= array.length();
		for (int i=0; i<L; i=i+1) {
			JSONObject ob = array.getJSONObject(i);  //JSONobject object
			System.out.println(ob.get("id")); //fetching value using get method via key
		}
		
	}

}
