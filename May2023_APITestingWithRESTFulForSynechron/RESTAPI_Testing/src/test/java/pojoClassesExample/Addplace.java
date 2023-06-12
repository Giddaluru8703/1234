package pojoClassesExample;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;

@Test
public class Addplace {
	public void addplace() throws Throwable{
		System.out.println("--------------------------------------AddPlace----------------------------------------------");
		SoftAssert st=new SoftAssert();
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
	Pojoclass1 pc = RestAssured.given().log().all().queryParam("key", "qaclick123")
		                               .header("Content-Type","application/json")
		                               .body(new String(Files.readAllBytes(Paths.get("Input.json"))))
		                             
		                   .when().post("/maps/api/place/add/json")
		                   .then().log().all().assertThat().statusCode(200)
		                   .body("status", Matchers.equalTo("OK"))
		                   .body("scope", Matchers.equalTo("APP"))
		                   .header("Server", "Apache/2.4.41 (Ubuntu)").extract().response().as(Pojoclass1.class);
	
	String place_id = pc.getPlace_id();
	String scope = pc.getScope();
	String reference = pc.getReference();
	String id = pc.getId();
	String status = pc.getStatus();
	System.out.println(scope);
	System.out.println(reference);
	System.out.println(id);
	System.out.println(status);
	System.out.println(place_id);

}
}