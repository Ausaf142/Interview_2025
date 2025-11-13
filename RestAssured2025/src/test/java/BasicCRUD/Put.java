package BasicCRUD;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put {
public static void main(String[] args) {
	RequestSpecification req = RestAssured.given();
	JSONObject jobj = new JSONObject();
	jobj.put("createdBy", "Sufiya");
	jobj.put("projectName", "Wife");
	jobj.put("status", "khan");
	jobj.put("teamSize", 1);
	
	req.body(jobj);
	req.contentType(ContentType.JSON);
	Response resp = req.put("http://localhost:8084/projects/TY_PROJ_1002");
	resp.then().assertThat().statusCode(200);
	System.out.println(resp.asPrettyString());
	
}
}
