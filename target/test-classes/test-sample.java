package writers;

import org.junit.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.FixMethodOrder;
import static org.junit.Assert.fail;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.junit.Assert.assertTrue;
import org.junit.runners.MethodSorters;
import io.qameta.allure.restassured.AllureRestAssured;
import es.us.isa.restest.testcases.restassured.filters.StatusCode5XXFilter;
import es.us.isa.restest.testcases.restassured.filters.NominalOrFaultyTestCaseFilter;
import es.us.isa.restest.testcases.restassured.filters.StatefulFilter;
import java.io.File;
import es.us.isa.restest.testcases.restassured.filters.ResponseValidationFilter;
import es.us.isa.restest.testcases.restassured.filters.CSVFilter;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RestcountriesTest_1660799989095 {

	private static final String OAI_JSON_URL = "src/test/resources/Restcountries/openapi.yaml";
	private static final StatusCode5XXFilter statusCode5XXFilter = new StatusCode5XXFilter();
	private static final NominalOrFaultyTestCaseFilter nominalOrFaultyTestCaseFilter = new NominalOrFaultyTestCaseFilter();
	private static final ResponseValidationFilter validationFilter = new ResponseValidationFilter(OAI_JSON_URL);
	private static final AllureRestAssured allureFilter = new AllureRestAssured();
	private static final String APIName = "restcountries";
	private static final String testId = "1660799989095";
	private static final CSVFilter csvFilter = new CSVFilter(APIName, testId);

	@BeforeClass
	public static void setUp() {
		RestAssured.baseURI = "https://restcountries.com";

		statusCode5XXFilter.setAPIName(APIName);
		statusCode5XXFilter.setTestId(testId);
		nominalOrFaultyTestCaseFilter.setAPIName(APIName);
		nominalOrFaultyTestCaseFilter.setTestId(testId);
		validationFilter.setAPIName(APIName);
		validationFilter.setTestId(testId);
	}

	@Test
	public void test_t4knrcbvwt2w_v2All() {
		String testResultId = "test_t4knrcbvwt2w_v2All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "demonym")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jyg19li4hpwl_v2All() {
		String testResultId = "test_1jyg19li4hpwl_v2All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_tog5i6on7pdi_v2Alphacode() {
		String testResultId = "test_tog5i6on7pdi_v2Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value NOP");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value NOP");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("alphacode", "NOP")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_trz41dnug7za_v2Alphacode() {
		String testResultId = "test_trz41dnug7za_v2Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("alphacode", "BES")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s4uoazn9k3fo_v2Alphacodes() {
		String testResultId = "test_s4uoazn9k3fo_v2Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "latlng,area")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_tocveudgsyet_v2Alphacodes() {
		String testResultId = "test_tocveudgsyet_v2Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("codes", "LK,GRD,URY")
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_to4l92ejqkac_v2Currency() {
		String testResultId = "test_to4l92ejqkac_v2Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value YZA");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value YZA");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "numericCode,topLevelDomain")
				.pathParam("currency", "YZA")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sl0m87og7hph_v2Currency() {
		String testResultId = "test_sl0m87og7hph_v2Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "latlng,translations")
				.pathParam("currency", "USS")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vey4l56nomcw_v2Name() {
		String testResultId = "test_vey4l56nomcw_v2Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Changed value of boolean parameter fullText from 'true' to integer '9192'");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Changed value of boolean parameter fullText from 'true' to integer '9192'");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("fullText", "9192")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "alpha2Code,capital")
				.pathParam("name", "Germany")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hrawpj2ibqd2_v2Name() {
		String testResultId = "test_1hrawpj2ibqd2_v2Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("fullText", "true")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "translations")
				.pathParam("name", "Norfolk Island")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jig39bh2777a_v2Callingcode() {
		String testResultId = "test_1jig39bh2777a_v2Callingcode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter callingcode with invalid value 210");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter callingcode with invalid value 210");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("callingcode", "210")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7o5ci83pdgj_v2Callingcode() {
		String testResultId = "test_1h7o5ci83pdgj_v2Callingcode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("callingcode", "255")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sokmkaxzg20p_v2Capital() {
		String testResultId = "test_sokmkaxzg20p_v2Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Lyon");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Lyon");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("capital", "Lyon")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qdychn4sy81h_v2Capital() {
		String testResultId = "test_qdychn4sy81h_v2Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "alpha3Code")
				.pathParam("capital", "Willemstad")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u7xd8stji52t_v2Region() {
		String testResultId = "test_u7xd8stji52t_v2Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Atlantis");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Atlantis");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "latlng,demonym,languages")
				.pathParam("region", "Atlantis")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/continent/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s1bo7rio3038_v2Region() {
		String testResultId = "test_s1bo7rio3038_v2Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "topLevelDomain,alpha2Code,altSpellings,gini,area")
				.pathParam("region", "Africa")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/continent/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_soknt0mzyvy0_v2Lang() {
		String testResultId = "test_soknt0mzyvy0_v2Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value su");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value su");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("lang", "su")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ji4fihl1f31x_v2Lang() {
		String testResultId = "test_1ji4fihl1f31x_v2Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("lang", "ny")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jyd8bsc7qeea_v2Regionalbloc() {
		String testResultId = "test_1jyd8bsc7qeea_v2Regionalbloc";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter regionalbloc with invalid value DEF");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter regionalbloc with invalid value DEF");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "gini")
				.pathParam("regionalbloc", "DEF")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t8cw8lajn8l2_v2Regionalbloc() {
		String testResultId = "test_t8cw8lajn8l2_v2Regionalbloc";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "languages")
				.pathParam("regionalbloc", "USAN")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ievj50dolsmr_v3All() {
		String testResultId = "test_1ievj50dolsmr_v3All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "alpha2Code")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hvb052xiu1k4_v3All() {
		String testResultId = "test_1hvb052xiu1k4_v3All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "borders")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iykji5bbc303_v3Alphacode() {
		String testResultId = "test_1iykji5bbc303_v3Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value YZ");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value YZ");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("alphacode", "YZ")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4tezsskk6lf_v3Alphacode() {
		String testResultId = "test_t4tezsskk6lf_v3Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("alphacode", "GQ")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ib5y36ryrip1_v3Alphacodes() {
		String testResultId = "test_1ib5y36ryrip1_v3Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "languages,cioc,translations,subregion")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hbd8gzhn401d_v3Alphacodes() {
		String testResultId = "test_1hbd8gzhn401d_v3Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("codes", "NAM,OLA,887")
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s0ui2r7mvwiu_v3Currency() {
		String testResultId = "test_s0ui2r7mvwiu_v3Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value NAR");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value NAR");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "area,nativeName")
				.pathParam("currency", "NAR")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s0v02ndcoggy_v3Currency() {
		String testResultId = "test_s0v02ndcoggy_v3Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "capital")
				.pathParam("currency", "NOK")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_trwbxvkl32ar_v3Name() {
		String testResultId = "test_trwbxvkl32ar_v3Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter name with invalid value Pacific States of America");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter name with invalid value Pacific States of America");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("fullText", "false")
				.queryParam("apikey_1", "abc")
				.pathParam("name", "Pacific States of America")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_trznzfd0lbhi_v3Name() {
		String testResultId = "test_trznzfd0lbhi_v3Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "population")
				.pathParam("name", "Ukraine")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ji7qdtg1kapi_v3Capital() {
		String testResultId = "test_1ji7qdtg1kapi_v3Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Teruel");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Teruel");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("capital", "Teruel")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7o5fd4re720_v3Capital() {
		String testResultId = "test_1h7o5fd4re720_v3Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "timezones")
				.pathParam("capital", "Porto-Novo")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ji4fi9cpkpwy_v3Region() {
		String testResultId = "test_1ji4fi9cpkpwy_v3Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Westeros");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Westeros");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "nativeName")
				.pathParam("region", "Westeros")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/region/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jew2ztlifint_v3Region() {
		String testResultId = "test_1jew2ztlifint_v3Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("region", "Oceania")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/region/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hv5jrympkegp_v3Subregion() {
		String testResultId = "test_1hv5jrympkegp_v3Subregion";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter subregion with invalid value Atlantis");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter subregion with invalid value Atlantis");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("subregion", "Atlantis")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/subregion/{subregion}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4w6gc6byyif_v3Subregion() {
		String testResultId = "test_t4w6gc6byyif_v3Subregion";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "currencies")
				.pathParam("subregion", "Eastern Africa")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/subregion/{subregion}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s1dvpzn964ad_v3Lang() {
		String testResultId = "test_s1dvpzn964ad_v3Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value qr");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value qr");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("lang", "qr")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jyisq6vux5is_v3Lang() {
		String testResultId = "test_1jyisq6vux5is_v3Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "population,name,latlng,numericCode")
				.pathParam("lang", "nd")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_uv5sw4xyg188_v3Demonym() {
		String testResultId = "test_uv5sw4xyg188_v3Demonym";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter demonym with invalid value gesluriote");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter demonym with invalid value gesluriote");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "name,region")
				.pathParam("demonym", "gesluriote")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/demonym/{demonym}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qxib81mnhohd_v3Demonym() {
		String testResultId = "test_qxib81mnhohd_v3Demonym";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("demonym", "Trinidadian")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/demonym/{demonym}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_uvjo5oomg2g6_v3Translation() {
		String testResultId = "test_uvjo5oomg2g6_v3Translation";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter translation with invalid value Atlantis");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter translation with invalid value Atlantis");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("translation", "Atlantis")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/translation/{translation}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vf3ogh55uvz5_v3Translation() {
		String testResultId = "test_vf3ogh55uvz5_v3Translation";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("translation", "Ciudad Vaticano")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/translation/{translation}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

}

package restcountries;

import org.junit.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.FixMethodOrder;
import static org.junit.Assert.fail;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.junit.Assert.assertTrue;
import org.junit.runners.MethodSorters;
import io.qameta.allure.restassured.AllureRestAssured;
import es.us.isa.restest.testcases.restassured.filters.StatusCode5XXFilter;
import es.us.isa.restest.testcases.restassured.filters.NominalOrFaultyTestCaseFilter;
import es.us.isa.restest.testcases.restassured.filters.StatefulFilter;
import java.io.File;
import es.us.isa.restest.testcases.restassured.filters.ResponseValidationFilter;
import es.us.isa.restest.testcases.restassured.filters.CSVFilter;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RestcountriesTest_1660800038637 {

	private static final String OAI_JSON_URL = "src/test/resources/Restcountries/openapi.yaml";
	private static final StatusCode5XXFilter statusCode5XXFilter = new StatusCode5XXFilter();
	private static final NominalOrFaultyTestCaseFilter nominalOrFaultyTestCaseFilter = new NominalOrFaultyTestCaseFilter();
	private static final ResponseValidationFilter validationFilter = new ResponseValidationFilter(OAI_JSON_URL);
	private static final AllureRestAssured allureFilter = new AllureRestAssured();
	private static final String APIName = "restcountries";
	private static final String testId = "1660800038637";
	private static final CSVFilter csvFilter = new CSVFilter(APIName, testId);

	@BeforeClass
	public static void setUp() {
		RestAssured.baseURI = "https://restcountries.com";

		statusCode5XXFilter.setAPIName(APIName);
		statusCode5XXFilter.setTestId(testId);
		nominalOrFaultyTestCaseFilter.setAPIName(APIName);
		nominalOrFaultyTestCaseFilter.setTestId(testId);
		validationFilter.setAPIName(APIName);
		validationFilter.setTestId(testId);
	}

	@Test
	public void test_rh506iyf7sqd_v2All() {
		String testResultId = "test_rh506iyf7sqd_v2All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hbli8vyb7td1_v2All() {
		String testResultId = "test_1hbli8vyb7td1_v2All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "latlng")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vben9meolrvl_v2Alphacode() {
		String testResultId = "test_vben9meolrvl_v2Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value LM");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value LM");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "callingCodes")
				.pathParam("alphacode", "LM")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jyjbd99o9f8h_v2Alphacode() {
		String testResultId = "test_1jyjbd99o9f8h_v2Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "callingCodes,translations,gini,demonym")
				.pathParam("alphacode", "UMI")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4vq0eiyafjm_v2Alphacodes() {
		String testResultId = "test_t4vq0eiyafjm_v2Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "alpha3Code")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qxi8yl8wh2r8_v2Alphacodes() {
		String testResultId = "test_qxi8yl8wh2r8_v2Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("codes", "LT")
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_tog6o81ygokl_v2Currency() {
		String testResultId = "test_tog6o81ygokl_v2Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value MNO");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value MNO");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "subregion")
				.pathParam("currency", "MNO")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qec4pl4z7dit_v2Currency() {
		String testResultId = "test_qec4pl4z7dit_v2Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "topLevelDomain")
				.pathParam("currency", "DKK")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qy4gmzzrmw52_v2Name() {
		String testResultId = "test_qy4gmzzrmw52_v2Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter name with invalid value Narnia");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter name with invalid value Narnia");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "alpha3Code")
				.pathParam("name", "Narnia")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vb9m1gegi5b8_v2Name() {
		String testResultId = "test_vb9m1gegi5b8_v2Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("fullText", "false")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "gini")
				.pathParam("name", "Ivory Coast")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbbvvx9fmreh_v2Callingcode() {
		String testResultId = "test_vbbvvx9fmreh_v2Callingcode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter callingcode with invalid value 210");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter callingcode with invalid value 210");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("callingcode", "210")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qe4dnbgbf5th_v2Callingcode() {
		String testResultId = "test_qe4dnbgbf5th_v2Callingcode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "nativeName")
				.pathParam("callingcode", "856")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_r1lohx4h6rtt_v2Capital() {
		String testResultId = "test_r1lohx4h6rtt_v2Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Milan");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Milan");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "regionalBlocs,alpha3Code,nativeName,altSpellings,cioc")
				.pathParam("capital", "Milan")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ib3p0q77vvqa_v2Capital() {
		String testResultId = "test_1ib3p0q77vvqa_v2Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("capital", "Andorra la Vella")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qhkjy71qr1v7_v2Region() {
		String testResultId = "test_qhkjy71qr1v7_v2Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Atlantis");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Atlantis");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("region", "Atlantis")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/continent/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_to4kxxuq0q5i_v2Region() {
		String testResultId = "test_to4kxxuq0q5i_v2Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("region", "Africa")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/continent/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s0xbsqy6zeba_v2Lang() {
		String testResultId = "test_s0xbsqy6zeba_v2Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value gh");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value gh");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("lang", "gh")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbhfibynuuec_v2Lang() {
		String testResultId = "test_vbhfibynuuec_v2Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "demonym,latlng,altSpellings")
				.pathParam("lang", "fj")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_r1fm61lkdicy_v2Regionalbloc() {
		String testResultId = "test_r1fm61lkdicy_v2Regionalbloc";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter regionalbloc with invalid value Galactic Empire");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter regionalbloc with invalid value Galactic Empire");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("regionalbloc", "Galactic Empire")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iespsu77yczb_v2Regionalbloc() {
		String testResultId = "test_1iespsu77yczb_v2Regionalbloc";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("regionalbloc", "AU")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_us06lnp9e33o_v3All() {
		String testResultId = "test_us06lnp9e33o_v3All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbbusd0zu1y9_v3All() {
		String testResultId = "test_vbbusd0zu1y9_v3All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_urjlfsxbm90w_v3Alphacode() {
		String testResultId = "test_urjlfsxbm90w_v3Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value NOP");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value NOP");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("alphacode", "NOP")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4neao1764a8_v3Alphacode() {
		String testResultId = "test_t4neao1764a8_v3Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("alphacode", "SR")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbko1n1o2rsp_v3Alphacodes() {
		String testResultId = "test_vbko1n1o2rsp_v3Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "numericCode,timezones,callingCodes")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_to541ejjl9b6_v3Alphacodes() {
		String testResultId = "test_to541ejjl9b6_v3Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("codes", "PG")
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "currencies,area,nativeName")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iukx55jcpfso_v3Currency() {
		String testResultId = "test_1iukx55jcpfso_v3Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value DEF");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value DEF");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("currency", "DEF")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jicuc8q9adsx_v3Currency() {
		String testResultId = "test_1jicuc8q9adsx_v3Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("currency", "Franc")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t8cg99gey62e_v3Name() {
		String testResultId = "test_t8cg99gey62e_v3Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter name with invalid value Narnia");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter name with invalid value Narnia");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("name", "Narnia")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hbd67j4cihpt_v3Name() {
		String testResultId = "test_1hbd67j4cihpt_v3Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("name", "Botswana")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4tg65l194ki_v3Capital() {
		String testResultId = "test_t4tg65l194ki_v3Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Lyon");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Lyon");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("capital", "Lyon")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_uv94xg30z583_v3Capital() {
		String testResultId = "test_uv94xg30z583_v3Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("capital", "Stockholm")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4hu1ew0gin5_v3Region() {
		String testResultId = "test_t4hu1ew0gin5_v3Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Essos");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Essos");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "gini")
				.pathParam("region", "Essos")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/region/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ursdzbjsuwdf_v3Region() {
		String testResultId = "test_ursdzbjsuwdf_v3Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "latlng,borders,numericCode,cioc")
				.pathParam("region", "Europe")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/region/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iuvz2ni7wsae_v3Subregion() {
		String testResultId = "test_1iuvz2ni7wsae_v3Subregion";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter subregion with invalid value Atlantis");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter subregion with invalid value Atlantis");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("subregion", "Atlantis")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/subregion/{subregion}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4knaqg4yek1_v3Subregion() {
		String testResultId = "test_t4knaqg4yek1_v3Subregion";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "alpha2Code")
				.pathParam("subregion", "South-Eastern Asia")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/subregion/{subregion}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1k1zhqk2nvx2v_v3Lang() {
		String testResultId = "test_1k1zhqk2nvx2v_v3Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value cd");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value cd");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("lang", "cd")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qe9cv6kk9dma_v3Lang() {
		String testResultId = "test_qe9cv6kk9dma_v3Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("lang", "ms")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_tofor4hfic83_v3Demonym() {
		String testResultId = "test_tofor4hfic83_v3Demonym";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter demonym with invalid value usnasqeno");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter demonym with invalid value usnasqeno");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "area,topLevelDomain,subregion")
				.pathParam("demonym", "usnasqeno")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/demonym/{demonym}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qxoafobvae5w_v3Demonym() {
		String testResultId = "test_qxoafobvae5w_v3Demonym";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "alpha3Code")
				.pathParam("demonym", "Trinidadian")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/demonym/{demonym}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7qxl5srypm8_v3Translation() {
		String testResultId = "test_1h7qxl5srypm8_v3Translation";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter translation with invalid value Westeros");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter translation with invalid value Westeros");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "altSpellings")
				.pathParam("translation", "Westeros")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/translation/{translation}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jyouwpgccojd_v3Translation() {
		String testResultId = "test_1jyouwpgccojd_v3Translation";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("translation", "Canada")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/translation/{translation}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

}

package restcountries;

import org.junit.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.FixMethodOrder;
import static org.junit.Assert.fail;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.junit.Assert.assertTrue;
import org.junit.runners.MethodSorters;
import io.qameta.allure.restassured.AllureRestAssured;
import es.us.isa.restest.testcases.restassured.filters.StatusCode5XXFilter;
import es.us.isa.restest.testcases.restassured.filters.NominalOrFaultyTestCaseFilter;
import es.us.isa.restest.testcases.restassured.filters.StatefulFilter;
import java.io.File;
import es.us.isa.restest.testcases.restassured.filters.ResponseValidationFilter;
import es.us.isa.restest.testcases.restassured.filters.CSVFilter;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RestcountriesTest_1660800091460 {

	private static final String OAI_JSON_URL = "src/test/resources/Restcountries/openapi.yaml";
	private static final StatusCode5XXFilter statusCode5XXFilter = new StatusCode5XXFilter();
	private static final NominalOrFaultyTestCaseFilter nominalOrFaultyTestCaseFilter = new NominalOrFaultyTestCaseFilter();
	private static final ResponseValidationFilter validationFilter = new ResponseValidationFilter(OAI_JSON_URL);
	private static final AllureRestAssured allureFilter = new AllureRestAssured();
	private static final String APIName = "restcountries";
	private static final String testId = "1660800091460";
	private static final CSVFilter csvFilter = new CSVFilter(APIName, testId);

	@BeforeClass
	public static void setUp() {
		RestAssured.baseURI = "https://restcountries.com";

		statusCode5XXFilter.setAPIName(APIName);
		statusCode5XXFilter.setTestId(testId);
		nominalOrFaultyTestCaseFilter.setAPIName(APIName);
		nominalOrFaultyTestCaseFilter.setTestId(testId);
		validationFilter.setAPIName(APIName);
		validationFilter.setTestId(testId);
	}

	@Test
	public void test_vbszokxo6lvb_v2All() {
		String testResultId = "test_vbszokxo6lvb_v2All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "area,translations")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qxljrkxzpmqu_v2All() {
		String testResultId = "test_qxljrkxzpmqu_v2All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t84m5liobj8z_v2Alphacode() {
		String testResultId = "test_t84m5liobj8z_v2Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value NAR");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value NAR");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "borders")
				.pathParam("alphacode", "NAR")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhr57lrcojzr_v2Alphacode() {
		String testResultId = "test_rhr57lrcojzr_v2Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("alphacode", "SLB")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hb87bk46jhpf_v2Alphacodes() {
		String testResultId = "test_1hb87bk46jhpf_v2Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "topLevelDomain,languages,name")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhaimjs2ab1h_v2Alphacodes() {
		String testResultId = "test_rhaimjs2ab1h_v2Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("codes", "NF,TKM,AGO")
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_trwdfrf2b3oi_v2Currency() {
		String testResultId = "test_trwdfrf2b3oi_v2Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value DEF");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value DEF");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "alpha2Code,callingCodes")
				.pathParam("currency", "DEF")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u88gckcec5de_v2Currency() {
		String testResultId = "test_u88gckcec5de_v2Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "alpha2Code")
				.pathParam("currency", "MUR")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhg2w4qvi989_v2Name() {
		String testResultId = "test_rhg2w4qvi989_v2Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Changed value of boolean parameter fullText from 'false' to integer '6924'");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Changed value of boolean parameter fullText from 'false' to integer '6924'");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("fullText", "6924")
				.queryParam("apikey_1", "abc")
				.pathParam("name", "Tanzania")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_r1iw9fhyoxno_v2Name() {
		String testResultId = "test_r1iw9fhyoxno_v2Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("fullText", "false")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "altSpellings")
				.pathParam("name", "Pakistan")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qy26339gu4vn_v2Callingcode() {
		String testResultId = "test_qy26339gu4vn_v2Callingcode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter callingcode with invalid value 89");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter callingcode with invalid value 89");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("callingcode", "89")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_trz75kw9vnfo_v2Callingcode() {
		String testResultId = "test_trz75kw9vnfo_v2Callingcode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("callingcode", "502")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s0v008j42uy8_v2Capital() {
		String testResultId = "test_s0v008j42uy8_v2Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Bonn");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Bonn");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "callingCodes,translations,demonym,flag")
				.pathParam("capital", "Bonn")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ji7825e41a9d_v2Capital() {
		String testResultId = "test_1ji7825e41a9d_v2Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("capital", "Douglas")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbcdfj05l8pw_v2Region() {
		String testResultId = "test_vbcdfj05l8pw_v2Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Westeros");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Westeros");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "name,languages,subregion")
				.pathParam("region", "Westeros")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/continent/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jyg0hn8oy4iq_v2Region() {
		String testResultId = "test_1jyg0hn8oy4iq_v2Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("region", "Europe")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/continent/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iyc8kkkyqd0k_v2Lang() {
		String testResultId = "test_1iyc8kkkyqd0k_v2Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value su");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value su");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("lang", "su")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jyoddp1uuq7n_v2Lang() {
		String testResultId = "test_1jyoddp1uuq7n_v2Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "timezones")
				.pathParam("lang", "nn")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qy1p979i21cx_v2Regionalbloc() {
		String testResultId = "test_qy1p979i21cx_v2Regionalbloc";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter regionalbloc with invalid value DEF");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter regionalbloc with invalid value DEF");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "languages")
				.pathParam("regionalbloc", "DEF")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hrjr4p73woj4_v2Regionalbloc() {
		String testResultId = "test_1hrjr4p73woj4_v2Regionalbloc";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "latlng,capital")
				.pathParam("regionalbloc", "SAARC")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4ndz9n1q0rl_v3All() {
		String testResultId = "test_t4ndz9n1q0rl_v3All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u7xdn5s79tgj_v3All() {
		String testResultId = "test_u7xdn5s79tgj_v3All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iepfq0eokke1_v3Alphacode() {
		String testResultId = "test_1iepfq0eokke1_v3Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value DEF");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value DEF");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("alphacode", "DEF")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7ioj28wmueb_v3Alphacode() {
		String testResultId = "test_1h7ioj28wmueb_v3Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("alphacode", "PT")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t84lrajlnd4m_v3Alphacodes() {
		String testResultId = "test_t84lrajlnd4m_v3Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "regionalBlocs,latlng,alpha2Code,area,gini")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qhsvnjr5jfw5_v3Alphacodes() {
		String testResultId = "test_qhsvnjr5jfw5_v3Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("codes", "GER,ERI,535")
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "capital,cioc,borders")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7im9knrlbn6_v3Currency() {
		String testResultId = "test_1h7im9knrlbn6_v3Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value ABC");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value ABC");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("currency", "ABC")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhakigdqpbol_v3Currency() {
		String testResultId = "test_rhakigdqpbol_v3Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "gini")
				.pathParam("currency", "TRY")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhuggx39j12r_v3Name() {
		String testResultId = "test_rhuggx39j12r_v3Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Changed value of boolean parameter fullText from 'null' to integer '2669'");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Changed value of boolean parameter fullText from 'null' to integer '2669'");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("fullText", "2669")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "area,timezones,numericCode,cioc")
				.pathParam("name", "Grenada")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ibbkd5t8miqq_v3Name() {
		String testResultId = "test_1ibbkd5t8miqq_v3Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("name", "Georgia")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1k1rr2f2xca46_v3Capital() {
		String testResultId = "test_1k1rr2f2xca46_v3Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Vladivostok");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Vladivostok");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("capital", "Vladivostok")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hv2rm9xl3xb5_v3Capital() {
		String testResultId = "test_1hv2rm9xl3xb5_v3Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("capital", "West Island")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sksbar8zgpcz_v3Region() {
		String testResultId = "test_sksbar8zgpcz_v3Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Westeros");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Westeros");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "alpha3Code,nativeName,flag,numericCode,capital")
				.pathParam("region", "Westeros")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/region/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t87d2gju7z90_v3Region() {
		String testResultId = "test_t87d2gju7z90_v3Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "alpha2Code,altSpellings,translations")
				.pathParam("region", "Americas")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/region/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhak4h9ywkkw_v3Subregion() {
		String testResultId = "test_rhak4h9ywkkw_v3Subregion";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter subregion with invalid value Essos");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter subregion with invalid value Essos");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("subregion", "Essos")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/subregion/{subregion}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_toaniqzue0dh_v3Subregion() {
		String testResultId = "test_toaniqzue0dh_v3Subregion";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("subregion", "Western Asia")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/subregion/{subregion}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jifm40mim7g7_v3Lang() {
		String testResultId = "test_1jifm40mim7g7_v3Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value ab");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value ab");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "callingCodes,population")
				.pathParam("lang", "ab")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hv8smgj4e244_v3Lang() {
		String testResultId = "test_1hv8smgj4e244_v3Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "demonym")
				.pathParam("lang", "sv")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hblkytthhr8y_v3Demonym() {
		String testResultId = "test_1hblkytthhr8y_v3Demonym";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter demonym with invalid value spuosiaeno");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter demonym with invalid value spuosiaeno");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("demonym", "spuosiaeno")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/demonym/{demonym}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iusq81lt3oth_v3Demonym() {
		String testResultId = "test_1iusq81lt3oth_v3Demonym";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("demonym", "Palestinian")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/demonym/{demonym}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1k1r81bwt6muq_v3Translation() {
		String testResultId = "test_1k1r81bwt6muq_v3Translation";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter translation with invalid value Middle-earth");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter translation with invalid value Middle-earth");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "alpha2Code,nativeName,gini")
				.pathParam("translation", "Middle-earth")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/translation/{translation}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hux61rntzsc2_v3Translation() {
		String testResultId = "test_1hux61rntzsc2_v3Translation";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "languages")
				.pathParam("translation", "Marokko")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/translation/{translation}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

}

package restcountries;

import org.junit.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.FixMethodOrder;
import static org.junit.Assert.fail;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.junit.Assert.assertTrue;
import org.junit.runners.MethodSorters;
import io.qameta.allure.restassured.AllureRestAssured;
import es.us.isa.restest.testcases.restassured.filters.StatusCode5XXFilter;
import es.us.isa.restest.testcases.restassured.filters.NominalOrFaultyTestCaseFilter;
import es.us.isa.restest.testcases.restassured.filters.StatefulFilter;
import java.io.File;
import es.us.isa.restest.testcases.restassured.filters.ResponseValidationFilter;
import es.us.isa.restest.testcases.restassured.filters.CSVFilter;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RestcountriesTest_1660814858338 {

	private static final String OAI_JSON_URL = "src/test/resources/Restcountries/openapi.yaml";
	private static final StatusCode5XXFilter statusCode5XXFilter = new StatusCode5XXFilter();
	private static final NominalOrFaultyTestCaseFilter nominalOrFaultyTestCaseFilter = new NominalOrFaultyTestCaseFilter();
	private static final ResponseValidationFilter validationFilter = new ResponseValidationFilter(OAI_JSON_URL);
	private static final AllureRestAssured allureFilter = new AllureRestAssured();
	private static final String APIName = "restcountries";
	private static final String testId = "1660814858338";
	private static final CSVFilter csvFilter = new CSVFilter(APIName, testId);

	@BeforeClass
	public static void setUp() {
		RestAssured.baseURI = "https://restcountries.com";

		statusCode5XXFilter.setAPIName(APIName);
		statusCode5XXFilter.setTestId(testId);
		nominalOrFaultyTestCaseFilter.setAPIName(APIName);
		nominalOrFaultyTestCaseFilter.setTestId(testId);
		validationFilter.setAPIName(APIName);
		validationFilter.setTestId(testId);
	}

	@Test
	public void test_r1fklr81q14k_v2All() {
		String testResultId = "test_r1fklr81q14k_v2All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "currencies")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7tpqz49vkfs_v2All() {
		String testResultId = "test_1h7tpqz49vkfs_v2All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4l3o9anystg_v2Alphacode() {
		String testResultId = "test_t4l3o9anystg_v2Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value NAR");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value NAR");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "numericCode,subregion,cioc")
				.pathParam("alphacode", "NAR")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qxzepghmd7hx_v2Alphacode() {
		String testResultId = "test_qxzepghmd7hx_v2Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("alphacode", "VNM")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jer25l5weich_v2Alphacodes() {
		String testResultId = "test_1jer25l5weich_v2Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_trz4w4wwddnp_v2Alphacodes() {
		String testResultId = "test_trz4w4wwddnp_v2Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("codes", "ASM")
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "region,nativeName")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1k1txsmzi056d_v2Currency() {
		String testResultId = "test_1k1txsmzi056d_v2Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value NAR");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value NAR");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("currency", "NAR")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_urxetm024oxj_v2Currency() {
		String testResultId = "test_urxetm024oxj_v2Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "demonym,flag")
				.pathParam("currency", "CHE")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_skv531gottf7_v2Name() {
		String testResultId = "test_skv531gottf7_v2Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Changed value of boolean parameter fullText from 'null' to string 'ammoGICbbkSrXodKgNG'");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Changed value of boolean parameter fullText from 'null' to string 'ammoGICbbkSrXodKgNG'");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("fullText", "ammoGICbbkSrXodKgNG")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "numericCode,capital,subregion")
				.pathParam("name", "El Salvador")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4kmldad97hu_v2Name() {
		String testResultId = "test_t4kmldad97hu_v2Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("name", "Guadeloupe")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ib5xp3p9050k_v2Callingcode() {
		String testResultId = "test_1ib5xp3p9050k_v2Callingcode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter callingcode with invalid value 296");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter callingcode with invalid value 296");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("callingcode", "296")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1k1u04i5vsmd5_v2Callingcode() {
		String testResultId = "test_1k1u04i5vsmd5_v2Callingcode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "timezones,borders,alpha3Code,regionalBlocs,currencies")
				.pathParam("callingcode", "967")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_urrx7xwjxmwl_v2Capital() {
		String testResultId = "test_urrx7xwjxmwl_v2Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Teruel");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Teruel");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("capital", "Teruel")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_trqt3v8gstpi_v2Capital() {
		String testResultId = "test_trqt3v8gstpi_v2Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "cioc,alpha2Code,altSpellings")
				.pathParam("capital", "Vienna")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iesrdcgb8qjm_v2Region() {
		String testResultId = "test_1iesrdcgb8qjm_v2Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Westeros");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Westeros");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "flag,borders,currencies,topLevelDomain,languages")
				.pathParam("region", "Westeros")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/continent/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_uve4lxgco0fr_v2Region() {
		String testResultId = "test_uve4lxgco0fr_v2Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("region", "Americas")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/continent/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jicrlz0eb702_v2Lang() {
		String testResultId = "test_1jicrlz0eb702_v2Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value op");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value op");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("lang", "op")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iuvh7z4zdvlf_v2Lang() {
		String testResultId = "test_1iuvh7z4zdvlf_v2Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("lang", "ar")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_urpnp5d3loog_v2Regionalbloc() {
		String testResultId = "test_urpnp5d3loog_v2Regionalbloc";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter regionalbloc with invalid value Galactic Republic");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter regionalbloc with invalid value Galactic Republic");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("regionalbloc", "Galactic Republic")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ib35xdteqdkl_v2Regionalbloc() {
		String testResultId = "test_1ib35xdteqdkl_v2Regionalbloc";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "translations,capital,callingCodes,topLevelDomain")
				.pathParam("regionalbloc", "USAN")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s15lk5or10z4_v3All() {
		String testResultId = "test_s15lk5or10z4_v3All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_r1fl2izgjrxu_v3All() {
		String testResultId = "test_r1fl2izgjrxu_v3All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4ncqpi50mzq_v3Alphacode() {
		String testResultId = "test_t4ncqpi50mzq_v3Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value GHI");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value GHI");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("alphacode", "GHI")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s1jfc659e04y_v3Alphacode() {
		String testResultId = "test_s1jfc659e04y_v3Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "name")
				.pathParam("alphacode", "LS")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbngx7qkshno_v3Alphacodes() {
		String testResultId = "test_vbngx7qkshno_v3Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "translations,alpha2Code")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_trz3pva74htc_v3Alphacodes() {
		String testResultId = "test_trz3pva74htc_v3Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("codes", "308,TW,192")
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ib0y3hbyihbl_v3Currency() {
		String testResultId = "test_1ib0y3hbyihbl_v3Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value DEF");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value DEF");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "callingCodes,population,region,borders,languages")
				.pathParam("currency", "DEF")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1k1r6sxcs6s6p_v3Currency() {
		String testResultId = "test_1k1r6sxcs6s6p_v3Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("currency", "TWD")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ib36bclinsj6_v3Name() {
		String testResultId = "test_1ib36bclinsj6_v3Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter name with invalid value Genovia");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter name with invalid value Genovia");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("fullText", "true")
				.queryParam("apikey_1", "abc")
				.pathParam("name", "Genovia")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ubryr4c92vdv_v3Name() {
		String testResultId = "test_ubryr4c92vdv_v3Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("name", "Lithuania")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ts1vf0gf4602_v3Capital() {
		String testResultId = "test_ts1vf0gf4602_v3Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Bonn");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Bonn");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "borders")
				.pathParam("capital", "Bonn")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qe9c34akn1o6_v3Capital() {
		String testResultId = "test_qe9c34akn1o6_v3Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("capital", "Andorra la Vella")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbbubou23qk0_v3Region() {
		String testResultId = "test_vbbubou23qk0_v3Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Atlantis");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Atlantis");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("region", "Atlantis")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/region/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t81udnqr894p_v3Region() {
		String testResultId = "test_t81udnqr894p_v3Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "area")
				.pathParam("region", "Africa")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/region/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jyisq98her1f_v3Subregion() {
		String testResultId = "test_1jyisq98her1f_v3Subregion";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter subregion with invalid value Atlantis");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter subregion with invalid value Atlantis");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "numericCode,languages,currencies,population")
				.pathParam("subregion", "Atlantis")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/subregion/{subregion}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s4mapk10qss3_v3Subregion() {
		String testResultId = "test_s4mapk10qss3_v3Subregion";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("subregion", "Northern Africa")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/subregion/{subregion}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7imnjghskti_v3Lang() {
		String testResultId = "test_1h7imnjghskti_v3Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value lk");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value lk");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "area,borders,altSpellings")
				.pathParam("lang", "lk")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qy1nb78louhv_v3Lang() {
		String testResultId = "test_qy1nb78louhv_v3Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "alpha3Code")
				.pathParam("lang", "Romanian")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_skn9qnh65bn4_v3Demonym() {
		String testResultId = "test_skn9qnh65bn4_v3Demonym";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter demonym with invalid value skeianian");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter demonym with invalid value skeianian");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("demonym", "skeianian")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/demonym/{demonym}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t8ceb0dtxjcp_v3Demonym() {
		String testResultId = "test_t8ceb0dtxjcp_v3Demonym";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("demonym", "Nigerien")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/demonym/{demonym}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qxl1u5krm6gn_v3Translation() {
		String testResultId = "test_qxl1u5krm6gn_v3Translation";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter translation with invalid value Westeros");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter translation with invalid value Westeros");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "flag,alpha3Code")
				.pathParam("translation", "Westeros")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/translation/{translation}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t8f5oupjbrs6_v3Translation() {
		String testResultId = "test_t8f5oupjbrs6_v3Translation";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "languages,altSpellings")
				.pathParam("translation", "Los Pa\u00EDses Bajos / Holanda")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/translation/{translation}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

}

package restcountries;

import org.junit.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.FixMethodOrder;
import static org.junit.Assert.fail;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.junit.Assert.assertTrue;
import org.junit.runners.MethodSorters;
import io.qameta.allure.restassured.AllureRestAssured;
import es.us.isa.restest.testcases.restassured.filters.StatusCode5XXFilter;
import es.us.isa.restest.testcases.restassured.filters.NominalOrFaultyTestCaseFilter;
import es.us.isa.restest.testcases.restassured.filters.StatefulFilter;
import java.io.File;
import es.us.isa.restest.testcases.restassured.filters.ResponseValidationFilter;
import es.us.isa.restest.testcases.restassured.filters.CSVFilter;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RestcountriesTest_1660814911002 {

	private static final String OAI_JSON_URL = "src/test/resources/Restcountries/openapi.yaml";
	private static final StatusCode5XXFilter statusCode5XXFilter = new StatusCode5XXFilter();
	private static final NominalOrFaultyTestCaseFilter nominalOrFaultyTestCaseFilter = new NominalOrFaultyTestCaseFilter();
	private static final ResponseValidationFilter validationFilter = new ResponseValidationFilter(OAI_JSON_URL);
	private static final AllureRestAssured allureFilter = new AllureRestAssured();
	private static final String APIName = "restcountries";
	private static final String testId = "1660814911002";
	private static final CSVFilter csvFilter = new CSVFilter(APIName, testId);

	@BeforeClass
	public static void setUp() {
		RestAssured.baseURI = "https://restcountries.com";

		statusCode5XXFilter.setAPIName(APIName);
		statusCode5XXFilter.setTestId(testId);
		nominalOrFaultyTestCaseFilter.setAPIName(APIName);
		nominalOrFaultyTestCaseFilter.setTestId(testId);
		validationFilter.setAPIName(APIName);
		validationFilter.setTestId(testId);
	}

	@Test
	public void test_1iuyrbf0od9h4_v2All() {
		String testResultId = "test_1iuyrbf0od9h4_v2All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u7znh6t7f5f6_v2All() {
		String testResultId = "test_u7znh6t7f5f6_v2All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "languages,numericCode,translations")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1k1wrz0d7dohl_v2Alphacode() {
		String testResultId = "test_1k1wrz0d7dohl_v2Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value YZ");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value YZ");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("alphacode", "YZ")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ibh1n5njq6oz_v2Alphacode() {
		String testResultId = "test_1ibh1n5njq6oz_v2Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "subregion,region")
				.pathParam("alphacode", "AFG")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ubu6njj88i92_v2Alphacodes() {
		String testResultId = "test_ubu6njj88i92_v2Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vf0xwxx9suhv_v2Alphacodes() {
		String testResultId = "test_vf0xwxx9suhv_v2Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("codes", "PS")
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1huzy9zgb3x9t_v2Currency() {
		String testResultId = "test_1huzy9zgb3x9t_v2Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value PQR");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value PQR");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "cioc")
				.pathParam("currency", "PQR")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jeqhtauk6dkh_v2Currency() {
		String testResultId = "test_1jeqhtauk6dkh_v2Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("currency", "KPW")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jefh4kksg7l2_v2Name() {
		String testResultId = "test_1jefh4kksg7l2_v2Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter name with invalid value Panem");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter name with invalid value Panem");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("fullText", "true")
				.queryParam("apikey_1", "abc")
				.pathParam("name", "Panem")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1k1rqcpnrmdlu_v2Name() {
		String testResultId = "test_1k1rqcpnrmdlu_v2Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("fullText", "true")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "translations")
				.pathParam("name", "Mauritania")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ibh2qsj1mp2b_v2Callingcode() {
		String testResultId = "test_1ibh2qsj1mp2b_v2Callingcode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter callingcode with invalid value 210");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter callingcode with invalid value 210");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("callingcode", "210")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_us0q37jumgc8_v2Callingcode() {
		String testResultId = "test_us0q37jumgc8_v2Callingcode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("callingcode", "502")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_r1iwq1c1n6n9_v2Capital() {
		String testResultId = "test_r1iwq1c1n6n9_v2Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value New York");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value New York");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "borders")
				.pathParam("capital", "New York")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_r1fldzq04myc_v2Capital() {
		String testResultId = "test_r1fldzq04myc_v2Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("capital", "Budapest")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hv60309n5xkk_v2Region() {
		String testResultId = "test_1hv60309n5xkk_v2Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Atlantis");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Atlantis");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "name")
				.pathParam("region", "Atlantis")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/continent/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jyg03o5fd35d_v2Region() {
		String testResultId = "test_1jyg03o5fd35d_v2Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("region", "Americas")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/continent/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ubrxz23lllww_v2Lang() {
		String testResultId = "test_ubrxz23lllww_v2Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value tv");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value tv");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("lang", "tv")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sl8xy058g3eb_v2Lang() {
		String testResultId = "test_sl8xy058g3eb_v2Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("lang", "vi")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhjdfsnfx2rc_v2Regionalbloc() {
		String testResultId = "test_rhjdfsnfx2rc_v2Regionalbloc";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter regionalbloc with invalid value Galactic Empire");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter regionalbloc with invalid value Galactic Empire");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "gini,cioc,flag")
				.pathParam("regionalbloc", "Galactic Empire")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qdw0dieo125s_v2Regionalbloc() {
		String testResultId = "test_qdw0dieo125s_v2Regionalbloc";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("regionalbloc", "NAFTA")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7ftmxxzn60n_v3All() {
		String testResultId = "test_1h7ftmxxzn60n_v3All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "cioc,latlng")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ibbi15haeyjl_v3All() {
		String testResultId = "test_1ibbi15haeyjl_v3All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "numericCode,altSpellings,regionalBlocs,capital")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ubrwssi02p84_v3Alphacode() {
		String testResultId = "test_ubrwssi02p84_v3Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value ABC");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value ABC");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "languages")
				.pathParam("alphacode", "ABC")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_tocu8xcx574x_v3Alphacode() {
		String testResultId = "test_tocu8xcx574x_v3Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("alphacode", "RWA")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qxzfeq1rkapg_v3Alphacodes() {
		String testResultId = "test_qxzfeq1rkapg_v3Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "region,subregion,latlng,alpha3Code")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s18bgoxeqlo1_v3Alphacodes() {
		String testResultId = "test_s18bgoxeqlo1_v3Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("codes", "051,MOZ")
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s1eg20iz4oys_v3Currency() {
		String testResultId = "test_s1eg20iz4oys_v3Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value JKL");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value JKL");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "translations")
				.pathParam("currency", "JKL")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbk5q0ztnxpf_v3Currency() {
		String testResultId = "test_vbk5q0ztnxpf_v3Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "subregion")
				.pathParam("currency", "GIP")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hbdr9d9q9uuc_v3Name() {
		String testResultId = "test_1hbdr9d9q9uuc_v3Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter name with invalid value Pacific States of America");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter name with invalid value Pacific States of America");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("fullText", "false")
				.queryParam("apikey_1", "abc")
				.pathParam("name", "Pacific States of America")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_uv8moumpc7s4_v3Name() {
		String testResultId = "test_uv8moumpc7s4_v3Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("fullText", "true")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "alpha3Code,borders,currencies")
				.pathParam("name", "Svalbard and Jan Mayen")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_r1ajrp2ag6eb_v3Capital() {
		String testResultId = "test_r1ajrp2ag6eb_v3Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Bonn");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Bonn");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "latlng")
				.pathParam("capital", "Bonn")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s0ugwma6vtip_v3Capital() {
		String testResultId = "test_s0ugwma6vtip_v3Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "nativeName")
				.pathParam("capital", "Nuuk")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ubguhfr0nigj_v3Region() {
		String testResultId = "test_ubguhfr0nigj_v3Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Atlantis");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Atlantis");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "alpha3Code,demonym,subregion")
				.pathParam("region", "Atlantis")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/region/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s10j5r6bx0e0_v3Region() {
		String testResultId = "test_s10j5r6bx0e0_v3Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("region", "Asia")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/region/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rl2b6zqc6b7d_v3Subregion() {
		String testResultId = "test_rl2b6zqc6b7d_v3Subregion";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter subregion with invalid value Middle-earth");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter subregion with invalid value Middle-earth");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "timezones,latlng")
				.pathParam("subregion", "Middle-earth")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/subregion/{subregion}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qy4x0kfsdp43_v3Subregion() {
		String testResultId = "test_qy4x0kfsdp43_v3Subregion";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "timezones")
				.pathParam("subregion", "Polynesia")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/subregion/{subregion}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_tooi0513he7q_v3Lang() {
		String testResultId = "test_tooi0513he7q_v3Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value cd");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value cd");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("lang", "cd")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u88fyfa53d4l_v3Lang() {
		String testResultId = "test_u88fyfa53d4l_v3Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("lang", "ne")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbf61w85ouhx_v3Demonym() {
		String testResultId = "test_vbf61w85ouhx_v3Demonym";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter demonym with invalid value qasweasque");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter demonym with invalid value qasweasque");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("demonym", "qasweasque")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/demonym/{demonym}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhb2i8810ns4_v3Demonym() {
		String testResultId = "test_rhb2i8810ns4_v3Demonym";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "callingCodes,population,timezones,languages,gini")
				.pathParam("demonym", "Eritrean")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/demonym/{demonym}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hb878vgs1yye_v3Translation() {
		String testResultId = "test_1hb878vgs1yye_v3Translation";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter translation with invalid value Westeros");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter translation with invalid value Westeros");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "name")
				.pathParam("translation", "Westeros")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/translation/{translation}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hrbft7mm84dt_v3Translation() {
		String testResultId = "test_1hrbft7mm84dt_v3Translation";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "topLevelDomain")
				.pathParam("translation", "Island")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/translation/{translation}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

}

package restcountries;

import org.junit.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.FixMethodOrder;
import static org.junit.Assert.fail;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.junit.Assert.assertTrue;
import org.junit.runners.MethodSorters;
import io.qameta.allure.restassured.AllureRestAssured;
import es.us.isa.restest.testcases.restassured.filters.StatusCode5XXFilter;
import es.us.isa.restest.testcases.restassured.filters.NominalOrFaultyTestCaseFilter;
import es.us.isa.restest.testcases.restassured.filters.StatefulFilter;
import java.io.File;
import es.us.isa.restest.testcases.restassured.filters.ResponseValidationFilter;
import es.us.isa.restest.testcases.restassured.filters.CSVFilter;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RestcountriesTest_1660814952846 {

	private static final String OAI_JSON_URL = "src/test/resources/Restcountries/openapi.yaml";
	private static final StatusCode5XXFilter statusCode5XXFilter = new StatusCode5XXFilter();
	private static final NominalOrFaultyTestCaseFilter nominalOrFaultyTestCaseFilter = new NominalOrFaultyTestCaseFilter();
	private static final ResponseValidationFilter validationFilter = new ResponseValidationFilter(OAI_JSON_URL);
	private static final AllureRestAssured allureFilter = new AllureRestAssured();
	private static final String APIName = "restcountries";
	private static final String testId = "1660814952846";
	private static final CSVFilter csvFilter = new CSVFilter(APIName, testId);

	@BeforeClass
	public static void setUp() {
		RestAssured.baseURI = "https://restcountries.com";

		statusCode5XXFilter.setAPIName(APIName);
		statusCode5XXFilter.setTestId(testId);
		nominalOrFaultyTestCaseFilter.setAPIName(APIName);
		nominalOrFaultyTestCaseFilter.setTestId(testId);
		validationFilter.setAPIName(APIName);
		validationFilter.setTestId(testId);
	}

	@Test
	public void test_t4hvj2jvkuox_v2All() {
		String testResultId = "test_t4hvj2jvkuox_v2All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "currencies,gini")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4ctwvss19o4_v2All() {
		String testResultId = "test_t4ctwvss19o4_v2All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "flag,nativeName,regionalBlocs,alpha3Code,demonym")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iuy7d668t2k5_v2Alphacode() {
		String testResultId = "test_1iuy7d668t2k5_v2Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value NAR");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value NAR");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "languages,currencies,subregion,demonym")
				.pathParam("alphacode", "NAR")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbpqrilupa9c_v2Alphacode() {
		String testResultId = "test_vbpqrilupa9c_v2Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("alphacode", "MOZ")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iemp43y1ks4k_v2Alphacodes() {
		String testResultId = "test_1iemp43y1ks4k_v2Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "latlng")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vf995ybq2a1v_v2Alphacodes() {
		String testResultId = "test_vf995ybq2a1v_v2Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("codes", "LR,CN")
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "latlng")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ubj56n3urmlt_v2Currency() {
		String testResultId = "test_ubj56n3urmlt_v2Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value MNO");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value MNO");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("currency", "MNO")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhdu7p8zhxde_v2Currency() {
		String testResultId = "test_rhdu7p8zhxde_v2Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("currency", "SDG")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t8cgn0re63xg_v2Name() {
		String testResultId = "test_t8cgn0re63xg_v2Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Changed value of boolean parameter fullText from 'null' to integer '4470'");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Changed value of boolean parameter fullText from 'null' to integer '4470'");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("fullText", "4470")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "callingCodes")
				.pathParam("name", "Bulgaria")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ibh1yvv9tues_v2Name() {
		String testResultId = "test_1ibh1yvv9tues_v2Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("fullText", "false")
				.queryParam("apikey_1", "def")
				.pathParam("name", "Yemen")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iycped2gn9kg_v2Callingcode() {
		String testResultId = "test_1iycped2gn9kg_v2Callingcode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter callingcode with invalid value 89");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter callingcode with invalid value 89");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("callingcode", "89")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7op88nbmjoy_v2Callingcode() {
		String testResultId = "test_1h7op88nbmjoy_v2Callingcode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("callingcode", "423")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sobuxvar2a1v_v2Capital() {
		String testResultId = "test_sobuxvar2a1v_v2Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Barcelona");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Barcelona");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "callingCodes,cioc")
				.pathParam("capital", "Barcelona")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hb85ouzp5vfo_v2Capital() {
		String testResultId = "test_1hb85ouzp5vfo_v2Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "region,topLevelDomain")
				.pathParam("capital", "Taipei")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rkwsck0ck8xh_v2Region() {
		String testResultId = "test_rkwsck0ck8xh_v2Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Westeros");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Westeros");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "name,nativeName,currencies")
				.pathParam("region", "Westeros")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/continent/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhiwanq1xp9v_v2Region() {
		String testResultId = "test_rhiwanq1xp9v_v2Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("region", "Africa")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/continent/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hvbj8la023j9_v2Lang() {
		String testResultId = "test_1hvbj8la023j9_v2Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value ab");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value ab");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("lang", "ab")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qeffyydlpdgi_v2Lang() {
		String testResultId = "test_qeffyydlpdgi_v2Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("lang", "be")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_tofpirb7lv06_v2Regionalbloc() {
		String testResultId = "test_tofpirb7lv06_v2Regionalbloc";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter regionalbloc with invalid value GHIJK");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter regionalbloc with invalid value GHIJK");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("regionalbloc", "GHIJK")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qxkzhj6dmdrk_v2Regionalbloc() {
		String testResultId = "test_qxkzhj6dmdrk_v2Regionalbloc";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "topLevelDomain,alpha3Code,callingCodes")
				.pathParam("regionalbloc", "USAN")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_urgu25r3qywp_v3All() {
		String testResultId = "test_urgu25r3qywp_v3All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7ftpeprpnw3_v3All() {
		String testResultId = "test_1h7ftpeprpnw3_v3All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qhnckm6tf4gx_v3Alphacode() {
		String testResultId = "test_qhnckm6tf4gx_v3Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value DEF");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value DEF");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("alphacode", "DEF")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4l4ugjcschf_v3Alphacode() {
		String testResultId = "test_t4l4ugjcschf_v3Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("alphacode", "BL")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1k1r79f7z810z_v3Alphacodes() {
		String testResultId = "test_1k1r79f7z810z_v3Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_to1uc7alxxlt_v3Alphacodes() {
		String testResultId = "test_to1uc7alxxlt_v3Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("codes", "WSM,AZE,SWZ")
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "capital,callingCodes,currencies")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qy4h3tpxduue_v3Currency() {
		String testResultId = "test_qy4h3tpxduue_v3Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value PQR");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value PQR");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("currency", "PQR")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_urmeufvpr7zn_v3Currency() {
		String testResultId = "test_urmeufvpr7zn_v3Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "name,region,flag,alpha3Code,gini")
				.pathParam("currency", "BWP")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hraynsv67dr7_v3Name() {
		String testResultId = "test_1hraynsv67dr7_v3Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter name with invalid value Genovia");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter name with invalid value Genovia");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("fullText", "true")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "topLevelDomain,numericCode,subregion,gini,timezones")
				.pathParam("name", "Genovia")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sl9hfjkkcpx5_v3Name() {
		String testResultId = "test_sl9hfjkkcpx5_v3Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("fullText", "false")
				.queryParam("apikey_1", "def")
				.pathParam("name", "Antigua and Barbuda")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_urgskg4jgfa9_v3Capital() {
		String testResultId = "test_urgskg4jgfa9_v3Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value New York");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value New York");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("capital", "New York")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qhq5fwb1tftu_v3Capital() {
		String testResultId = "test_qhq5fwb1tftu_v3Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "region")
				.pathParam("capital", "Paramaribo")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ies769kv3zg7_v3Region() {
		String testResultId = "test_1ies769kv3zg7_v3Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Middle-earth");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Middle-earth");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "name")
				.pathParam("region", "Middle-earth")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/region/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qy4hhwflsajo_v3Region() {
		String testResultId = "test_qy4hhwflsajo_v3Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "currencies,languages")
				.pathParam("region", "Asia")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/region/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iesrfrlxkpk4_v3Subregion() {
		String testResultId = "test_1iesrfrlxkpk4_v3Subregion";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter subregion with invalid value Essos");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter subregion with invalid value Essos");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "nativeName")
				.pathParam("subregion", "Essos")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/subregion/{subregion}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hbjat2koten5_v3Subregion() {
		String testResultId = "test_1hbjat2koten5_v3Subregion";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "regionalBlocs")
				.pathParam("subregion", "Caribbean")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/subregion/{subregion}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbk61tjy9a2f_v3Lang() {
		String testResultId = "test_vbk61tjy9a2f_v3Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value op");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value op");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("lang", "op")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vey62gzeezp0_v3Lang() {
		String testResultId = "test_vey62gzeezp0_v3Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("lang", "kg")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hbm24ksddu0i_v3Demonym() {
		String testResultId = "test_1hbm24ksddu0i_v3Demonym";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter demonym with invalid value spuosiaeno");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter demonym with invalid value spuosiaeno");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("demonym", "spuosiaeno")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/demonym/{demonym}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iyn905cmn9eu_v3Demonym() {
		String testResultId = "test_1iyn905cmn9eu_v3Demonym";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("demonym", "Kazakhstani")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/demonym/{demonym}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhb21mg3yblh_v3Translation() {
		String testResultId = "test_rhb21mg3yblh_v3Translation";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter translation with invalid value Essos");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter translation with invalid value Essos");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("translation", "Essos")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/translation/{translation}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s4v5u1c2ounl_v3Translation() {
		String testResultId = "test_s4v5u1c2ounl_v3Translation";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("translation", "Portugal")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/translation/{translation}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

}

package restcountries;

import org.junit.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.FixMethodOrder;
import static org.junit.Assert.fail;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.junit.Assert.assertTrue;
import org.junit.runners.MethodSorters;
import io.qameta.allure.restassured.AllureRestAssured;
import es.us.isa.restest.testcases.restassured.filters.StatusCode5XXFilter;
import es.us.isa.restest.testcases.restassured.filters.NominalOrFaultyTestCaseFilter;
import es.us.isa.restest.testcases.restassured.filters.StatefulFilter;
import java.io.File;
import es.us.isa.restest.testcases.restassured.filters.ResponseValidationFilter;
import es.us.isa.restest.testcases.restassured.filters.CSVFilter;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RestcountriesTest_1660815106713 {

	private static final String OAI_JSON_URL = "src/test/resources/Restcountries/openapi.yaml";
	private static final StatusCode5XXFilter statusCode5XXFilter = new StatusCode5XXFilter();
	private static final NominalOrFaultyTestCaseFilter nominalOrFaultyTestCaseFilter = new NominalOrFaultyTestCaseFilter();
	private static final ResponseValidationFilter validationFilter = new ResponseValidationFilter(OAI_JSON_URL);
	private static final AllureRestAssured allureFilter = new AllureRestAssured();
	private static final String APIName = "restcountries";
	private static final String testId = "1660815106713";
	private static final CSVFilter csvFilter = new CSVFilter(APIName, testId);

	@BeforeClass
	public static void setUp() {
		RestAssured.baseURI = "https://restcountries.com";

		statusCode5XXFilter.setAPIName(APIName);
		statusCode5XXFilter.setTestId(testId);
		nominalOrFaultyTestCaseFilter.setAPIName(APIName);
		nominalOrFaultyTestCaseFilter.setTestId(testId);
		validationFilter.setAPIName(APIName);
		validationFilter.setTestId(testId);
	}

	@Test
	public void test_trrbezv6p5bm_v2All() {
		String testResultId = "test_trrbezv6p5bm_v2All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ubrxyy593t4p_v2All() {
		String testResultId = "test_ubrxyy593t4p_v2All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "borders")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iunozu07ek3d_v2Alphacode() {
		String testResultId = "test_1iunozu07ek3d_v2Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value ABC");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value ABC");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("alphacode", "ABC")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h823et8jm81e_v2Alphacode() {
		String testResultId = "test_1h823et8jm81e_v2Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "timezones")
				.pathParam("alphacode", "LV")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbsij86bv5md_v2Alphacodes() {
		String testResultId = "test_vbsij86bv5md_v2Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "name,cioc,languages")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rl2bio0r348p_v2Alphacodes() {
		String testResultId = "test_rl2bio0r348p_v2Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("codes", "PRI,LB,GI")
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hb7ntz3377tt_v2Currency() {
		String testResultId = "test_1hb7ntz3377tt_v2Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value ABC");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value ABC");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("currency", "ABC")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sl3xk3ou2rll_v2Currency() {
		String testResultId = "test_sl3xk3ou2rll_v2Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("currency", "ZMW")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hre74da35rvo_v2Name() {
		String testResultId = "test_1hre74da35rvo_v2Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter name with invalid value Narnia");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter name with invalid value Narnia");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "region,gini,capital")
				.pathParam("name", "Narnia")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7x05rejbqrd_v2Name() {
		String testResultId = "test_1h7x05rejbqrd_v2Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "capital")
				.pathParam("name", "The Bahamas")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rl2v2k854g8o_v2Callingcode() {
		String testResultId = "test_rl2v2k854g8o_v2Callingcode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter callingcode with invalid value 89");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter callingcode with invalid value 89");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "name,currencies,alpha2Code")
				.pathParam("callingcode", "89")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_us3ik8mnh1es_v2Callingcode() {
		String testResultId = "test_us3ik8mnh1es_v2Callingcode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "callingCodes")
				.pathParam("callingcode", "673")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u7wwhl2a2wdg_v2Capital() {
		String testResultId = "test_u7wwhl2a2wdg_v2Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Bonn");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Bonn");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("capital", "Bonn")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jent5phiwke1_v2Capital() {
		String testResultId = "test_1jent5phiwke1_v2Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "altSpellings,capital,translations,region,timezones")
				.pathParam("capital", "Basse-Terre")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ibc0sx6hlx0i_v2Region() {
		String testResultId = "test_1ibc0sx6hlx0i_v2Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Atlantis");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Atlantis");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "translations,region")
				.pathParam("region", "Atlantis")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/continent/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_to2a8q2uvs6b_v2Region() {
		String testResultId = "test_to2a8q2uvs6b_v2Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("region", "Oceania")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/continent/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jekzfk5b0dva_v2Lang() {
		String testResultId = "test_1jekzfk5b0dva_v2Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value su");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value su");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "callingCodes")
				.pathParam("lang", "su")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_urmerp8q3dx0_v2Lang() {
		String testResultId = "test_urmerp8q3dx0_v2Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "timezones,population,regionalBlocs")
				.pathParam("lang", "mi")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jy26shg0gpyd_v2Regionalbloc() {
		String testResultId = "test_1jy26shg0gpyd_v2Regionalbloc";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter regionalbloc with invalid value ABC");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter regionalbloc with invalid value ABC");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "demonym")
				.pathParam("regionalbloc", "ABC")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ubrgtv8k1ulv_v2Regionalbloc() {
		String testResultId = "test_ubrgtv8k1ulv_v2Regionalbloc";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "altSpellings")
				.pathParam("regionalbloc", "AU")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s1h6numpyss4_v3All() {
		String testResultId = "test_s1h6numpyss4_v3All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_tol7l17p80h2_v3All() {
		String testResultId = "test_tol7l17p80h2_v3All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "borders")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_uruppp0l1ovp_v3Alphacode() {
		String testResultId = "test_uruppp0l1ovp_v3Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value YZ");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value YZ");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("alphacode", "YZ")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hblkyy554k10_v3Alphacode() {
		String testResultId = "test_1hblkyy554k10_v3Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "altSpellings,capital,latlng,flag")
				.pathParam("alphacode", "GRL")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sl6504ymmycl_v3Alphacodes() {
		String testResultId = "test_sl6504ymmycl_v3Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vb3k8tdi9hkn_v3Alphacodes() {
		String testResultId = "test_vb3k8tdi9hkn_v3Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("codes", "478")
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s15keaa8vt4k_v3Currency() {
		String testResultId = "test_s15keaa8vt4k_v3Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value GHI");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value GHI");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "currencies,demonym")
				.pathParam("currency", "GHI")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t86we3slsmcx_v3Currency() {
		String testResultId = "test_t86we3slsmcx_v3Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "languages,latlng,nativeName")
				.pathParam("currency", "AED")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qhnu3vtfhkde_v3Name() {
		String testResultId = "test_qhnu3vtfhkde_v3Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter name with invalid value Gilead");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter name with invalid value Gilead");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "cioc,altSpellings,region")
				.pathParam("name", "Gilead")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s13cht1ifoma_v3Name() {
		String testResultId = "test_s13cht1ifoma_v3Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("name", "Colombia")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ubgd0ol8msdv_v3Capital() {
		String testResultId = "test_ubgd0ol8msdv_v3Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Lyon");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Lyon");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "cioc,subregion")
				.pathParam("capital", "Lyon")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_trqunq601mqp_v3Capital() {
		String testResultId = "test_trqunq601mqp_v3Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "nativeName,timezones,subregion,alpha2Code,numericCode")
				.pathParam("capital", "Bamako")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_skv3x05xffas_v3Region() {
		String testResultId = "test_skv3x05xffas_v3Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Essos");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Essos");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("region", "Essos")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/region/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qxkzvy2q8110_v3Region() {
		String testResultId = "test_qxkzvy2q8110_v3Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "borders,subregion")
				.pathParam("region", "Americas")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/region/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ji9zwhzpjxo4_v3Subregion() {
		String testResultId = "test_1ji9zwhzpjxo4_v3Subregion";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter subregion with invalid value Westeros");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter subregion with invalid value Westeros");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("subregion", "Westeros")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/subregion/{subregion}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qxqm5xun669i_v3Subregion() {
		String testResultId = "test_qxqm5xun669i_v3Subregion";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("subregion", "Northern America")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/subregion/{subregion}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbf5zjdvkk6u_v3Lang() {
		String testResultId = "test_vbf5zjdvkk6u_v3Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value op");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value op");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "nativeName")
				.pathParam("lang", "op")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hv88d2rtfub8_v3Lang() {
		String testResultId = "test_1hv88d2rtfub8_v3Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "name")
				.pathParam("lang", "nr")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_to2api88kmsk_v3Demonym() {
		String testResultId = "test_to2api88kmsk_v3Demonym";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter demonym with invalid value skeianian");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter demonym with invalid value skeianian");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "region,numericCode")
				.pathParam("demonym", "skeianian")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/demonym/{demonym}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qeco4cafnlmg_v3Demonym() {
		String testResultId = "test_qeco4cafnlmg_v3Demonym";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("demonym", "Mexican")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/demonym/{demonym}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hv2ofbzwseup_v3Translation() {
		String testResultId = "test_1hv2ofbzwseup_v3Translation";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter translation with invalid value Essos");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter translation with invalid value Essos");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "regionalBlocs,cioc")
				.pathParam("translation", "Essos")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/translation/{translation}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ji1owgvglq2e_v3Translation() {
		String testResultId = "test_1ji1owgvglq2e_v3Translation";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("translation", "United Stats")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/translation/{translation}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

}

package restcountries;

import org.junit.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.FixMethodOrder;
import static org.junit.Assert.fail;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.junit.Assert.assertTrue;
import org.junit.runners.MethodSorters;
import io.qameta.allure.restassured.AllureRestAssured;
import es.us.isa.restest.testcases.restassured.filters.StatusCode5XXFilter;
import es.us.isa.restest.testcases.restassured.filters.NominalOrFaultyTestCaseFilter;
import es.us.isa.restest.testcases.restassured.filters.StatefulFilter;
import java.io.File;
import es.us.isa.restest.testcases.restassured.filters.ResponseValidationFilter;
import es.us.isa.restest.testcases.restassured.filters.CSVFilter;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RestcountriesTest_1660815157947 {

	private static final String OAI_JSON_URL = "src/test/resources/Restcountries/openapi.yaml";
	private static final StatusCode5XXFilter statusCode5XXFilter = new StatusCode5XXFilter();
	private static final NominalOrFaultyTestCaseFilter nominalOrFaultyTestCaseFilter = new NominalOrFaultyTestCaseFilter();
	private static final ResponseValidationFilter validationFilter = new ResponseValidationFilter(OAI_JSON_URL);
	private static final AllureRestAssured allureFilter = new AllureRestAssured();
	private static final String APIName = "restcountries";
	private static final String testId = "1660815157947";
	private static final CSVFilter csvFilter = new CSVFilter(APIName, testId);

	@BeforeClass
	public static void setUp() {
		RestAssured.baseURI = "https://restcountries.com";

		statusCode5XXFilter.setAPIName(APIName);
		statusCode5XXFilter.setTestId(testId);
		nominalOrFaultyTestCaseFilter.setAPIName(APIName);
		nominalOrFaultyTestCaseFilter.setTestId(testId);
		validationFilter.setAPIName(APIName);
		validationFilter.setTestId(testId);
	}

	@Test
	public void test_ubp6l51nzw4k_v2All() {
		String testResultId = "test_ubp6l51nzw4k_v2All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hbaxjdjjxaw2_v2All() {
		String testResultId = "test_1hbaxjdjjxaw2_v2All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rl02io7iopbr_v2Alphacode() {
		String testResultId = "test_rl02io7iopbr_v2Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value DEF");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value DEF");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("alphacode", "DEF")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u82ddls7okdw_v2Alphacode() {
		String testResultId = "test_u82ddls7okdw_v2Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "flag,cioc")
				.pathParam("alphacode", "DK")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iuy7rgt3mhiv_v2Alphacodes() {
		String testResultId = "test_1iuy7rgt3mhiv_v2Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4sx2loese3n_v2Alphacodes() {
		String testResultId = "test_t4sx2loese3n_v2Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("codes", "GHA,MG,NP")
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ts1y5g358jmq_v2Currency() {
		String testResultId = "test_ts1y5g358jmq_v2Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value GHI");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value GHI");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("currency", "GHI")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_tnzjblkgk112_v2Currency() {
		String testResultId = "test_tnzjblkgk112_v2Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("currency", "PYG")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jyb17f9sd3s4_v2Name() {
		String testResultId = "test_1jyb17f9sd3s4_v2Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Changed value of boolean parameter fullText from 'false' to number '8111.805800224123'");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Changed value of boolean parameter fullText from 'false' to number '8111.805800224123'");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("fullText", "8111.805800224123")
				.queryParam("apikey_1", "abc")
				.pathParam("name", "Nepal")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hbd85omkkrqb_v2Name() {
		String testResultId = "test_1hbd85omkkrqb_v2Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("fullText", "false")
				.queryParam("apikey_1", "def")
				.pathParam("name", "Malaysia")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rl8fec64oz74_v2Callingcode() {
		String testResultId = "test_rl8fec64oz74_v2Callingcode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter callingcode with invalid value 210");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter callingcode with invalid value 210");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "numericCode,area")
				.pathParam("callingcode", "210")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbngzk6fbdye_v2Callingcode() {
		String testResultId = "test_vbngzk6fbdye_v2Callingcode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "latlng")
				.pathParam("callingcode", "90")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ji1q56vc8okl_v2Capital() {
		String testResultId = "test_1ji1q56vc8okl_v2Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Faro");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Faro");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("capital", "Faro")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iykjygxpia8y_v2Capital() {
		String testResultId = "test_1iykjygxpia8y_v2Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "languages,altSpellings,name")
				.pathParam("capital", "West Island")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qe9f75nkfgvs_v2Region() {
		String testResultId = "test_qe9f75nkfgvs_v2Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Essos");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Essos");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "regionalBlocs")
				.pathParam("region", "Essos")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/continent/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_r1lmvfv24she_v2Region() {
		String testResultId = "test_r1lmvfv24she_v2Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "area,name")
				.pathParam("region", "Americas")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/continent/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_uv94mbleukhh_v2Lang() {
		String testResultId = "test_uv94mbleukhh_v2Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value ef");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value ef");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "numericCode,regionalBlocs")
				.pathParam("lang", "ef")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iv3s38mzgns2_v2Lang() {
		String testResultId = "test_1iv3s38mzgns2_v2Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("lang", "ga")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_toa40s4t2bzn_v2Regionalbloc() {
		String testResultId = "test_toa40s4t2bzn_v2Regionalbloc";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter regionalbloc with invalid value GHIJK");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter regionalbloc with invalid value GHIJK");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "gini,capital,languages")
				.pathParam("regionalbloc", "GHIJK")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qxr2x5jqo27q_v2Regionalbloc() {
		String testResultId = "test_qxr2x5jqo27q_v2Regionalbloc";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("regionalbloc", "NAFTA")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4hvlfq2zigj_v3All() {
		String testResultId = "test_t4hvlfq2zigj_v3All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "topLevelDomain,nativeName")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_r1ieej95c3ld_v3All() {
		String testResultId = "test_r1ieej95c3ld_v3All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "nativeName,flag")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_us2yaoxp63p4_v3Alphacode() {
		String testResultId = "test_us2yaoxp63p4_v3Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value DEF");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value DEF");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("alphacode", "DEF")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qxfgcad7gw1c_v3Alphacode() {
		String testResultId = "test_qxfgcad7gw1c_v3Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "numericCode,topLevelDomain,translations,latlng,altSpellings")
				.pathParam("alphacode", "BY")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_r1low0915dnp_v3Alphacodes() {
		String testResultId = "test_r1low0915dnp_v3Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "region,gini")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhrnzm457syp_v3Alphacodes() {
		String testResultId = "test_rhrnzm457syp_v3Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("codes", "LS")
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "alpha2Code,borders")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qe13jxjx9cfn_v3Currency() {
		String testResultId = "test_qe13jxjx9cfn_v3Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value NAR");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value NAR");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "translations")
				.pathParam("currency", "NAR")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_urgtqdjqonjn_v3Currency() {
		String testResultId = "test_urgtqdjqonjn_v3Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "population,latlng")
				.pathParam("currency", "Peso")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhajew7iur78_v3Name() {
		String testResultId = "test_rhajew7iur78_v3Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter name with invalid value Narnia");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter name with invalid value Narnia");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("fullText", "false")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "languages")
				.pathParam("name", "Narnia")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7intguj5c8o_v3Name() {
		String testResultId = "test_1h7intguj5c8o_v3Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("fullText", "true")
				.queryParam("apikey_1", "def")
				.pathParam("name", "Bonaire")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rkzjch7bdp42_v3Capital() {
		String testResultId = "test_rkzjch7bdp42_v3Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Vladivostok");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Vladivostok");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("capital", "Vladivostok")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hrmiu47nc7y1_v3Capital() {
		String testResultId = "test_1hrmiu47nc7y1_v3Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "name,translations")
				.pathParam("capital", "Madrid")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbpp71ypi4oj_v3Region() {
		String testResultId = "test_vbpp71ypi4oj_v3Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Middle-earth");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Middle-earth");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("region", "Middle-earth")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/region/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jyg19lwjwkkz_v3Region() {
		String testResultId = "test_1jyg19lwjwkkz_v3Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "area,cioc")
				.pathParam("region", "Europe")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/region/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iv1k6vehbd5t_v3Subregion() {
		String testResultId = "test_1iv1k6vehbd5t_v3Subregion";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter subregion with invalid value Middle-earth");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter subregion with invalid value Middle-earth");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("subregion", "Middle-earth")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/subregion/{subregion}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_r1ic2alb6vci_v3Subregion() {
		String testResultId = "test_r1ic2alb6vci_v3Subregion";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "capital")
				.pathParam("subregion", "Northern Africa")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/subregion/{subregion}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jifk8lrw7y3n_v3Lang() {
		String testResultId = "test_1jifk8lrw7y3n_v3Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value qr");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value qr");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "area,borders")
				.pathParam("lang", "qr")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s18uhcc4co50_v3Lang() {
		String testResultId = "test_s18uhcc4co50_v3Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("lang", "fi")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s18ewfspuder_v3Demonym() {
		String testResultId = "test_s18ewfspuder_v3Demonym";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter demonym with invalid value ofrainard");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter demonym with invalid value ofrainard");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "altSpellings,topLevelDomain")
				.pathParam("demonym", "ofrainard")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/demonym/{demonym}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ji1owayd6rll_v3Demonym() {
		String testResultId = "test_1ji1owayd6rll_v3Demonym";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "demonym")
				.pathParam("demonym", "East Timorese")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/demonym/{demonym}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ibjskajt8nqv_v3Translation() {
		String testResultId = "test_1ibjskajt8nqv_v3Translation";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter translation with invalid value Westeros");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter translation with invalid value Westeros");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "capital,region,translations")
				.pathParam("translation", "Westeros")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/translation/{translation}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hravh4t76vs5_v3Translation() {
		String testResultId = "test_1hravh4t76vs5_v3Translation";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "regionalBlocs")
				.pathParam("translation", "Argentinien")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/translation/{translation}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

}

package restcountries;

import org.junit.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.FixMethodOrder;
import static org.junit.Assert.fail;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.junit.Assert.assertTrue;
import org.junit.runners.MethodSorters;
import io.qameta.allure.restassured.AllureRestAssured;
import es.us.isa.restest.testcases.restassured.filters.StatusCode5XXFilter;
import es.us.isa.restest.testcases.restassured.filters.NominalOrFaultyTestCaseFilter;
import es.us.isa.restest.testcases.restassured.filters.StatefulFilter;
import java.io.File;
import es.us.isa.restest.testcases.restassured.filters.ResponseValidationFilter;
import es.us.isa.restest.testcases.restassured.filters.CSVFilter;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RestcountriesTest_1660815199053 {

	private static final String OAI_JSON_URL = "src/test/resources/Restcountries/openapi.yaml";
	private static final StatusCode5XXFilter statusCode5XXFilter = new StatusCode5XXFilter();
	private static final NominalOrFaultyTestCaseFilter nominalOrFaultyTestCaseFilter = new NominalOrFaultyTestCaseFilter();
	private static final ResponseValidationFilter validationFilter = new ResponseValidationFilter(OAI_JSON_URL);
	private static final AllureRestAssured allureFilter = new AllureRestAssured();
	private static final String APIName = "restcountries";
	private static final String testId = "1660815199053";
	private static final CSVFilter csvFilter = new CSVFilter(APIName, testId);

	@BeforeClass
	public static void setUp() {
		RestAssured.baseURI = "https://restcountries.com";

		statusCode5XXFilter.setAPIName(APIName);
		statusCode5XXFilter.setTestId(testId);
		nominalOrFaultyTestCaseFilter.setAPIName(APIName);
		nominalOrFaultyTestCaseFilter.setTestId(testId);
		validationFilter.setAPIName(APIName);
		validationFilter.setTestId(testId);
	}

	@Test
	public void test_vf1e7tmtyed5_v2All() {
		String testResultId = "test_vf1e7tmtyed5_v2All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "area")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1k201zny93n1d_v2All() {
		String testResultId = "test_1k201zny93n1d_v2All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hbfyrh5now1l_v2Alphacode() {
		String testResultId = "test_1hbfyrh5now1l_v2Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value DEF");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value DEF");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("alphacode", "DEF")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_trqt6c1gmud1_v2Alphacode() {
		String testResultId = "test_trqt6c1gmud1_v2Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("alphacode", "KWT")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s13bpt5rclrt_v2Alphacodes() {
		String testResultId = "test_s13bpt5rclrt_v2Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7inr01mtq3n_v2Alphacodes() {
		String testResultId = "test_1h7inr01mtq3n_v2Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("codes", "ID,DK,PY")
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "area")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_to7aro3rs6yg_v2Currency() {
		String testResultId = "test_to7aro3rs6yg_v2Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value YZA");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value YZA");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "borders,area")
				.pathParam("currency", "YZA")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hv8rj7trzrqo_v2Currency() {
		String testResultId = "test_1hv8rj7trzrqo_v2Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "gini")
				.pathParam("currency", "GTQ")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ieq020ifkz7a_v2Name() {
		String testResultId = "test_1ieq020ifkz7a_v2Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Changed value of boolean parameter fullText from 'true' to string 'PNbhpPrQxYTOVqMPa'");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Changed value of boolean parameter fullText from 'true' to string 'PNbhpPrQxYTOVqMPa'");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("fullText", "PNbhpPrQxYTOVqMPa")
				.queryParam("apikey_1", "abc")
				.pathParam("name", "Zimbabwe")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u85o985pyg6e_v2Name() {
		String testResultId = "test_u85o985pyg6e_v2Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("name", "Antarctica")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vf45lsbt446v_v2Callingcode() {
		String testResultId = "test_vf45lsbt446v_v2Callingcode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter callingcode with invalid value 999");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter callingcode with invalid value 999");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("callingcode", "999")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_urhcg318mxpz_v2Callingcode() {
		String testResultId = "test_urhcg318mxpz_v2Callingcode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("callingcode", "387")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jxzxsfococom_v2Capital() {
		String testResultId = "test_1jxzxsfococom_v2Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Bonn");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Bonn");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("capital", "Bonn")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s18wiatmoswx_v2Capital() {
		String testResultId = "test_s18wiatmoswx_v2Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("capital", "Nouakchott")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iupyud6d5po9_v2Region() {
		String testResultId = "test_1iupyud6d5po9_v2Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Middle-earth");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Middle-earth");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("region", "Middle-earth")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/continent/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_tonyyzv3z1wl_v2Region() {
		String testResultId = "test_tonyyzv3z1wl_v2Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("region", "Africa")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/continent/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u7oiiekvj8me_v2Lang() {
		String testResultId = "test_u7oiiekvj8me_v2Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value gh");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value gh");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "subregion")
				.pathParam("lang", "gh")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vf1dtoksz5ut_v2Lang() {
		String testResultId = "test_vf1dtoksz5ut_v2Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "altSpellings,regionalBlocs")
				.pathParam("lang", "ff")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u7u35gvwwiuc_v2Regionalbloc() {
		String testResultId = "test_u7u35gvwwiuc_v2Regionalbloc";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter regionalbloc with invalid value Galactic Empire");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter regionalbloc with invalid value Galactic Empire");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "altSpellings")
				.pathParam("regionalbloc", "Galactic Empire")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_skvlrudfs3fp_v2Regionalbloc() {
		String testResultId = "test_skvlrudfs3fp_v2Regionalbloc";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "flag")
				.pathParam("regionalbloc", "ASEAN")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iun6lp71fuqp_v3All() {
		String testResultId = "test_1iun6lp71fuqp_v3All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qy4hf1te2ud2_v3All() {
		String testResultId = "test_qy4hf1te2ud2_v3All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_urpnp9cu16wg_v3Alphacode() {
		String testResultId = "test_urpnp9cu16wg_v3Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value ABC");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value ABC");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("alphacode", "ABC")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhr5zc6nhfsm_v3Alphacode() {
		String testResultId = "test_rhr5zc6nhfsm_v3Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("alphacode", "SV")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_skxwscwpu3c5_v3Alphacodes() {
		String testResultId = "test_skxwscwpu3c5_v3Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "callingCodes,region")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hb7o7zteuq90_v3Alphacodes() {
		String testResultId = "test_1hb7o7zteuq90_v3Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("codes", "826")
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rh5iw3qxrjhh_v3Currency() {
		String testResultId = "test_rh5iw3qxrjhh_v3Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value ABC");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value ABC");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "nativeName")
				.pathParam("currency", "ABC")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qeeyr19rylwl_v3Currency() {
		String testResultId = "test_qeeyr19rylwl_v3Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "nativeName,cioc")
				.pathParam("currency", "Dinar")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ibjtt6vq0rqd_v3Name() {
		String testResultId = "test_1ibjtt6vq0rqd_v3Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Changed value of boolean parameter fullText from 'null' to string 'vzGSQYxtTOOxSk'");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Changed value of boolean parameter fullText from 'null' to string 'vzGSQYxtTOOxSk'");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("fullText", "vzGSQYxtTOOxSk")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "demonym")
				.pathParam("name", "Montenegro")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s1dy4j5a4yev_v3Name() {
		String testResultId = "test_s1dy4j5a4yev_v3Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("name", "Senegal")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qxiaio343vqc_v3Capital() {
		String testResultId = "test_qxiaio343vqc_v3Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Barcelona");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Barcelona");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("capital", "Barcelona")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iepfebr02o2u_v3Capital() {
		String testResultId = "test_1iepfebr02o2u_v3Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("capital", "Nuuk")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhuh8pf1vgvq_v3Region() {
		String testResultId = "test_rhuh8pf1vgvq_v3Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Westeros");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Westeros");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "demonym,name,latlng")
				.pathParam("region", "Westeros")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/region/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_uvbcwi27j2nk_v3Region() {
		String testResultId = "test_uvbcwi27j2nk_v3Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("region", "Polar")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/region/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ubj56r1l0ier_v3Subregion() {
		String testResultId = "test_ubj56r1l0ier_v3Subregion";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter subregion with invalid value Essos");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter subregion with invalid value Essos");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("subregion", "Essos")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/subregion/{subregion}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jecmjobmlfe9_v3Subregion() {
		String testResultId = "test_1jecmjobmlfe9_v3Subregion";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "alpha3Code,alpha2Code,altSpellings")
				.pathParam("subregion", "South America")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/subregion/{subregion}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iepfsh5yzvqb_v3Lang() {
		String testResultId = "test_1iepfsh5yzvqb_v3Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value ef");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value ef");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "topLevelDomain")
				.pathParam("lang", "ef")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vf9pm1ids9k4_v3Lang() {
		String testResultId = "test_vf9pm1ids9k4_v3Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "subregion")
				.pathParam("lang", "it")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rlb73l8svqrb_v3Demonym() {
		String testResultId = "test_rlb73l8svqrb_v3Demonym";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter demonym with invalid value uwhusiot");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter demonym with invalid value uwhusiot");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "alpha2Code")
				.pathParam("demonym", "uwhusiot")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/demonym/{demonym}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_uve5s8ndjn05_v3Demonym() {
		String testResultId = "test_uve5s8ndjn05_v3Demonym";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "demonym,area")
				.pathParam("demonym", "Solomon Islander")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/demonym/{demonym}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1if0ivs67rbqq_v3Translation() {
		String testResultId = "test_1if0ivs67rbqq_v3Translation";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter translation with invalid value Westeros");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter translation with invalid value Westeros");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("translation", "Westeros")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/translation/{translation}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rlb6bdh5nc6e_v3Translation() {
		String testResultId = "test_rlb6bdh5nc6e_v3Translation";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("translation", "Lituania")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/translation/{translation}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

}

package restcountries;

import org.junit.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.FixMethodOrder;
import static org.junit.Assert.fail;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.junit.Assert.assertTrue;
import org.junit.runners.MethodSorters;
import io.qameta.allure.restassured.AllureRestAssured;
import es.us.isa.restest.testcases.restassured.filters.StatusCode5XXFilter;
import es.us.isa.restest.testcases.restassured.filters.NominalOrFaultyTestCaseFilter;
import es.us.isa.restest.testcases.restassured.filters.StatefulFilter;
import java.io.File;
import es.us.isa.restest.testcases.restassured.filters.ResponseValidationFilter;
import es.us.isa.restest.testcases.restassured.filters.CSVFilter;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RestcountriesTest_1660815268218 {

	private static final String OAI_JSON_URL = "src/test/resources/Restcountries/openapi.yaml";
	private static final StatusCode5XXFilter statusCode5XXFilter = new StatusCode5XXFilter();
	private static final NominalOrFaultyTestCaseFilter nominalOrFaultyTestCaseFilter = new NominalOrFaultyTestCaseFilter();
	private static final ResponseValidationFilter validationFilter = new ResponseValidationFilter(OAI_JSON_URL);
	private static final AllureRestAssured allureFilter = new AllureRestAssured();
	private static final String APIName = "restcountries";
	private static final String testId = "1660815268218";
	private static final CSVFilter csvFilter = new CSVFilter(APIName, testId);

	@BeforeClass
	public static void setUp() {
		RestAssured.baseURI = "https://restcountries.com";

		statusCode5XXFilter.setAPIName(APIName);
		statusCode5XXFilter.setTestId(testId);
		nominalOrFaultyTestCaseFilter.setAPIName(APIName);
		nominalOrFaultyTestCaseFilter.setTestId(testId);
		validationFilter.setAPIName(APIName);
		validationFilter.setTestId(testId);
	}

	@Test
	public void test_to7ea0221nax_v2All() {
		String testResultId = "test_to7ea0221nax_v2All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_r1lot9k3w5er_v2All() {
		String testResultId = "test_r1lot9k3w5er_v2All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "topLevelDomain,name,nativeName")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qxywbfncr1b9_v2Alphacode() {
		String testResultId = "test_qxywbfncr1b9_v2Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value JK");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value JK");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "numericCode")
				.pathParam("alphacode", "JK")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hux4vso321r5_v2Alphacode() {
		String testResultId = "test_1hux4vso321r5_v2Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("alphacode", "HRV")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iukettf5vh2u_v2Alphacodes() {
		String testResultId = "test_1iukettf5vh2u_v2Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "latlng")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sof4n44m85kp_v2Alphacodes() {
		String testResultId = "test_sof4n44m85kp_v2Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("codes", "DNK")
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "latlng")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qec6l2093bcg_v2Currency() {
		String testResultId = "test_qec6l2093bcg_v2Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value GHI");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value GHI");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "currencies")
				.pathParam("currency", "GHI")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qdysuzoxhdth_v2Currency() {
		String testResultId = "test_qdysuzoxhdth_v2Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("currency", "HTG")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sl8x61vr8egh_v2Name() {
		String testResultId = "test_sl8x61vr8egh_v2Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Changed value of boolean parameter fullText from 'null' to integer '6549'");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Changed value of boolean parameter fullText from 'null' to integer '6549'");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("fullText", "6549")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "regionalBlocs,topLevelDomain")
				.pathParam("name", "New Zealand")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_r17u0hkbyjqd_v2Name() {
		String testResultId = "test_r17u0hkbyjqd_v2Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("name", "Egypt")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ib0fdtv5cti9_v2Callingcode() {
		String testResultId = "test_1ib0fdtv5cti9_v2Callingcode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter callingcode with invalid value 322");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter callingcode with invalid value 322");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("callingcode", "322")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iyi8jvn50x13_v2Callingcode() {
		String testResultId = "test_1iyi8jvn50x13_v2Callingcode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("callingcode", "597")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4ht6vuyslet_v2Capital() {
		String testResultId = "test_t4ht6vuyslet_v2Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Vladivostok");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Vladivostok");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("capital", "Vladivostok")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iauvrjt0dlcz_v2Capital() {
		String testResultId = "test_1iauvrjt0dlcz_v2Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("capital", "Saint Helier")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ib35lt54dhlw_v2Region() {
		String testResultId = "test_1ib35lt54dhlw_v2Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Westeros");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Westeros");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "alpha2Code")
				.pathParam("region", "Westeros")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/continent/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ure1kqv2wy8x_v2Region() {
		String testResultId = "test_ure1kqv2wy8x_v2Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("region", "Asia")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/continent/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hv8r2k1hs9bk_v2Lang() {
		String testResultId = "test_1hv8r2k1hs9bk_v2Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value nm");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value nm");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "cioc,borders,demonym")
				.pathParam("lang", "nm")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hbj8urh0zkh0_v2Lang() {
		String testResultId = "test_1hbj8urh0zkh0_v2Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("lang", "az")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hv8r2jzll5x1_v2Regionalbloc() {
		String testResultId = "test_1hv8r2jzll5x1_v2Regionalbloc";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter regionalbloc with invalid value DEF");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter regionalbloc with invalid value DEF");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "capital,nativeName,borders,numericCode")
				.pathParam("regionalbloc", "DEF")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sok50srzwig2_v2Regionalbloc() {
		String testResultId = "test_sok50srzwig2_v2Regionalbloc";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "flag")
				.pathParam("regionalbloc", "USAN")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1k253au397n1e_v3All() {
		String testResultId = "test_1k253au397n1e_v3All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "latlng,topLevelDomain")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s0x9xa3f9ru9_v3All() {
		String testResultId = "test_s0x9xa3f9ru9_v3All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "alpha3Code")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hbir90efygyq_v3Alphacode() {
		String testResultId = "test_1hbir90efygyq_v3Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value JK");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value JK");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("alphacode", "JK")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jifizxoli9no_v3Alphacode() {
		String testResultId = "test_1jifizxoli9no_v3Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("alphacode", "KOS")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s4m9uzdhdc8o_v3Alphacodes() {
		String testResultId = "test_s4m9uzdhdc8o_v3Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "currencies")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbcelavuxelx_v3Alphacodes() {
		String testResultId = "test_vbcelavuxelx_v3Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("codes", "FIJ,NCG,398")
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "borders,region")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhg42adaspyd_v3Currency() {
		String testResultId = "test_rhg42adaspyd_v3Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value YZA");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value YZA");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("currency", "YZA")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhm3z4ogi6gg_v3Currency() {
		String testResultId = "test_rhm3z4ogi6gg_v3Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "borders")
				.pathParam("currency", "NAD")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbcdvyzdm2qp_v3Name() {
		String testResultId = "test_vbcdvyzdm2qp_v3Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Changed value of boolean parameter fullText from 'null' to number '5748.851723648194'");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Changed value of boolean parameter fullText from 'null' to number '5748.851723648194'");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("fullText", "5748.851723648194")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "demonym,numericCode,gini,alpha3Code,region")
				.pathParam("name", "Marshall Islands")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_r1dbxdp54go6_v3Name() {
		String testResultId = "test_r1dbxdp54go6_v3Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "altSpellings")
				.pathParam("name", "Tunisia")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_urpnawc8cmr4_v3Capital() {
		String testResultId = "test_urpnawc8cmr4_v3Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Los Angeles");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Los Angeles");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "alpha3Code,area,timezones,population")
				.pathParam("capital", "Los Angeles")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hv5hu0z80dph_v3Capital() {
		String testResultId = "test_1hv5hu0z80dph_v3Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "alpha3Code")
				.pathParam("capital", "Bissau")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ies9g1qoit0m_v3Region() {
		String testResultId = "test_1ies9g1qoit0m_v3Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Middle-earth");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Middle-earth");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("region", "Middle-earth")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/region/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbnhb4vbbuba_v3Region() {
		String testResultId = "test_vbnhb4vbbuba_v3Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("region", "Polar")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/region/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jel0o8l38ylv_v3Subregion() {
		String testResultId = "test_1jel0o8l38ylv_v3Subregion";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter subregion with invalid value Atlantis");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter subregion with invalid value Atlantis");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("subregion", "Atlantis")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/subregion/{subregion}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ibesz0ev1dtc_v3Subregion() {
		String testResultId = "test_1ibesz0ev1dtc_v3Subregion";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("subregion", "Caribbean")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/subregion/{subregion}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_to1sp6c9ikae_v3Lang() {
		String testResultId = "test_to1sp6c9ikae_v3Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value su");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value su");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "alpha2Code")
				.pathParam("lang", "su")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_too0556zqecw_v3Lang() {
		String testResultId = "test_too0556zqecw_v3Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("lang", "ur")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qhib9nz216xx_v3Demonym() {
		String testResultId = "test_qhib9nz216xx_v3Demonym";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter demonym with invalid value qasweasque");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter demonym with invalid value qasweasque");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "callingCodes")
				.pathParam("demonym", "qasweasque")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/demonym/{demonym}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t8fpyce2kppw_v3Demonym() {
		String testResultId = "test_t8fpyce2kppw_v3Demonym";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "flag")
				.pathParam("demonym", "Congolese")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/demonym/{demonym}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s1dvedevbtww_v3Translation() {
		String testResultId = "test_s1dvedevbtww_v3Translation";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter translation with invalid value Westeros");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter translation with invalid value Westeros");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("translation", "Westeros")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/translation/{translation}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vf1elmuuaipd_v3Translation() {
		String testResultId = "test_vf1elmuuaipd_v3Translation";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("translation", "Mexique")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/translation/{translation}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

}

package restcountries;

import org.junit.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.FixMethodOrder;
import static org.junit.Assert.fail;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.junit.Assert.assertTrue;
import org.junit.runners.MethodSorters;
import io.qameta.allure.restassured.AllureRestAssured;
import es.us.isa.restest.testcases.restassured.filters.StatusCode5XXFilter;
import es.us.isa.restest.testcases.restassured.filters.NominalOrFaultyTestCaseFilter;
import es.us.isa.restest.testcases.restassured.filters.StatefulFilter;
import java.io.File;
import es.us.isa.restest.testcases.restassured.filters.ResponseValidationFilter;
import es.us.isa.restest.testcases.restassured.filters.CSVFilter;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RestcountriesTest_1660815316233 {

	private static final String OAI_JSON_URL = "src/test/resources/Restcountries/openapi.yaml";
	private static final StatusCode5XXFilter statusCode5XXFilter = new StatusCode5XXFilter();
	private static final NominalOrFaultyTestCaseFilter nominalOrFaultyTestCaseFilter = new NominalOrFaultyTestCaseFilter();
	private static final ResponseValidationFilter validationFilter = new ResponseValidationFilter(OAI_JSON_URL);
	private static final AllureRestAssured allureFilter = new AllureRestAssured();
	private static final String APIName = "restcountries";
	private static final String testId = "1660815316233";
	private static final CSVFilter csvFilter = new CSVFilter(APIName, testId);

	@BeforeClass
	public static void setUp() {
		RestAssured.baseURI = "https://restcountries.com";

		statusCode5XXFilter.setAPIName(APIName);
		statusCode5XXFilter.setTestId(testId);
		nominalOrFaultyTestCaseFilter.setAPIName(APIName);
		nominalOrFaultyTestCaseFilter.setTestId(testId);
		validationFilter.setAPIName(APIName);
		validationFilter.setTestId(testId);
	}

	@Test
	public void test_vb95a15ru5o8_v2All() {
		String testResultId = "test_vb95a15ru5o8_v2All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "currencies")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_urgug8u3kj07_v2All() {
		String testResultId = "test_urgug8u3kj07_v2All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "name")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u7ruh9p4nxia_v2Alphacode() {
		String testResultId = "test_u7ruh9p4nxia_v2Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value YZ");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value YZ");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "languages,nativeName")
				.pathParam("alphacode", "YZ")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sknbp0xmw94m_v2Alphacode() {
		String testResultId = "test_sknbp0xmw94m_v2Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "callingCodes,borders")
				.pathParam("alphacode", "MNE")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhjc9tlp45lx_v2Alphacodes() {
		String testResultId = "test_rhjc9tlp45lx_v2Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t8fpykaz9wf7_v2Alphacodes() {
		String testResultId = "test_t8fpykaz9wf7_v2Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("codes", "SD,SK")
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ubgck4df1p2u_v2Currency() {
		String testResultId = "test_ubgck4df1p2u_v2Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value YZA");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value YZA");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "flag,region")
				.pathParam("currency", "YZA")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jy4wosstzhva_v2Currency() {
		String testResultId = "test_1jy4wosstzhva_v2Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "area")
				.pathParam("currency", "ZMW")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qxtdjibgwn5e_v2Name() {
		String testResultId = "test_qxtdjibgwn5e_v2Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter name with invalid value Lilliput");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter name with invalid value Lilliput");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("name", "Lilliput")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4qo03574swy_v2Name() {
		String testResultId = "test_t4qo03574swy_v2Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("fullText", "false")
				.queryParam("apikey_1", "def")
				.pathParam("name", "Haiti")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jer2gvm9n7sl_v2Callingcode() {
		String testResultId = "test_1jer2gvm9n7sl_v2Callingcode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter callingcode with invalid value 21");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter callingcode with invalid value 21");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("callingcode", "21")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_uv8koa8yfk8j_v2Callingcode() {
		String testResultId = "test_uv8koa8yfk8j_v2Callingcode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("callingcode", "353")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iupzjqp6723q_v2Capital() {
		String testResultId = "test_1iupzjqp6723q_v2Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Teruel");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Teruel");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("capital", "Teruel")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_uvk81f4ybbqq_v2Capital() {
		String testResultId = "test_uvk81f4ybbqq_v2Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "alpha2Code")
				.pathParam("capital", "Pago Pago")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ib986koaz2hu_v2Region() {
		String testResultId = "test_1ib986koaz2hu_v2Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Middle-earth");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Middle-earth");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("region", "Middle-earth")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/continent/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iuqf7jf0gego_v2Region() {
		String testResultId = "test_1iuqf7jf0gego_v2Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("region", "Oceania")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/continent/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jetu8p2wmsf7_v2Lang() {
		String testResultId = "test_1jetu8p2wmsf7_v2Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value ef");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value ef");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "latlng,regionalBlocs,area,altSpellings,gini")
				.pathParam("lang", "ef")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ib5zpro0mc12_v2Lang() {
		String testResultId = "test_1ib5zpro0mc12_v2Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("lang", "mk")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_urhc1vnsjha0_v2Regionalbloc() {
		String testResultId = "test_urhc1vnsjha0_v2Regionalbloc";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter regionalbloc with invalid value Galactic Empire");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter regionalbloc with invalid value Galactic Empire");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("regionalbloc", "Galactic Empire")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_uvgyehkbdxlu_v2Regionalbloc() {
		String testResultId = "test_uvgyehkbdxlu_v2Regionalbloc";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("regionalbloc", "CAIS")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbem3qy8gw2s_v3All() {
		String testResultId = "test_vbem3qy8gw2s_v3All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_trquqchlupnl_v3All() {
		String testResultId = "test_trquqchlupnl_v3All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hrjrg37nwdph_v3Alphacode() {
		String testResultId = "test_1hrjrg37nwdph_v3Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value GHI");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value GHI");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("alphacode", "GHI")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ublvshjrb7sj_v3Alphacode() {
		String testResultId = "test_ublvshjrb7sj_v3Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "languages,latlng,translations")
				.pathParam("alphacode", "NRU")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vb6diev84egm_v3Alphacodes() {
		String testResultId = "test_vb6diev84egm_v3Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1je9xi2mr4wu1_v3Alphacodes() {
		String testResultId = "test_1je9xi2mr4wu1_v3Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("codes", "CI")
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iun72d2llw6x_v3Currency() {
		String testResultId = "test_1iun72d2llw6x_v3Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value DEF");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value DEF");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("currency", "DEF")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ji78g6jejhh3_v3Currency() {
		String testResultId = "test_1ji78g6jejhh3_v3Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "altSpellings")
				.pathParam("currency", "ANG")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_tol74b2a4enn_v3Name() {
		String testResultId = "test_tol74b2a4enn_v3Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Changed value of boolean parameter fullText from 'null' to string 'flwnBuMJzTZvkuBI'");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Changed value of boolean parameter fullText from 'null' to string 'flwnBuMJzTZvkuBI'");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("fullText", "flwnBuMJzTZvkuBI")
				.queryParam("apikey_1", "abc")
				.pathParam("name", "Federated States of Micronesia")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jym3lh3heomx_v3Name() {
		String testResultId = "test_1jym3lh3heomx_v3Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("fullText", "true")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "population")
				.pathParam("name", "Nicaragua")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_somuxbmicgo3_v3Capital() {
		String testResultId = "test_somuxbmicgo3_v3Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value New York");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value New York");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "topLevelDomain")
				.pathParam("capital", "New York")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qe3vbvbnsciq_v3Capital() {
		String testResultId = "test_qe3vbvbnsciq_v3Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("capital", "Cairo")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t84506r8dd11_v3Region() {
		String testResultId = "test_t84506r8dd11_v3Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Westeros");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Westeros");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "numericCode")
				.pathParam("region", "Westeros")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/region/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hv5ij6moxttj_v3Region() {
		String testResultId = "test_1hv5ij6moxttj_v3Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "subregion")
				.pathParam("region", "Americas")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/region/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_veyo0861906o_v3Subregion() {
		String testResultId = "test_veyo0861906o_v3Subregion";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter subregion with invalid value Westeros");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter subregion with invalid value Westeros");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("subregion", "Westeros")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/subregion/{subregion}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rlb55c4q1t9d_v3Subregion() {
		String testResultId = "test_rlb55c4q1t9d_v3Subregion";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "translations,population")
				.pathParam("subregion", "South-Eastern Asia")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/subregion/{subregion}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hb7ozy5e0fg9_v3Lang() {
		String testResultId = "test_1hb7ozy5e0fg9_v3Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value op");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value op");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "cioc,currencies,area")
				.pathParam("lang", "op")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_tocxr6xf6l2w_v3Lang() {
		String testResultId = "test_tocxr6xf6l2w_v3Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "altSpellings")
				.pathParam("lang", "nn")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ubjm9j4fb690_v3Demonym() {
		String testResultId = "test_ubjm9j4fb690_v3Demonym";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter demonym with invalid value skeianian");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter demonym with invalid value skeianian");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("demonym", "skeianian")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/demonym/{demonym}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t86uczcnwdh3_v3Demonym() {
		String testResultId = "test_t86uczcnwdh3_v3Demonym";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("demonym", "Georgian")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/demonym/{demonym}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qdsq7s0xxwti_v3Translation() {
		String testResultId = "test_qdsq7s0xxwti_v3Translation";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter translation with invalid value Essos");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter translation with invalid value Essos");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("translation", "Essos")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/translation/{translation}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_tolonuvd6e02_v3Translation() {
		String testResultId = "test_tolonuvd6e02_v3Translation";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("translation", "Polonia")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/translation/{translation}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

}

package restcountries;

import org.junit.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.FixMethodOrder;
import static org.junit.Assert.fail;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.junit.Assert.assertTrue;
import org.junit.runners.MethodSorters;
import io.qameta.allure.restassured.AllureRestAssured;
import es.us.isa.restest.testcases.restassured.filters.StatusCode5XXFilter;
import es.us.isa.restest.testcases.restassured.filters.NominalOrFaultyTestCaseFilter;
import es.us.isa.restest.testcases.restassured.filters.StatefulFilter;
import java.io.File;
import es.us.isa.restest.testcases.restassured.filters.ResponseValidationFilter;
import es.us.isa.restest.testcases.restassured.filters.CSVFilter;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RestcountriesTest_1660815359786 {

	private static final String OAI_JSON_URL = "src/test/resources/Restcountries/openapi.yaml";
	private static final StatusCode5XXFilter statusCode5XXFilter = new StatusCode5XXFilter();
	private static final NominalOrFaultyTestCaseFilter nominalOrFaultyTestCaseFilter = new NominalOrFaultyTestCaseFilter();
	private static final ResponseValidationFilter validationFilter = new ResponseValidationFilter(OAI_JSON_URL);
	private static final AllureRestAssured allureFilter = new AllureRestAssured();
	private static final String APIName = "restcountries";
	private static final String testId = "1660815359786";
	private static final CSVFilter csvFilter = new CSVFilter(APIName, testId);

	@BeforeClass
	public static void setUp() {
		RestAssured.baseURI = "https://restcountries.com";

		statusCode5XXFilter.setAPIName(APIName);
		statusCode5XXFilter.setTestId(testId);
		nominalOrFaultyTestCaseFilter.setAPIName(APIName);
		nominalOrFaultyTestCaseFilter.setTestId(testId);
		validationFilter.setAPIName(APIName);
		validationFilter.setTestId(testId);
	}

	@Test
	public void test_vb92xygd4she_v2All() {
		String testResultId = "test_vb92xygd4she_v2All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "cioc,capital")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h82jbrhfka42_v2All() {
		String testResultId = "test_1h82jbrhfka42_v2All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hbjat6hb6yph_v2Alphacode() {
		String testResultId = "test_1hbjat6hb6yph_v2Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value ABC");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value ABC");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("alphacode", "ABC")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qxtee78rzlgl_v2Alphacode() {
		String testResultId = "test_qxtee78rzlgl_v2Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("alphacode", "LBR")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1if0ljpgg135l_v2Alphacodes() {
		String testResultId = "test_1if0ljpgg135l_v2Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "latlng,regionalBlocs,timezones,borders")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iephqehqyjw2_v2Alphacodes() {
		String testResultId = "test_1iephqehqyjw2_v2Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("codes", "JOR")
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ibjuzds7ehr5_v2Currency() {
		String testResultId = "test_1ibjuzds7ehr5_v2Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value NAR");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value NAR");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("currency", "NAR")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qhhtt0cgcxme_v2Currency() {
		String testResultId = "test_qhhtt0cgcxme_v2Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("currency", "SVC")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sl3xve5h3rjq_v2Name() {
		String testResultId = "test_sl3xve5h3rjq_v2Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter name with invalid value Lilliput");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter name with invalid value Lilliput");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("name", "Lilliput")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qxw2nx0kazw2_v2Name() {
		String testResultId = "test_qxw2nx0kazw2_v2Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("fullText", "true")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "callingCodes,borders,region,currencies,timezones")
				.pathParam("name", "Cuba")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jenq1apx3lme_v2Callingcode() {
		String testResultId = "test_1jenq1apx3lme_v2Callingcode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter callingcode with invalid value 296");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter callingcode with invalid value 296");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("callingcode", "296")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4vogeeqcnqu_v2Callingcode() {
		String testResultId = "test_t4vogeeqcnqu_v2Callingcode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("callingcode", "240")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4ibw56m8z05_v2Capital() {
		String testResultId = "test_t4ibw56m8z05_v2Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Lyon");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Lyon");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "alpha2Code")
				.pathParam("capital", "Lyon")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s0ui2hbx9liu_v2Capital() {
		String testResultId = "test_s0ui2hbx9liu_v2Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("capital", "Ljubljana")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbpq1ys6pffp_v2Region() {
		String testResultId = "test_vbpq1ys6pffp_v2Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Westeros");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Westeros");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("region", "Westeros")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/continent/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jig3q17rscog_v2Region() {
		String testResultId = "test_1jig3q17rscog_v2Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "flag")
				.pathParam("region", "Asia")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/continent/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7j5r1s6kvvm_v2Lang() {
		String testResultId = "test_1h7j5r1s6kvvm_v2Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value qr");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value qr");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "area,nativeName,numericCode,timezones,cioc")
				.pathParam("lang", "qr")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jeqia0a84u2a_v2Lang() {
		String testResultId = "test_1jeqia0a84u2a_v2Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("lang", "pl")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qxtc20lb1v1i_v2Regionalbloc() {
		String testResultId = "test_qxtc20lb1v1i_v2Regionalbloc";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter regionalbloc with invalid value ABC");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter regionalbloc with invalid value ABC");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "alpha3Code,subregion")
				.pathParam("regionalbloc", "ABC")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s5054l4ueyb5_v2Regionalbloc() {
		String testResultId = "test_s5054l4ueyb5_v2Regionalbloc";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("regionalbloc", "AL")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ubonvnurqp15_v3All() {
		String testResultId = "test_ubonvnurqp15_v3All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "topLevelDomain")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t49kl8mskzlj_v3All() {
		String testResultId = "test_t49kl8mskzlj_v3All";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "callingCodes")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/all");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iv9auui8blf5_v3Alphacode() {
		String testResultId = "test_1iv9auui8blf5_v3Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value NAR");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter alphacode with invalid value NAR");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("alphacode", "NAR")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_r1dc08cyq6w1_v3Alphacode() {
		String testResultId = "test_r1dc08cyq6w1_v3Alphacode";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "numericCode,languages,alpha3Code")
				.pathParam("alphacode", "654")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha/{alphacode}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qhq54o7b22wp_v3Alphacodes() {
		String testResultId = "test_qhq54o7b22wp_v3Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Removed required parameter codes");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "translations,name")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qxfiafxn8wo5_v3Alphacodes() {
		String testResultId = "test_qxfiafxn8wo5_v3Alphacodes";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("codes", "AND,196,PA")
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/alpha");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4nvu3w1og2q_v3Currency() {
		String testResultId = "test_t4nvu3w1og2q_v3Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value MNO");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter currency with invalid value MNO");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "currencies,latlng,population,capital")
				.pathParam("currency", "MNO")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hv5zolqdz7eh_v3Currency() {
		String testResultId = "test_1hv5zolqdz7eh_v3Currency";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("currency", "BAM")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/currency/{currency}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhjdddtj2ag1_v3Name() {
		String testResultId = "test_rhjdddtj2ag1_v3Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter name with invalid value Narnia");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter name with invalid value Narnia");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("name", "Narnia")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ibc0q6ie47s2_v3Name() {
		String testResultId = "test_1ibc0q6ie47s2_v3Name";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("fullText", "true")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "demonym")
				.pathParam("name", "Libya")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/name/{name}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hrjrg1mi6nhg_v3Capital() {
		String testResultId = "test_1hrjrg1mi6nhg_v3Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Vladivostok");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter capital with invalid value Vladivostok");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "timezones")
				.pathParam("capital", "Vladivostok")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ib8slfwvz5no_v3Capital() {
		String testResultId = "test_1ib8slfwvz5no_v3Capital";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "translations,timezones")
				.pathParam("capital", "Thimphu")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/capital/{capital}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7leqzjijyar_v3Region() {
		String testResultId = "test_1h7leqzjijyar_v3Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Middle-earth");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter region with invalid value Middle-earth");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("region", "Middle-earth")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/region/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhg39tyxvqd5_v3Region() {
		String testResultId = "test_rhg39tyxvqd5_v3Region";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("region", "Americas")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/region/{region}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qdqgr8d96zj7_v3Subregion() {
		String testResultId = "test_qdqgr8d96zj7_v3Subregion";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter subregion with invalid value Middle-earth");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter subregion with invalid value Middle-earth");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.queryParam("fields", "subregion")
				.pathParam("subregion", "Middle-earth")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/subregion/{subregion}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qhnt9d4l3l80_v3Subregion() {
		String testResultId = "test_qhnt9d4l3l80_v3Subregion";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("subregion", "Southern Europe")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/subregion/{subregion}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ure34legw4tg_v3Lang() {
		String testResultId = "test_ure34legw4tg_v3Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value nm");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter lang with invalid value nm");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("lang", "nm")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iynst8s3i0j9_v3Lang() {
		String testResultId = "test_1iynst8s3i0j9_v3Lang";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("lang", "Chhattisgarhi")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/lang/{lang}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jyjc5bi222ih_v3Demonym() {
		String testResultId = "test_1jyjc5bi222ih_v3Demonym";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter demonym with invalid value qasweasque");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter demonym with invalid value qasweasque");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("demonym", "qasweasque")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/demonym/{demonym}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vey6ge456r7b_v3Demonym() {
		String testResultId = "test_vey6ge456r7b_v3Demonym";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.queryParam("fields", "topLevelDomain,demonym,population")
				.pathParam("demonym", "Comoran")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/demonym/{demonym}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_toam13df1et4_v3Translation() {
		String testResultId = "test_toam13df1et4_v3Translation";

		nominalOrFaultyTestCaseFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter translation with invalid value Atlantis");
		statusCode5XXFilter.updateFaultyData(true, true, "individual_parameter_constraint:Set parameter translation with invalid value Atlantis");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "ghi")
				.queryParam("apikey_1", "abc")
				.pathParam("translation", "Atlantis")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/translation/{translation}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hb86xf39lyd0_v3Translation() {
		String testResultId = "test_1hb86xf39lyd0_v3Translation";

		nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
		statusCode5XXFilter.updateFaultyData(false, true, "none");
		csvFilter.setTestResultId(testResultId);
		statusCode5XXFilter.setTestResultId(testResultId);
		nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
		validationFilter.setTestResultId(testResultId);

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("apikey_2", "jkl")
				.queryParam("apikey_1", "def")
				.pathParam("translation", "Chile")
				.filter(allureFilter)
				.filter(statusCode5XXFilter)
				.filter(nominalOrFaultyTestCaseFilter)
				.filter(validationFilter)
				.filter(csvFilter)
			.when()
				.get("/v3/translation/{translation}");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

}

