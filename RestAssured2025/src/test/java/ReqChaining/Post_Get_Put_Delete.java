package ReqChaining;

import org.testng.annotations.Test;

import Generic_Utility.Java_Utility;
import POJO.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Post_Get_Put_Delete {
@Test
public void post() {
	baseURI="http://localhost";
	port=8084;
	Java_Utility jUtility=new Java_Utility();
	int key = jUtility.number();
	ProjectLibrary plib = new ProjectLibrary("allah", "universe3"+key, "almighty", 1);
	Response resp= given()
	.body(plib)
	.contentType(ContentType.JSON)
	.when()
	.post("/addProject");
	
	String pid = resp.jsonPath().get("projectId");
	System.out.println(pid);
	
	given()
	.pathParam("PID", pid)
	.when()
	.get("/projects/{PID}")
	.then().log().all();
	
	ProjectLibrary plib1 = new ProjectLibrary("God", "universe3"+key, "almighty", 1);
	given()
	
	.pathParam("PID2", pid)
	.body(plib1)
	.contentType(ContentType.JSON)
	.when()
	.put("/projects/{PID2}")
	.then().log().all();
}
}
