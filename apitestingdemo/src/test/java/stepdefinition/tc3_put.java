package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class tc3_put {
	private static final String BASE_URL="https://jsonplaceholder.typicode.com/posts/1";
	Response response;
	RequestSpecification request;
	String output;
	private static final String REQUEST_BODY=
			"{"+
				"\"id\":1,"+
				"\"title\":\"foo\","+
				"\"body\":\"bar\","+
				"\"userId\":1"+
			"}";
	
	@Given("url for put is {string}")
	public void url(String string) {
		System.out.println("User is in the URL");
		RestAssured.baseURI=BASE_URL;
	    
	}

	@When("method PUT")
	public void method_PUT() {
		System.out.println("He sends PUT request");
		request=RestAssured.given()
				.contentType(ContentType.JSON)
				.body(REQUEST_BODY);
		response=request.put();
	   
	}

	@Then("status for put is {int}")
	public void status(Integer int1) {
		output=response.asString();
		System.out.println(output);
		System.out.println(response.getStatusCode());
	    
	}

}
