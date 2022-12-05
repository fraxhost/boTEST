package generation;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

public class SwaggerPetstore {

	@Before
	public void setUp() {
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
	}

	@Test
	public void test_rkQCRnnzsFGh_addPet() {
		String testResultId = "test_rkQCRnnzsFGh_addPet";

		try {
			Response response = RestAssured
					.given()
						.log().all()
					.when()
						.post("/pet");

			response.then().log().all();
			assertTrue("Status Code is less than 500", response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			Assert.fail(ex.getMessage());
		}
	}

	@Test
	public void test_ebBXAbbCpv9b_updatePet() {
		String testResultId = "test_ebBXAbbCpv9b_updatePet";

		try {
			Response response = RestAssured
					.given()
						.log().all()
					.when()
						.put("/pet");

			response.then().log().all();
			assertTrue("Status Code is less than 500", response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			Assert.fail(ex.getMessage());
		}
	}

	@Test
	public void test_G5p2NC3gBKTV_findPetsByStatus() {
		String testResultId = "test_G5p2NC3gBKTV_findPetsByStatus";

		try {
			Response response = RestAssured
					.given()
						.log().all()
					.when()
						.get("/pet/findByStatus");

			response.then().log().all();
			assertTrue("Status Code is less than 500", response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			Assert.fail(ex.getMessage());
		}
	}

}
