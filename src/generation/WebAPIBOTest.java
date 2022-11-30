package generation;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

public class WebAPIBOTest {

	@Before
	public void setUp() {
		RestAssured.baseURI = "http://localhost:5166";
	}

	@Test
	public void test_YotMthxeZcjL_null() {
		String testResultId = "test_YotMthxeZcjL_null";

		try {
			Response response = RestAssured
					.given()
						.log().all()
					.when()
						.get("/api/Category");

			response.then().log().all();
			assertTrue("Status Code is less than 500", response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			Assert.fail(ex.getMessage());
		}
	}

	@Test
	public void test_UgQlqXGe160u_null() {
		String testResultId = "test_UgQlqXGe160u_null";

		try {
			Response response = RestAssured
					.given()
						.log().all()
					.when()
						.post("/api/Category");

			response.then().log().all();
			assertTrue("Status Code is less than 500", response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			Assert.fail(ex.getMessage());
		}
	}

	@Test
	public void test_NewyEnzVUVSf_null() {
		String testResultId = "test_NewyEnzVUVSf_null";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.pathParam("id", "451841428")
					.when()
						.get("/api/Category/{id}");

			response.then().log().all();
			assertTrue("Status Code is less than 500", response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			Assert.fail(ex.getMessage());
		}
	}

	@Test
	public void test_UFm5nZFO2k1z_null() {
		String testResultId = "test_UFm5nZFO2k1z_null";

		try {
			Response response = RestAssured
					.given()
						.log().all()
					.when()
						.get("/api/Pet");

			response.then().log().all();
			assertTrue("Status Code is less than 500", response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			Assert.fail(ex.getMessage());
		}
	}

	@Test
	public void test_SahsKWWg4e0z_null() {
		String testResultId = "test_SahsKWWg4e0z_null";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.pathParam("id", "891554253")
					.when()
						.get("/api/Pet/{id}");

			response.then().log().all();
			assertTrue("Status Code is less than 500", response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			Assert.fail(ex.getMessage());
		}
	}

}
