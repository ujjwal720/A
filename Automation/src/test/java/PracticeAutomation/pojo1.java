package PracticeAutomation;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class pojo1 {

	
	
	@Test
	public void postrequest() {

		JSONObject ui = new JSONObject();
		ui.put("name", "ujjwal");
		ui.put("job", "leader");

		JSONArray uiy = new JSONArray();

		uiy.put(ui);

		String uim = given().body(uiy).post("https://reqres.in/api/users").then().extract().asPrettyString();

		System.out.println(uim);

	}

}
