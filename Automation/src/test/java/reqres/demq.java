package reqres;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class demq {

	@Test
	public void milton() {

		practiceone iu = given().when().get("https://reqres.in/api/users?page=2").as(practiceone.class);

		demosa u = iu.getData().get(0);
		
		System.out.println(u.getEmail());

	}

}
