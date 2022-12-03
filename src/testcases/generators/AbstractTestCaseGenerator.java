package testcases.generators;

import configuration.pojos.TestOperation;
import configuration.pojos.TestConfigurationObject;
import configuration.pojos.TestParameter;
import inputs.random.RandomBooleanGenerator;
import inputs.random.RandomNumberGenerator;
import inputs.random.RandomStringGenerator;
import io.swagger.v3.oas.models.PathItem;
import specification.OpenApiSpecification;
import testcases.TestCase;
import util.DataType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AbstractTestCaseGenerator {
    private OpenApiSpecification openApiSpecification;
    TestConfigurationObject testConfigurationObject;

    public AbstractTestCaseGenerator(OpenApiSpecification openApiSpecification, TestConfigurationObject testConfigurationObject) {
        this.openApiSpecification = openApiSpecification;
        this.testConfigurationObject = testConfigurationObject;
    }

    public List<TestCase> generateTestCases() {
        List<TestCase> testCases = new ArrayList<>();

        for (TestOperation testOperation : testConfigurationObject.getTestConfiguration().getOperations()) {
            TestCase testCase = new TestCase();
            /*
              Set Id
             */
            String randomStringForTestCaseId = new RandomStringGenerator(12,12,true, true, false)
                    .nextValue();
            String testId = "test_" + randomStringForTestCaseId + "_" + testOperation.getOperationId();
            testCase.setId(testId);

            /*
              Set Faulty
              No faulty since mutation has not been implemented yet
             */
            testCase.setFaulty(false);

            /*
              Set Faulty Reason
             */
            testCase.setFaultyReason("none");

            /*
              Set Operation Id
             */
            testCase.setOperationId(testOperation.getOperationId());

            /*
              Set Method
             */
            switch (testOperation.getMethod()) {
                case "DELETE":
                    testCase.setMethod(PathItem.HttpMethod.DELETE);
                    break;
                case "GET":
                    testCase.setMethod(PathItem.HttpMethod.GET);
                    break;
                case "HEAD":
                    testCase.setMethod(PathItem.HttpMethod.HEAD);
                    break;
                case "OPTIONS":
                    testCase.setMethod(PathItem.HttpMethod.OPTIONS);
                    break;
                case "PATCH":
                    testCase.setMethod(PathItem.HttpMethod.PATCH);
                    break;
                case "POST":
                    testCase.setMethod(PathItem.HttpMethod.POST);
                    break;
                case "PUT":
                    testCase.setMethod(PathItem.HttpMethod.PUT);
                    break;
                case "TRACE":
                    testCase.setMethod(PathItem.HttpMethod.TRACE);
                    break;
            }

            /*
              Set Path
             */
            testCase.setPath(testOperation.getTestPath());

            /*
              Set Input Format
             */
            testCase.setInputFormat("application/json");

            /*
              Set Output Format
             */
            testCase.setInputFormat("application/json");

            /*
              Set Body Parameters
             */
            // TODO: Redesign body parameter
            generateParameterForAbstractTestCase(testCase, testOperation.getBodyParameter());

            /*
              Set Test Parameters
             */
            for (TestParameter testParameter : testOperation.getGeneralParameters()) {
                String generatorType = testParameter.getGenerator().getType();
                if (generatorType == null) continue;

                generateParameterForAbstractTestCase(testCase, testParameter);
            }

            testCases.add(testCase);
        }

        return testCases;
    }

    private void generateParameterForAbstractTestCase (TestCase testCase, TestParameter parameter) {
        String generatorType = parameter.getGenerator().getType();
        String parameterType = parameter.getIn();

        String randomString = null;
        String randomBoolean = null;
        String randomNumber = null;

        switch (generatorType) {
            case "RandomBooleanGenerator":
                // TODO: use gen parameters to customize random boolean
                randomBoolean = new RandomBooleanGenerator().nextValueAsString();
                break;
            case "RandomNumberGenerator":
                // TODO: use gen parameters to customize random number
                randomNumber = new RandomNumberGenerator(DataType.INTEGER).nextValueAsString();
                break;
            case "RandomStringGenerator":
                // TODO: use gen parameters to customize random number
                randomString = new RandomStringGenerator().nextValueAsString();
                break;
        }

        String parameterName = parameter.getName();
        if (randomNumber != null) {
            parameterName = parameterName + ":number";
        } else if (randomBoolean != null) {
            parameterName = parameterName + ":boolean";
        } else if (randomString != null) {
            parameterName = parameterName + ":string";
        }

        switch (parameterType) {
            /*
              Set Query Parameters
             */
            case "query":
                Map<String, String> queryParameter;

                if (testCase.getQueryParameters() != null) {
                    queryParameter = testCase.getQueryParameters();
                } else {
                    queryParameter = new HashMap<>();
                }

                if (randomNumber != null) {
                    queryParameter.put(parameterName, randomNumber);
                } else if (randomBoolean != null) {
                    queryParameter.put(parameterName, randomBoolean);
                } else if (randomString != null) {
                    queryParameter.put(parameterName, randomString);
                }

                testCase.setQueryParameters(queryParameter);

                break;
            /*
             * Set Path Parameters
             */
            case "path":
                Map<String, String> pathParameter;

                if (testCase.getPathParameters() != null) {
                    pathParameter = testCase.getPathParameters();
                } else {
                    pathParameter = new HashMap<>();
                }

                if (randomNumber != null) {
                    pathParameter.put(parameterName, randomNumber);
                } else if (randomBoolean != null) {
                    pathParameter.put(parameterName, randomBoolean);
                } else if (randomString != null) {
                    pathParameter.put(parameterName, randomString);
                }

                testCase.setPathParameters(pathParameter);

                break;
            /*
             * Set Header Parameters
             */
            case "header":
                Map<String, String> headerParameter;

                if (testCase.getHeaderParameters() != null) {
                    headerParameter = testCase.getHeaderParameters();
                } else {
                    headerParameter = new HashMap<>();
                }

                if (randomNumber != null) {
                    headerParameter.put(parameterName, randomNumber);
                } else if (randomBoolean != null) {
                    headerParameter.put(parameterName, randomBoolean);
                } else if (randomString != null) {
                    headerParameter.put(parameterName, randomString);
                }

                testCase.setPathParameters(headerParameter);

                break;
            /*
             * Set Form Parameters
             */
            case "form":
                Map<String, String> formParameter;

                if (testCase.getFormParameters() != null) {
                    formParameter = testCase.getFormParameters();
                } else {
                    formParameter = new HashMap<>();
                }

                if (randomNumber != null) {
                    formParameter.put(parameterName, randomNumber);
                } else if (randomBoolean != null) {
                    formParameter.put(parameterName, randomBoolean);
                } else if (randomString != null) {
                    formParameter.put(parameterName, randomString);
                }

                testCase.setFormParameters(formParameter);

                break;
            /*
             * Set Body Parameters
             */
            case "body":
                Map<String, String> bodyParameter;

                if (testCase.getBodyParameter() != null) {
                    bodyParameter = testCase.getBodyParameter();
                } else {
                    bodyParameter = new HashMap<>();
                }

                if (randomNumber != null) {
                    bodyParameter.put(parameterName, randomNumber);
                } else if (randomBoolean != null) {
                    bodyParameter.put(parameterName, randomBoolean);
                } else if (randomString != null) {
                    bodyParameter.put(parameterName, randomString);
                }

                testCase.setBodyParameter(bodyParameter);

                break;
        }
    }
}
