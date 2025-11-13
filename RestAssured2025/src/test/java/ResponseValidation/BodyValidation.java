package ResponseValidation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.testng.Assert;

import io.restassured.response.Response;

public class BodyValidation {
public static void main(String[] args) {
	baseURI="http://localhost";
	port=8084;
	String exp="TY_PROJ_1202";
	Response resp = when()
	.get("/projects");
	String actual = resp.jsonPath().get("[0].projectId");
	Assert.assertEquals(actual, exp);
	System.out.println("Pass");
}
}
