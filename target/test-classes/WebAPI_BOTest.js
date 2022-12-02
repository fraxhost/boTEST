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
	public void test_eCgQ64ndHxPl_null() {
		String testResultId = "test_eCgQ64ndHxPl_null";

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
	public void test_ESthRDFngwxp_null() {
		String testResultId = "test_ESthRDFngwxp_null";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.contentType(ContentType.JSON)
						.body("{\"id\": -1781752858,\"name\": \"khzKmD\"}")
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
	public void test_KoPIfnbT4kfk_null() {
		String testResultId = "test_KoPIfnbT4kfk_null";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.contentType(ContentType.JSON)
						.body("{\"id\": -1102832787,\"name\": \"\"}")
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
	public void test_WhfJ2xuy4Dya_null() {
		String testResultId = "test_WhfJ2xuy4Dya_null";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.pathParam("id", "-884859085")
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
	public void test_MmQgI5XTCVJv_null() {
		String testResultId = "test_MmQgI5XTCVJv_null";

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
	public void test_MquBVX0Wo9X6_null() {
		String testResultId = "test_MquBVX0Wo9X6_null";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.pathParam("id", "931535467")
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
	public void test_m2z1aEfzqygg_null() {
		String testResultId = "test_m2z1aEfzqygg_null";

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
	public void test_1Qf0Pm4CZ46i_null() {
		String testResultId = "test_1Qf0Pm4CZ46i_null";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.contentType(ContentType.JSON)
						.body("{\"id\": -867299579,\"url\": \"ONXu\"}")
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
	public void test_7x4FGchSG8WJ_null() {
		String testResultId = "test_7x4FGchSG8WJ_null";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.contentType(ContentType.JSON)
						.body("{\"id\": -712893913,\"url\": \"wpKjplzBrn\"}")
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
	public void test_j9y78WhiGtyH_null() {
		String testResultId = "test_j9y78WhiGtyH_null";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.pathParam("id", "167780341")
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
