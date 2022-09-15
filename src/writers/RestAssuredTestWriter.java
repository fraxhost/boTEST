package writers;

import main.OpenApiSpecification;
import testcases.TestCase;

import java.util.List;

public class RestAssuredTestWriter {
    private final List<TestCase> testCases;
    private OpenApiSpecification specification;
    private StringBuilder testClass;

    public RestAssuredTestWriter(OpenApiSpecification specification, List<TestCase> testCases) {
        this.testCases = testCases;
        this.specification = specification;
    }

    public String writeTest() {
        testClass = new StringBuilder();

        // import statements
        // TODO: change it
        testClass.append("package runners;").append("\n");
        testClass.append("import io.restassured.response.Response;").append("\n");
        testClass.append("import io.restassured.RestAssured;").append("\n");
        testClass.append("import org.junit.Assert;").append("\n");
        testClass.append("import org.junit.Before;").append("\n\n");
        testClass.append("import org.junit.Test;").append("\n\n");

        testClass.append("public class ").append(specification.getSpecification().getInfo().getTitle().replaceAll("\\s+","")).append(" {").append("\n\n");
        testClass.append("\t").append("@Before").append("\n");
        testClass.append("\t").append("public static void setUp() {").append("\n");
        // index 0 denotes http server / index 1 denotes https server
        testClass.append("\t\t").append("RestAssured.baseURI = \"").append(specification.getSpecification().getServers().get(0).getUrl()).append("\";\n");
        testClass.append("\t").append("}").append("\n\n");


        for (TestCase testCase: testCases) {
            testClass.append("\t").append("@Test").append("\n");
            testClass.append("\t").append("public void ").append(testCase.getId()).append("() {").append("\n");
            testClass.append("\t\t").append("String testResultId = \"").append(testCase.getId()).append("\";").append("\n\n");
            testClass.append("\t\t").append("try {").append("\n");
            testClass.append("\t\t\t").append("Response response = RestAssured").append("\n");
            testClass.append("\t\t\t\t\t").append(".given()").append("\n");
            testClass.append("\t\t\t\t\t\t").append(".log().all()").append("\n");

            if (testCase.getFormParameters() != null) {
                testCase.getFormParameters().forEach((key, value) -> {
                    testClass.append("\t\t\t\t\t\t").append(".formParam(").append("\"").append(key).append("\", ")
                            .append("\"").append(value).append("\")").append("\n");
                });
            }
            if (testCase.getHeaderParameters() != null) {
                testCase.getHeaderParameters().forEach((key, value) -> {
                    testClass.append("\t\t\t\t\t\t").append(".header(").append("\"").append(key).append("\", ")
                            .append("\"").append(value).append("\")").append("\n");
                });
            }
            if (testCase.getQueryParameters() != null) {
                testCase.getQueryParameters().forEach((key, value) -> {
                    testClass.append("\t\t\t\t\t\t").append(".queryParam(").append("\"").append(key).append("\", ")
                            .append("\"").append(value).append("\")").append("\n");
                });
            }
            if (testCase.getPathParameters() != null) {
                testCase.getPathParameters().forEach((key, value) -> {
                    testClass.append("\t\t\t\t\t\t").append(".pathParam(").append("\"").append(key).append("\", ")
                            .append("\"").append(value).append("\")").append("\n");
                });
            }

            if (testCase.getBodyParameter() != null) {
                testClass.append("\t\t\t\t\t\t").append(".body(").append("\"").append(testCase.getBodyParameter())
                        .append("\", ").append("\n");
            }

            testClass.append("\t\t\t\t\t").append(".when()").append("\n");
            testClass.append("\t\t\t\t\t\t").append(".").append(testCase.getMethod().toString().toLowerCase()).append("(\"")
                    .append(testCase.getPath()).append("\");").append("\n\n");
            testClass.append("\t\t\t").append("response.then().log().all();").append("\n");
            testClass.append("\t\t\t").append("System.out.println(\"Test passed.\");").append("\n");
            testClass.append("\t\t").append("} catch (RuntimeException ex) {").append("\n");
            testClass.append("\t\t\t").append("System.err.println(ex.getMessage());").append("\n");
            testClass.append("\t\t\t").append("Assert.fail(ex.getMessage());").append("\n");
            testClass.append("\t\t").append("}").append("\n");
            testClass.append("\t").append("}").append("\n\n");
        }

        testClass.append("}").append("\n");

        return testClass.toString();
    }
}

//    @Test
//    public void test_t4knrcbvwt2w_v2All() {
//        String testResultId = "test_t4knrcbvwt2w_v2All";
//
//        nominalOrFaultyTestCaseFilter.updateFaultyData(false, true, "none");
//        statusCode5XXFilter.updateFaultyData(false, true, "none");
//        csvFilter.setTestResultId(testResultId);
//        statusCode5XXFilter.setTestResultId(testResultId);
//        nominalOrFaultyTestCaseFilter.setTestResultId(testResultId);
//        validationFilter.setTestResultId(testResultId);
//
//        try {
//            Response response = RestAssured
//                    .given()
//                    .log().all()
//                    .queryParam("apikey_2", "ghi")
//                    .queryParam("apikey_1", "abc")
//                    .queryParam("fields", "demonym")
//                    .filter(allureFilter)
//                    .filter(statusCode5XXFilter)
//                    .filter(nominalOrFaultyTestCaseFilter)
//                    .filter(validationFilter)
//                    .filter(csvFilter)
//                    .when()
//                    .get("/v2/all");
//
//            response.then().log().all();
//            System.out.println("Test passed.");
//        } catch (RuntimeException ex) {
//            System.err.println(ex.getMessage());
//            fail(ex.getMessage());
//        }
//    }