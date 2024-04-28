package testcases;

import static io.restassured.RestAssured.*;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingExample2 {
	
	public static void main(String[] args) {
	Response res =	given() .contentType(ContentType.JSON) .when() .get(" http://localhost:3000/EmployeeInfo");
	
	
	JSONArray array = new JSONArray(res.asString());
	int L = array.length();
	for (int i=0; i<L; i=i+1) {
		JSONObject ob = array.getJSONObject(i);
		Set<String> allkeys = ob.keySet();
		for(String s: allkeys) {
			System.out.println("Keys name is "+s);
			System.out.println("Value name key "+ob.get(s));
		}
	}
	
	}

}
