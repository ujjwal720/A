package PracticeAutomation;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.response.Response;

public class firstPrac {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		
		
		serilization values=new serilization();
		values.setName("Ujjwal");
		values.setJob("IT Sector london");
		
	Response rscode=given().body(values).when().post("https://reqres.in/api/users")
		.then().extract().response();
	
	System.out.println(rscode.getStatusCode());
		
		
		
		
		
		
		

	}

}
