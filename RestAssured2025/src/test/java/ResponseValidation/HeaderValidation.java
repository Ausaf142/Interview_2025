package ResponseValidation;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class HeaderValidation {
public static void main(String[] args) {
	baseURI="http://localhost";
	port=8084;
	when()
	.get("/projects")
	.then()
	.assertThat().statusCode(200)
	.assertThat().contentType(ContentType.JSON)
	.log().all();
}
}
