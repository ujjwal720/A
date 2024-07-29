package PracticeAutomation;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.testng.annotations.Test;

public class cookies {
	
	
	@Test
	public void getcokkie() {
		
		
		Map<String,String> iz=given().when().get("https://www.google.com/").then().extract().cookies();
		
		System.out.println(iz);
		
		
	}

}
