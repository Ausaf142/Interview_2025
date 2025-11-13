package Parameter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class FormPara {
@Test
public void form() {
	baseURI="http;//localhost";
	port=8084;
	given()
	.formParam("createdBy", "obi")
	.formParam("projectName", "babu")
	.formParam("status", "mc")
	.formParam("teamSize", 1)
	.when()
	.post("/addProject")
	.then().log().all();
}
}
