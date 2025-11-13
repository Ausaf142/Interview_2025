package BasicCRUD;

import org.testng.reporters.jq.Main;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;

public class GetSingle {
public static void main(String[] args) {
	RequestSender req = RestAssured.when();
	Response resp = req.get("http://localhost:8084/projects/TY_PROJ_1002");
	System.out.println(resp.asPrettyString());
}

}
