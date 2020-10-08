import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostPutDeleteExample {

	/*@Test
	public void test1() {
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type", "application/json");
		JSONObject json= new JSONObject();
		json.put("id", "18");
		json.put("title", "Selenium Webdriver");
		json.put("author", "JBK");
		
		request.body(json.toJSONString());
		
		Response response= request.post("https://localhost:3000/posts");
		int code = response.getStatusCode();
		Assert.assertEquals(code, 201);
	}*/
	
	@Test
	public void test2() {
		int code=RestAssured.given().auth().preemptive().basic("ToolsQA", "TestPassword").when().get("http://restapi.demoqa.com/authentication/CheckForAuthentication/").getStatusCode();
		System.out.println("Response code from server is "+code);
	}
}
