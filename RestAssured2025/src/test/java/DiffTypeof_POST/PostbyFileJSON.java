package DiffTypeof_POST;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class PostbyFileJSON {
	@Test
public void postbyfile() {
	baseURI="http://localhost";
	port=8084;
	File file = new File("./Files/dummy.json");
	given()
	.body(file)
	.contentType(ContentType.JSON)
	.when()
	.post("/addProject")
	.then()
//	.statusCode(201)
	.log().all();
}
}
