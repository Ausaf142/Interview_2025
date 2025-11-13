package BDD_CRUDoperations;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.port;

import io.restassured.http.ContentType;

public class Delete {
	public static void main(String[] args) {
		
	
	baseURI="http://localhost";
	port=8084;
	
	
	when()
	.delete("/projects/TY_PROJ_1204")
	.then()
	.assertThat().statusCode(204)
	.log().all();
}
}
