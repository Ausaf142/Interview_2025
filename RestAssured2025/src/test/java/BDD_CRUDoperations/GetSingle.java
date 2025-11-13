package BDD_CRUDoperations;

import static io.restassured.RestAssured.*;

public class GetSingle {
	public static void main(String[] args) {
		baseURI="http://localhost";
		port=8084;
		when()
		.get("/projects/TY_PROJ_1203")
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}

}
