package BasicCRUD;

import org.json.simple.JSONObject;

import Generic_Utility.Java_Utility;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post {
public static void main(String[] args) {
	Java_Utility rn = new Java_Utility();
	int key = rn.number();
	JSONObject jobj =  new JSONObject();
	jobj.put("createdBy", "AUsaf");
	jobj.put("projectName", "shahen"+key+"");
	jobj.put("status", "khan");
	jobj.put("teamSize", 1);
	
	RequestSpecification req = RestAssured.given();
	req.body(jobj);
	req.contentType(ContentType.JSON);
	Response resp = req.post("http://localhost:8084/addProject");
	System.out.println(resp.asPrettyString());
	
	
	
}
}
