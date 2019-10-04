package RestAssuredTestCases;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Testcase1_Get_Request 
{
    @Test
	public void getweatherDetails()
   {
	   given()
	   .when()
	       .get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")    //request section//when contains the get request
	   .then()
	   .statusCode(200)
	   .statusLine("HTTP/1.1 200 OK")
	   .assertThat().body("City", equalTo("Hyderabad"))    //validation
	   .header("Content-Type","application/json");
   }
}
