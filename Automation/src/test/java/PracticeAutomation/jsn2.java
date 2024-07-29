package PracticeAutomation;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONArray;
import org.json.JSONObject;

public class jsn2 {

	@Test
	public void takes() {

		String resposne = given().contentType("application/json").when().get("https://reqres.in/api/users?page=2")
				.then().extract().asPrettyString();

		System.out.println(resposne);

		JSONObject uiy = new JSONObject(resposne);

		JSONArray io = uiy.getJSONArray("data");

		int p = io.length();

		System.out.println(p);

		for (int i = 0; i <= p - 1; i++) {

			String yu = uiy.getJSONArray("data").getJSONObject(i).getString("email");

			System.out.println(yu);
			if (yu.equals("michael.lawson@reqres.in")) {

				System.out.println("This email id exists in teh following");

			}

		}

	}

}
