package runners;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;

public class SimpleAPI {

	@Before
	public void setUp() {
		RestAssured.baseURI = "http://localhost:8800/api/v1";
	}

	@Test
	public void test_wH9cOlFqqaBk_search() {
		String testResultId = "test_wH9cOlFqqaBk_search";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.queryParam("market", "StwQjUNxb")
						.queryParam("query", "")
						.queryParam("type", "wJ")
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
	public void test_ZBfvl9KORcfb_findArtistById() {
		String testResultId = "test_ZBfvl9KORcfb_findArtistById";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.pathParam("artistId", "1465432600")
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
	public void test_aC4GtD0UAILC_getArtists() {
		String testResultId = "test_aC4GtD0UAILC_getArtists";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.queryParam("isAlive", "true")
						.queryParam("nationality", "CeBCPLWRz")
						.queryParam("ageUnder", "-2093465843")
						.queryParam("ageOver", "-614581097")
						.queryParam("name", "LJpPjODFxZ")
						.queryParam("age", "-279041165")
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
