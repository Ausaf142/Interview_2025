package BasicCRUD;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;

public class GetAll {
public static void main(String[] args) {
	RequestSender req = RestAssured.when();
	Response resp = req.get("http://localhost:8084/projects");
	System.out.println(resp.asPrettyString());
}
}
