package generation;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

public class BotestWebApi {

	@Before
	public void setUp() {
		RestAssured.baseURI = "http://localhost:5096/";
	}

	@Test
	public void test_eHkqkPOoymx8_GetWeatherForecast_GetOk() {
		String testResultId = "test_eHkqkPOoymx8_GetWeatherForecast/GetOk";

		try {
			Response response = RestAssured
					.given()
						.log().all()
					.when()
						.get("/api/WeatherForecast/GetOk");

			response.then().log().all();
			assertTrue("Status Code is less than 500", response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			Assert.fail(ex.getMessage());
		}
	}

	@Test
	public void test_TDl44n1H4lGi_GetWeatherForecast_GetNotFound() {
		String testResultId = "test_TDl44n1H4lGi_GetWeatherForecast/GetNotFound";

		try {
			Response response = RestAssured
					.given()
						.log().all()
					.when()
						.get("/api/WeatherForecast/GetNotFound");

			response.then().log().all();
			assertTrue("Status Code is less than 500", response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			Assert.fail(ex.getMessage());
		}
	}

	@Test
	public void test_prvyGcTULDYO_GetWeatherForecast_GetError() {
		String testResultId = "test_prvyGcTULDYO_GetWeatherForecast/GetError";

		try {
			Response response = RestAssured
					.given()
						.log().all()
					.when()
						.get("/api/WeatherForecast/GetError");

			response.then().log().all();
			assertTrue("Status Code is less than 500", response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			Assert.fail(ex.getMessage());
		}
	}

	@Test
	public void test_4xmeYKYK6mIJ_GetWeatherWithCityId() {
		String testResultId = "test_4xmeYKYK6mIJ_GetWeatherWithCityId";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.pathParam("cityId", "-541409638")
					.when()
						.get("/api/WeatherForecast/GetWeatherWithCityId/{cityId}");

			response.then().log().all();
			assertTrue("Status Code is less than 500", response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			Assert.fail(ex.getMessage());
		}
	}

	@Test
	public void test_Mv4lzTy6XY9Q_GetWeatherWithCityName() {
		String testResultId = "test_Mv4lzTy6XY9Q_GetWeatherWithCityName";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.pathParam("cityName", "")
					.when()
						.get("/api/WeatherForecast/GetWeatherWithCityName/{cityName}");

			response.then().log().all();
			assertTrue("Status Code is less than 500", response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			Assert.fail(ex.getMessage());
		}
	}

	@Test
	public void test_7TJ418xPlOt6_GetWeatherWithCityStatus() {
		String testResultId = "test_7TJ418xPlOt6_GetWeatherWithCityStatus";

		try {
			Response response = RestAssured
					.given()
						.log().all()
						.pathParam("cityStatus", "true")
					.when()
						.get("/api/WeatherForecast/GetWeatherWithCityStatus/{cityStatus}");

			response.then().log().all();
			assertTrue("Status Code is less than 500", response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			Assert.fail(ex.getMessage());
		}
	}

}
