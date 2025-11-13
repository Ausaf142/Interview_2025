package DiffTypeof_POST;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import POJO.ProjectLibrary;
import io.restassured.http.ContentType;

public class PostByLIBRARY {
public static void main(String[] args) {
	ProjectLibrary pl = new ProjectLibrary("ameria", "iffel_Tower", "dead", 2);
	
	baseURI="http://localhost";
	port=8084;
	given()
	.body(pl)
	.contentType(ContentType.JSON)
	.when()
	.post("/addProject")
	.then()
	.log().all();
}
}
