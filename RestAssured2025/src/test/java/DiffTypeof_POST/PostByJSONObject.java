package DiffTypeof_POST;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostByJSONObject {
@Test
public void post() {
	JSONObject obj = new JSONObject();
	obj.put("createdBy", "Doctor");
	obj.put("projectName", "Medical1");
	obj.put("status", "intern");
	obj.put("teamSize", 1);
	
	baseURI="http://localhost";
	port=8084;
	given()
	.body(obj)
	.contentType(ContentType.JSON)
	.when()
	.post("/addProject")
	.then()
	.log().all();
}
}
