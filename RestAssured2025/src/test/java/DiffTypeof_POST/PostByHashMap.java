package DiffTypeof_POST;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.apache.commons.collections4.map.HashedMap;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostByHashMap {
	@Test
	public void post() {
		HashedMap hp = new HashedMap();
		hp.put("createdBy", "God");
		hp.put("projectName", "human");
		hp.put("status", "Active");
		hp.put("teamSize", 1000);
		
		baseURI="http://localhost";
		port=8084;
		given()
		.body(hp)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.log().all();
	}
}
