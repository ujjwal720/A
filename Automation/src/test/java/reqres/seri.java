package reqres;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class seri {

	@Test(dataProvider="getdata")
	public void test1(String name,String job) {

		serilizationa a = new serilizationa();
		a.setName("it");
		a.setJob("it department");

		given().body(a).post("https://reqres.in/api/users").then().log().all();

	}
	
	/*
	 * dataprovider is basically it is ytanfering teh data un our eclipse that we are using this.
	 */

	
	@DataProvider
	public Object[][] getdata() {

		Object[][] a = { { "Rahul", "Automation" }, { "Raming", "Patel" }, { "Console", "patel" } };

		return a;

	}

}
