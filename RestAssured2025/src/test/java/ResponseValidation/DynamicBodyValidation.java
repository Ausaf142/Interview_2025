package ResponseValidation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import java.util.List;

import org.testng.Assert;

import io.restassured.response.Response;

public class DynamicBodyValidation {
	public static void main(String[] args) {
		baseURI="http://localhost";
		port=8084;
		String exp="TY_PROJ_206";
		Response resp = when()
		.get("/projects");
		List<String> actual = resp.jsonPath().get("projectId");
		boolean match=false;
		for(String id:actual) {
			if(id.equalsIgnoreCase(exp)) {
//				System.out.println("pass");
				match=true;
			}
			
		}
		if(match)
		System.out.println("pass");
		else {
			System.out.println("fail");
		}
				
				
			
		}
	}

