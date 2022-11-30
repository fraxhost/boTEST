package testcases.generators;

import configuration.pojos.Operation;
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

        for (Operation operation : testConfigurationObject.getTestConfiguration().getOperations()) {
            TestCase testCase = new TestCase();

            /**
             * Set Id
             */
            String randomStringForTestCaseId = new RandomStringGenerator(12,12,true, true, false)
                    .nextValue();
            String testId = "test_" + randomStringForTestCaseId + "_" + operation.getOperationId();
            testCase.setId(testId);

            /**
             * Set Faulty
             * No faulty since mutation has not been implemented yet
             */
            testCase.setFaulty(false);

            /**
             * Set Faulty Reason
             */
            testCase.setFaultyReason("none");

            /**
             * Set Operation Id
             */
            testCase.setOperationId(operation.getOperationId());

            /**
             * Set Method
             */
            switch (operation.getMethod()) {
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
                default:
                    // nothing
            }

            /**
             * Set Path
             */
            testCase.setPath(operation.getTestPath());

            /**
             * Set Input Format
             */
            // testCase.setInputFormat(operation.);
            // operation.getRequestBody().getContent().keySet().stream().findFirst().get()
            // TODO: Make it dynamic (xml/json)
            testCase.setInputFormat("application/json");

            /**
             * Set Output Format
             */
            // testCase.setOutputFormat();
            // TODO: Make it dynamic (xml/json)
            testCase.setInputFormat("application/json");

            /**
             * Set Parameters
             */

            for (TestParameter testParameter :operation.getTestParameters()) {
                // System.out.println(testParameter.getGenerators().get(0).getGenParameters());

                String generatorType = testParameter.getGenerators().get(0).getType();
                String parameterType = testParameter.getIn();

                String randomString = null;
                String randomBoolean = null;
                String randomNumber = null;

//                System.out.println(testParameter);

                // TODO: Remove later
                if (generatorType==null) continue;

                if (generatorType.equals("RandomBooleanGenerator")) {
                    // TODO: use gen parameters to customize random boolean
                    randomBoolean = new RandomBooleanGenerator().nextValueAsString();
                } else if (generatorType.equals("RandomNumberGenerator")) {
                    // TODO: use gen parameters to customize random number
                    randomNumber = new RandomNumberGenerator(DataType.INTEGER).nextValueAsString();
                } else if (generatorType.equals("RandomStringGenerator")) {
                    // TODO: use gen parameters to customize random number
                    randomString = new RandomStringGenerator().nextValueAsString();
                }

                /**
                 * Set Query Parameters
                 */
                if (parameterType.equals("query")) {
                    Map<String, String> queryParameter;

                    if (testCase.getQueryParameters() != null) {
                        queryParameter = testCase.getQueryParameters();
                    } else {
                        queryParameter = new HashMap<>();
                    }


                    if (randomNumber != null) {
                        queryParameter.put(testParameter.getName(), randomNumber);
                    } else if (randomBoolean != null) {
                        queryParameter.put(testParameter.getName(), randomBoolean);
                    } else if (randomString != null) {
                        queryParameter.put(testParameter.getName(), randomString);
                    }

                    testCase.setQueryParameters(queryParameter);

                }
                /**
                 * Set Path Parameters
                 */
                else if (parameterType.equals("path")) {
                    Map<String, String> pathParameter;

                    if (testCase.getPathParameters() != null) {
                        pathParameter = testCase.getPathParameters();
                    } else {
                        pathParameter = new HashMap<>();
                    }

                    if (randomNumber != null) {
                        pathParameter.put(testParameter.getName(), randomNumber);
                    } else if (randomBoolean != null) {
                        pathParameter.put(testParameter.getName(), randomBoolean);
                    } else if (randomString != null) {
                        pathParameter.put(testParameter.getName(), randomString);
                    }

                    testCase.setPathParameters(pathParameter);

                }
                /**
                 * Set Header Parameters
                 */
                else if (parameterType.equals("header")) {
                    Map<String, String> headerParameter;

                    if (testCase.getHeaderParameters() != null) {
                        headerParameter = testCase.getHeaderParameters();
                    } else {
                        headerParameter = new HashMap<>();
                    }


                    if (randomNumber != null) {
                        headerParameter.put(testParameter.getName(), randomNumber);
                    } else if (randomBoolean != null) {
                        headerParameter.put(testParameter.getName(), randomBoolean);
                    } else if (randomString != null) {
                        headerParameter.put(testParameter.getName(), randomString);
                    }

                    testCase.setPathParameters(headerParameter);

                }
                /**
                 * Set Form Parameters
                 */
                else if (parameterType.equals("form")) {
                    Map<String, String> formParameter;

                    if (testCase.getFormParameters() != null) {
                        formParameter = testCase.getFormParameters();
                    } else {
                        formParameter = new HashMap<>();
                    }

                    if (randomNumber != null) {
                        formParameter.put(testParameter.getName(), randomNumber);
                    } else if (randomBoolean != null) {
                        formParameter.put(testParameter.getName(), randomBoolean);
                    } else if (randomString != null) {
                        formParameter.put(testParameter.getName(), randomString);
                    }

                    testCase.setFormParameters(formParameter);

                }
                /**
                 * Set Body Parameters
                 */
                else if (parameterType.equals("body")) {
                    // TODO: Work In Progress
                    testCase.setBodyParameter("null");
                }
            }

            testCases.add(testCase);
        }

        return testCases;
    }
}
