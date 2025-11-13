package BDD_CRUDoperations;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

public class GetAll {
	public static void main(String[] args) {
		baseURI="http://localhost";
		port=8084;
		when()
		.get("/projects")
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}

}
