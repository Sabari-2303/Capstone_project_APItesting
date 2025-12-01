package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class tc1_get {
	
	             //https://api.restful-api.dev/objects
	
	private static final String BASE_URL="https://jsonplaceholder.typicode.com/posts/1";
	Response response;
	RequestSpecification request;
	String output;

	@Given("the user in the URL which get is {string}")
	public void the_user_in_the_URL_which_get_is(String string) {
		System.out.println("User is in the URL page");
	    RestAssured.baseURI=BASE_URL;
	    
	}

	@When("he sends the get request")
	public void he_sends_the_get_request() {
		System.out.println("User sends the GET request");
	    request=RestAssured.given();
	    response=request.get(BASE_URL);
	    
	}

	@Then("he gets the response as {int}")
	public void he_gets_the_response_as(Integer int1) {
		System.out.println("He gets a response of "+int1);
		output=response.asString();
		System.out.println(output);
		int statuscode=response.getStatusCode();
		System.out.println(statuscode);
		
	   
	}

	

}
