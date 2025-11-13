package Parameter;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.*;

public class PathPara {
	public static void main(String[] args) {
		baseURI="http://localhost";
		port=8084;
		
		given()
		.pathParam("pid", "TY_PROJ_1202")
		.when()
		.get("/projects/{pid}")
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}
}
