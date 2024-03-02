package testcases;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostMethodUsingPojoComplex {

	public static void main(String[] args) {
		AddressInformation address = new AddressInformation();
		address.setWardNo("11");
		address.setHouseNo("HHTNK 21");
		address.setState("Bihar");
		address.setZipCode("847556");
		
		
		BasicInformation basic = new BasicInformation();
		basic.setName("Rishi Ranjan");
		basic.setEmplyeeCode("BCE87987");
		basic.setRole("Sr. Lead");
		basic.setId("1235658");
		basic.setAddress(address);
		
		
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
