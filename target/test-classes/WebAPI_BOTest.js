package generation;
import io.restassured.response.Response;
import io.restassured.http.ContentType;
import io.restassured.RestAssured;
import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

public class WebAPIBOTest {

	@Before
	public void setUp() {
		RestAssured.baseURI = "https://localhost:7166";
	}

	@Test
	public void test_yZxEv4y8bRsA_null() {
		String testResultId = "test_yZxEv4y8bRsA_null";

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
	public void test_DvIi3gL3ru2c_null() {
		String testResultId = "test_DvIi3gL3ru2c_null";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.contentType(ContentType.JSON)
						.body("{{name:\"\", id:297799253}}")
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
	public void test_cz2wT2PWZPb6_null() {
		String testResultId = "test_cz2wT2PWZPb6_null";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.contentType(ContentType.JSON)
						.body("{{name:\"Ukq\", id:-1161425779}}")
					.when()
						.put("/api/Category");

			response.then().log().all();
			assertTrue("Status Code is less than 500", response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			Assert.fail(ex.getMessage());
		}
	}

	@Test
	public void test_rUoq5WKCIJCM_null() {
		String testResultId = "test_rUoq5WKCIJCM_null";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.pathParam("id", "-1908237388")
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
	public void test_LnkBtYqBQIk8_null() {
		String testResultId = "test_LnkBtYqBQIk8_null";

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
	public void test_g9C3klAUYpAi_null() {
		String testResultId = "test_g9C3klAUYpAi_null";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.pathParam("id", "-1245706047")
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

	@Test
	public void test_B2z8KxoTpbxx_null() {
		String testResultId = "test_B2z8KxoTpbxx_null";

		try {
			Response response = RestAssured
					.given()
						.log().all()
					.when()
						.get("/api/PhotoUrl");

			response.then().log().all();
			assertTrue("Status Code is less than 500", response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			Assert.fail(ex.getMessage());
		}
	}

	@Test
	public void test_LXRJXXSL9Yh9_null() {
		String testResultId = "test_LXRJXXSL9Yh9_null";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.contentType(ContentType.JSON)
						.body("{{id:-72577792, url:\"\"}}")
					.when()
						.post("/api/PhotoUrl");

			response.then().log().all();
			assertTrue("Status Code is less than 500", response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			Assert.fail(ex.getMessage());
		}
	}

	@Test
	public void test_4N57tnQFAodq_null() {
		String testResultId = "test_4N57tnQFAodq_null";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.contentType(ContentType.JSON)
						.body("{{id:-1763009620, url:\"omhkOaK\"}}")
					.when()
						.put("/api/PhotoUrl");

			response.then().log().all();
			assertTrue("Status Code is less than 500", response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			Assert.fail(ex.getMessage());
		}
	}

	@Test
	public void test_SaVmeALjFwkP_null() {
		String testResultId = "test_SaVmeALjFwkP_null";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.pathParam("id", "-1119581474")
					.when()
						.get("/api/PhotoUrl/{id}");

			response.then().log().all();
			assertTrue("Status Code is less than 500", response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			Assert.fail(ex.getMessage());
		}
	}

}
