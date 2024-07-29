package PracticeAutomation;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;

public class re {

	@Test
	public void finalimplement() {

		act[] activitiesArray = given().contentType("application/json").when()
				.get("https://fakerestapi.azurewebsites.net/api/v1/Activities").as(act[].class);

		System.out.println(activitiesArray.length);

		for (int i = 0; i <= activitiesArray.length - 1; i++) {

			int x = activitiesArray[i].getId();
			System.out.println(x);

		}

	}

}
