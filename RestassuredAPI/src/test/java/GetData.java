import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GetData {

	@Test
	public void testResponseCode() {
		Response response=	RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02");
	
		int code =response.getStatusCode();
		System.out.println("The Status code is = " +code);
		
		Assert.assertEquals(code, 200);
	}
	
	@Test
	public void testbody() {
		Response response=	RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02");
		String data=response.asString();
		System.out.println("Data is " +data);
		System.out.println("Response time = " +response.getTime());
	}
}
