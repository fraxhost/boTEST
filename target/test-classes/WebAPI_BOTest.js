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
	public void test_DKiwSPL7wH44_null() {
		String testResultId = "test_DKiwSPL7wH44_null";

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
	public void test_ZhZWzWyuYB1Q_null() {
		String testResultId = "test_ZhZWzWyuYB1Q_null";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.contentType(ContentType.JSON)
						.body("{\"id\": 661261449,\"name\": \"KVxExEJr\"}")
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
	public void test_l5EJAHfqBeDT_null() {
		String testResultId = "test_l5EJAHfqBeDT_null";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.contentType(ContentType.JSON)
						.body("{\"id\": 526392807,\"name\": \"tEys\"}")
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
	public void test_NpEADwS0xGzY_null() {
		String testResultId = "test_NpEADwS0xGzY_null";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.pathParam("id", "1849990506")
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
	public void test_jSq3hCcGFSyE_null() {
		String testResultId = "test_jSq3hCcGFSyE_null";

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
	public void test_lLRIJa6okn7f_null() {
		String testResultId = "test_lLRIJa6okn7f_null";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.pathParam("id", "-2046386258")
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
	public void test_Nw6AWtA29u7L_null() {
		String testResultId = "test_Nw6AWtA29u7L_null";

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
	public void test_fKgU0Ad23u4n_null() {
		String testResultId = "test_fKgU0Ad23u4n_null";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.contentType(ContentType.JSON)
						.body("{\"id\": 1609177533,\"url\": \"F\"}")
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
	public void test_kx7nz98ijkXi_null() {
		String testResultId = "test_kx7nz98ijkXi_null";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.contentType(ContentType.JSON)
						.body("{\"id\": 1216744847,\"url\": \"hJo\"}")
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
	public void test_tjK3IkewkDju_null() {
		String testResultId = "test_tjK3IkewkDju_null";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.pathParam("id", "-748679225")
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
