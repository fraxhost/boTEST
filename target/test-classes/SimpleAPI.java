package runners;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;

public class SimpleAPI {

	@Before
	public static void setUp() {
		RestAssured.baseURI = "http://localhost:8800/api/v1";
	}

	@Test
	public void test_Lb3k0M4z8y1a_search() {
		String testResultId = "test_Lb3k0M4z8y1a_search";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.queryParam("market", "x")
						.queryParam("query", "ezlY")
						.queryParam("type", "S")
					.when()
						.get("/search");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			Assert.fail(ex.getMessage());
		}
	}

	@Test
	public void test_ykVEdh5TSWeq_findArtistById() {
		String testResultId = "test_ykVEdh5TSWeq_findArtistById";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.pathParam("artistId", "-1095094423")
					.when()
						.get("/artists/{artistId}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			Assert.fail(ex.getMessage());
		}
	}

	@Test
	public void test_GZNMjYO6jT1n_getArtists() {
		String testResultId = "test_GZNMjYO6jT1n_getArtists";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.queryParam("isAlive", "false")
						.queryParam("nationality", "UesT")
						.queryParam("ageUnder", "1352449474")
						.queryParam("ageOver", "-296179592")
						.queryParam("name", "joFOztWp")
						.queryParam("age", "-576968091")
					.when()
						.get("/artists");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			Assert.fail(ex.getMessage());
		}
	}

}
