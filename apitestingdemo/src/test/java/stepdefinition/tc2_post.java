package stepdefinition;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class tc2_post {
	private static final String BASE_URL="https://jsonplaceholder.typicode.com/posts";
	Response response;
	RequestSpecification request;
	String output;
	private static final String REQUEST_BODY = 
	        "{"+
	        		"\"title\":\"foo\","+
	        		"\"body\":\"bar\","+
	        		"\"userId\":1"+
	        "}";
	        	
	
	@Given("url is {string}")
	public void url_is(String string) {
		System.out.println("User enters URL");
	    RestAssured.baseURI=BASE_URL;
	    request=RestAssured.given()
	    		.contentType(ContentType.JSON)
	    		.body(REQUEST_BODY);
	}

	@When("method POST")
	public void method_POST() {
		System.out.println("User sends POST request");
		response=request.post();
	}

	@Then("status is {int}")
	public void status_is(Integer int1) {
		System.out.println("He gets a response of "+int1);
		output=response.asString();
		System.out.println(output);
		int statuscode=response.getStatusCode();
		System.out.println(statuscode);
		
	   
	}


}

