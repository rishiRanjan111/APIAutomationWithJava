package testcases;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostMethodUsingPojoArray {

	public static void main(String[] args) {
		AddressInformationArray[] address = new AddressInformationArray[2];
		
		address[0] = new AddressInformationArray();
		address[0].setWardNo("11");
		address[0].setHouseNo("HHTNK 21");
		address[0].setState("Bihar");
		address[0].setZipCode("847556");
		
		address[1] = new AddressInformationArray();
		address[1].setWardNo("Sector 1");
		address[1].setHouseNo("Houseui21");
		address[1].setState("Delhi");
		address[1].setZipCode("1100025");
		
		
		BasicInformationUsingArrayAddress basic =new  BasicInformationUsingArrayAddress();
		basic.setName("Rishi Ranjan");
		basic.setEmplyeeCode("BCE87987");
		basic.setRole("Sr. Lead");
		basic.setId("12356565");
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
