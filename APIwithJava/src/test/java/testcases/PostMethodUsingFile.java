package testcases;

import static io.restassured.RestAssured.*;

import java.io.*;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostMethodUsingFile {

	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("../APIwithJava/RequestBody.json");
		FileReader fr = new FileReader(f);
		JSONTokener js = new JSONTokener(fr);
		JSONObject j = new JSONObject(js);
//		System.out.println(j);
		
	Response res=
	 given()
	 .contentType(ContentType.JSON)
	 .body(j.toString())
	 .when()
	 .post("http://localhost:3000/EmployeeInfo");
	
	System.out.println("Status Code is "+res.statusCode());
	System.out.println(res.asPrettyString());
	}

}
