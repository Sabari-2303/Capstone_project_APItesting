package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class tc4_patch {
	
	private static final String BASE_URL="https://jsonplaceholder.typicode.com/posts/1";
	Response response;
	RequestSpecification request;
	String output;
	
	private static final String REQUEST_BODY=
			"{"+
					"\"title\":\"foofoo\""+
			"}";
	
	@Given("url for patch is {string}")
	public void url(String string) {
		 System.out.println("User is in the URL");
		 RestAssured.baseURI=BASE_URL;
	   
	}

//	@When("method PATCH")
//	public void method_PATCH() {
//		System.out.println("User sends patch request");
//		request=RestAssured.given()
//				.contentType(ContentType.JSON)
//				.body(REQUEST_BODY);
//		response=request.patch();
//	  
//	}
	@When("method PATCH")
	public void method_PATCH() {
		System.out.println("User sends patch request");
		request=RestAssured.given()
				.contentType(ContentType.JSON)
				.body(REQUEST_BODY);
		response=request.patch();
	}

	@Then("status for patch is {int}")
	public void status(Integer int1) {
		output=response.asString();
		System.out.println(output);
		System.out.println(response.getStatusCode());
	   
	}

	


}
