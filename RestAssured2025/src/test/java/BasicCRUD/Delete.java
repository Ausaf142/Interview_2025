package BasicCRUD;

import static org.testng.Assert.assertEquals;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;

public class Delete {
	public static void main(String[] args) {
	RequestSender req = RestAssured.when();
	Response resp = req.delete("http://localhost:8084/projects/TY_PROJ_612");
	int exp_code=204;
	int actual = resp.getStatusCode();
	assertEquals(exp_code, actual);
	System.out.println(resp.asPrettyString());
}
}