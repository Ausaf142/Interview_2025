package BDD_CRUDoperations;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

public class Put {
	public static void main(String[] args) {
		JSONObject obj = new JSONObject();
		obj.put("createdBy", "Doctor");
		obj.put("projectId", "Medical");
		obj.put("status", "intern");
		obj.put("teamSize", 2);
		
		
		baseURI="http://localhost";
		port=8084;
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		.when()
		.put("/projects/TY_PROJ_1203")
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}
}
