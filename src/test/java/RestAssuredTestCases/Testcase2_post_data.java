package RestAssuredTestCases;

import java.util.HashMap;
import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;

public class Testcase2_post_data 
{
   
	public static HashMap map=new HashMap();
	
	@BeforeClass
   public void postdata()
   {
	   map.put("FirstName", RestUtilies.getFirstName());
	   map.put("LastName", RestUtilies.getLasttName());
	   map.put("UserName", RestUtilies.getUserName());
	   map.put("Password", RestUtilies.getPassword());
	   map.put("Email", RestUtilies.getEmail());
	   
	   RestAssured.baseURI="http://restapi.demoqa.com/customer";
	   RestAssured.basePath="/register";
   }
	public void postdata()
	{
		given()
		.when()
		{
			
		}
		.then()
		{
			
		}
	}
	
	
}
