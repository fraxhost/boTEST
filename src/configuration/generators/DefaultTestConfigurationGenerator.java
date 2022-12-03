package configuration.generators;

import configuration.pojos.*;
import io.swagger.v3.oas.models.media.Schema;
import specification.OpenApiSpecification;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class DefaultTestConfigurationGenerator {
    static final String GET = "GET";
    static final String POST = "POST";
    static final String PUT = "PUT";
    static final String PATCH = "PATCH";
    static final String DELETE = "DELETE";
    static final String OPTIONS = "OPTIONS";
    static final String TRACE = "TRACE";
    static final String HEAD = "HEAD";
    static final String OBJECT = "object";
    static final String ARRAY = "array";

    private final OpenApiSpecification openApiSpecification;

    public DefaultTestConfigurationGenerator(OpenApiSpecification openApiSpecification) {
        this.openApiSpecification = openApiSpecification;
    }

    public TestConfigurationObject generate() {
        TestConfigurationObject testConfigurationObject = new TestConfigurationObject();

        // Generate Test Auth
        generateTestAuth(testConfigurationObject);

        // Generate Test Configuration
        generateTestConfiguration(testConfigurationObject);

        return testConfigurationObject;
    }

    private void generateTestAuth(TestConfigurationObject testConfigurationObject) {
        TestAuth testAuth = new TestAuth();

        var specificationSecurityRequirements = openApiSpecification.getSpecification().getSecurity();
        if (specificationSecurityRequirements != null) {
            // TODO: Set up testAuth later
        }
        testConfigurationObject.setAuth(testAuth);
    }

    private void generateTestConfiguration(TestConfigurationObject testConfigurationObject) {
        TestConfiguration testConfiguration = new TestConfiguration();

        // Generate Operations
        generateOperations(testConfiguration);

        testConfigurationObject.setTestConfiguration(testConfiguration);
    }

    private void generateOperations(TestConfiguration testConfiguration) {
        List<TestOperation> testOperations = new ArrayList<>();

        var specificationPaths = openApiSpecification.getSpecification().getPaths();
        // For all paths
        for (var path: specificationPaths.entrySet()) {
            // For GET request
            if (Objects.nonNull(path.getValue().getGet())) {
                TestOperation testOperation = new TestOperation();

                testOperation.setOperationId(path.getValue().getGet().getOperationId());
                testOperation.setTestPath(path.getKey());
                testOperation.setMethod(GET);

                /*
                 * Generate Parameters
                 */
                generateParameters(path.getValue().getGet().getParameters(), null, testOperation);
                // TODO: method for generating general parameters
                // generateGeneralParameters(path.getValue().getGet().getParameters(), testOperation);
//                operation.setTestParameters();
//                operation.setExpectedResponse();

                testOperations.add(testOperation);
            }

            // POST
            if (Objects.nonNull(path.getValue().getPost())) {
                TestOperation testOperation = new TestOperation();

                testOperation.setOperationId(path.getValue().getPost().getOperationId());
                testOperation.setTestPath(path.getKey());
                testOperation.setMethod(POST);

                // Setting up request body parameter
                String requestBodySchemaString = null;
                var specificationRequestBody = path.getValue().getPost().getRequestBody();
                if (Objects.nonNull(specificationRequestBody)) {
                    // Checking if schema is object type
                    var specificationRequestBodySchemaObject = path.getValue().getPost().getRequestBody().getContent()
                            .get("application/json").getSchema().get$ref();
                    if (Objects.nonNull(specificationRequestBodySchemaObject)) {
                        requestBodySchemaString = specificationRequestBodySchemaObject;
                    }

                    // Checking if schema is primitive type
                    var specificationRequestBodySchemaPrimitive = path.getValue().getPost().getRequestBody().getContent()
                            .get("application/json").getSchema().getType();
                    if (Objects.nonNull(specificationRequestBodySchemaPrimitive)) {
                        requestBodySchemaString = specificationRequestBodySchemaPrimitive;
                    }
                }

                System.out.println(requestBodySchemaString);

                // Generate Parameters
                // generateParameters(path.getValue().getPost().getParameters(), requestBodySchemaString, testOperation);
                generateGeneralParameters(path.getValue().getPost().getParameters(), testOperation);
                generateBodyParameter(requestBodySchemaString, testOperation);

                testOperations.add(testOperation);
            }

            /*
             * PUT
             */
            if (Objects.nonNull(path.getValue().getPut())) {
                TestOperation testOperation = new TestOperation();

                testOperation.setOperationId(path.getValue().getPut().getOperationId());
                testOperation.setTestPath(path.getKey());
                testOperation.setMethod(PUT);

                /*
                 * Setting up request body parameter
                 */
                String requestBodySchemaString;
                try {
                    requestBodySchemaString = path.getValue().getPut().getRequestBody().getContent()
                            .get("application/json").getSchema().get$ref();
                } catch (Exception e) {
                    requestBodySchemaString = null;
                    System.out.println("No request body ...");
                }

                /*
                 * Generate Parameters
                 */
                generateParameters(path.getValue().getPut().getParameters(), requestBodySchemaString, testOperation);
//                operation.setTestParameters();
//                operation.setExpectedResponse();

                testOperations.add(testOperation);
            }

            /*
             * PATCH
             */
            if (Objects.nonNull(path.getValue().getPatch())) {
                TestOperation testOperation = new TestOperation();

                testOperation.setOperationId(path.getValue().getPatch().getOperationId());
                testOperation.setTestPath(path.getKey());
                testOperation.setMethod(PATCH);


                /*
                 * Setting up request body parameter
                 */
                var requestBodySchemaString = "";
                try {
                    requestBodySchemaString = path.getValue().getPatch().getRequestBody().getContent()
                            .get("application/json").getSchema().get$ref();
                } catch (Exception e) {
                    System.out.println("No request body ...");
                }

                /*
                 * Generate Parameters
                 */
                generateParameters(path.getValue().getPatch().getParameters(), requestBodySchemaString, testOperation);

//                operation.setTestParameters();
//                operation.setExpectedResponse();

                testOperations.add(testOperation);
            }

            /*
             * OPTIONS
             */
            if (Objects.nonNull(path.getValue().getOptions())) {
                TestOperation testOperation = new TestOperation();

                testOperation.setOperationId(path.getValue().getOptions().getOperationId());
                testOperation.setTestPath(path.getKey());
                testOperation.setMethod(OPTIONS);

                /*
                 * Generate Parameters
                 */
                generateParameters(path.getValue().getOptions().getParameters(), null, testOperation);
//                operation.setTestParameters();
//                operation.setExpectedResponse();

                testOperations.add(testOperation);
            }

            /*
             * HEAD
             */
            if (Objects.nonNull(path.getValue().getHead())) {
                TestOperation testOperation = new TestOperation();

                testOperation.setOperationId(path.getValue().getHead().getOperationId());
                testOperation.setTestPath(path.getKey());
                testOperation.setMethod(HEAD);

                /*
                 * Generate Parameters
                 */
                generateParameters(path.getValue().getHead().getParameters(), null, testOperation);
//                operation.setTestParameters();
//                operation.setExpectedResponse();

                testOperations.add(testOperation);
            }

            /*
             * TRACE
             */
            if (path.getValue().getTrace() != null) {
                TestOperation testOperation = new TestOperation();

                testOperation.setOperationId(path.getValue().getTrace().getOperationId());
                testOperation.setTestPath(path.getKey());
                testOperation.setMethod(TRACE);

                /*
                 * Generate Parameters
                 */
                generateParameters(path.getValue().getTrace().getParameters(), null, testOperation);
//                operation.setTestParameters();
//                operation.setExpectedResponse();

                testOperations.add(testOperation);
            }

            /*
             * DELETE
             */
            if (path.getValue().getDelete() != null) {
                TestOperation testOperation = new TestOperation();

                testOperation.setOperationId(path.getValue().getDelete().getOperationId());
                testOperation.setTestPath(path.getKey());
                testOperation.setMethod(DELETE);

                /*
                 * Generate Parameters
                 */
                generateParameters(path.getValue().getDelete().getParameters(), null, testOperation);
//                operation.setTestParameters();
//                operation.setExpectedResponse();

                testOperations.add(testOperation);
            }
        }

        testConfiguration.setOperations(testOperations);
    }

    private void generateGeneralParameters(List<io.swagger.v3.oas.models.parameters.Parameter> specificationParameters, TestOperation testOperation) {
        List<TestParameter> testParameters = new ArrayList<>();

        // Path Parameter, Query Parameter
        if (specificationParameters != null) {
            for (io.swagger.v3.oas.models.parameters.Parameter specificationParameter: specificationParameters) {
                TestParameter testParameter = new TestParameter();

                testParameter.setName(specificationParameter.getName());
                testParameter.setIn(specificationParameter.getIn());
                testParameter.setWeight(0.5); // parameter is optional

                if (specificationParameter.getRequired() != null) {
                    if (specificationParameter.getRequired()) {
                        testParameter.setWeight(1); // parameter is required
                    }
                }

                generateGenerators(testParameter, specificationParameter.getSchema());
                testParameters.add(testParameter);
            }
        }

        testOperation.setGeneralParameters(testParameters);
    }

    private void generateParameters(List<io.swagger.v3.oas.models.parameters.Parameter> specificationParameters, String requestBodySchema, TestOperation testOperation) {
        List<TestParameter> testParameters = new ArrayList<>();
        TestParameter bodyParameter = new TestParameter();

        /*
         * Path Parameter, Query Parameter
         */
        if (specificationParameters != null) {
            for (io.swagger.v3.oas.models.parameters.Parameter specificationParameter: specificationParameters) {
                TestParameter testParameter = new TestParameter();

                testParameter.setName(specificationParameter.getName());
                testParameter.setIn(specificationParameter.getIn());
                testParameter.setWeight(0.5); // parameter is optional

                if (specificationParameter.getRequired() != null) {
                    if (specificationParameter.getRequired()) {
                        testParameter.setWeight(1); // parameter is required
                    }
                }

                if (Objects.equals(specificationParameter.getIn(), "body")) {

                }

                generateGenerators(testParameter, specificationParameter.getSchema());

                testParameters.add(testParameter);
            }
        }

        /*
         * Request Body Parameter
         */
        if (requestBodySchema != null) {
            generateBodyParameter(requestBodySchema);
//            for (Map.Entry<String, Schema> property: properties.entrySet()) {
//                Parameter bodyParameter = new Parameter();
//
//                bodyParameter.setName(property.getKey());
//                bodyParameter.setIn("body");
//                bodyParameter.setWeight(1); // parameter is required
//
//                /*
//                 * Generate Parameter Generators
//                 */
//                generateGenerators(bodyParameter, property.getValue());
//
//                bodyParameters.add(bodyParameter);
//            }
        }

        testOperation.setGeneralParameters(testParameters);
        testOperation.setBodyParameter(bodyParameter);
    }

    private void generateBodyParameter(String requestBodySchema, TestOperation testOperation) {
        // schema can be primitive, object
        Schema requestBodyParameterSchema = extractSchemaFromRequestBody(requestBodySchema);

        TestParameter bodyParameter = new TestParameter();
        //bodyParameter.setName(requestBodyParameterSchema.getName());
        bodyParameter.setIn("body");
        bodyParameter.setWeight(1);

        if (requestBodyParameterSchema.getType().equals(OBJECT)) {
            TestGenerator parameterTestGenerator = new TestGenerator();
            generateGenerators(parameterTestGenerator, requestBodyParameterSchema);
            parameterTestGenerator.setType(requestBodyParameterSchema.getType());

            Map<String, Schema> properties = requestBodyParameterSchema.getProperties();
            properties.forEach((k, v) -> {
                //generateBodyParameter(v);
            });
        }
        else {
            TestGenerator parameterTestGenerator = new TestGenerator();
            parameterTestGenerator.setType(requestBodyParameterSchema.getType());
            // TODO: set parameter generators later
            // parameterGenerator.setGenParameters();
            parameterTestGenerator.setValid(true);
        }

        //bodyParameter.setGenerator(parameterTestGenerator);

        //bodyParameter.setParameters();
    }

    private Schema extractSchemaFromRequestBody(String requestBodySchema) {
        StringBuilder StringOfSchema = new StringBuilder();
        for (int i=requestBodySchema.length()-1; i>=0; i--) {
            if (requestBodySchema.charAt(i) == '/') break;
            StringOfSchema.insert(0, requestBodySchema.charAt(i));
        }

        return openApiSpecification.getSpecification().getComponents().getSchemas().get(StringOfSchema.toString());
    }

    private void generateGenerators(TestParameter testParameter, Schema schema) {
        // List of generators because we may want to use an invalid generator with a valid generator
        // to create valid and invalid test cases
        //List<Generator> generators = new ArrayList<>();

        TestGenerator testGenerator = new TestGenerator();
        testGenerator.setValid(true);

        /*
          Boolean Generator
         */
        if (schema.getType().equals("boolean")) {
            testGenerator.setType("RandomBooleanGenerator");
        }
        /*
          Number Generator
         */
        else if (schema.getType().equals("integer")) {
            testGenerator.setType("RandomNumberGenerator");
        }
        /*
          String Generator
         */
        else if (schema.getType().equals("string")) {
            testGenerator.setType("RandomStringGenerator");
        }

        /*
         * Generate Parameter Generator Constraints
         */
        generateGenParameters(testGenerator, schema);
        //generators.add(generator);
        testParameter.setGenerator(testGenerator);
    }

    private void generateGenParameters(TestGenerator testGenerator, Schema schema) {
        List<TestGeneratorParameter> testGeneratorParameters = new ArrayList<>();

        if (schema.getType().equals("boolean")) {
            // gen parameters will be empty list
        }
        else if (schema.getType().equals("string")) {
            /*
              Min Length Parameter Values
             */
            TestGeneratorParameter testGeneratorParameterMinLength = new TestGeneratorParameter();

            testGeneratorParameterMinLength.setName("minLength");
            ArrayList<String> minLengthValues = new ArrayList<>();

            if (schema.getMinLength() != null) {
                minLengthValues.add(schema.getMinLength().toString());
                testGeneratorParameterMinLength.setValues(minLengthValues);
            }

            testGeneratorParameters.add(testGeneratorParameterMinLength);

            /*
              Max Length Parameter Values
             */
            TestGeneratorParameter testGeneratorParameterMaxLength = new TestGeneratorParameter();

            testGeneratorParameterMaxLength.setName("maxLength");
            ArrayList<String> maxLengthValues = new ArrayList<>();

            if (schema.getMaxLength() != null) {
                maxLengthValues.add(schema.getMaxLength().toString());
                testGeneratorParameterMaxLength.setValues(maxLengthValues);
            }

            testGeneratorParameters.add(testGeneratorParameterMaxLength);

            // TODO: include alphabetic
            // TODO: include numbers
            // TODO: include special char

            testGenerator.setGenParameters(testGeneratorParameters);
        }
        else if (schema.getType().equals("integer")) {
            /*
              Data Type Values
             */
            TestGeneratorParameter testGeneratorParameterType = new TestGeneratorParameter();

            testGeneratorParameterType.setName("type");
            ArrayList<String> typeValues = new ArrayList<>();

            // if (schema.getType() != null) {
            //     typeValues.add(schema.getType());
            // }

            typeValues.add(schema.getType());
            testGeneratorParameterType.setValues(typeValues);

            testGeneratorParameters.add(testGeneratorParameterType);

            /*
             * Min Parameter Values
             */
            TestGeneratorParameter testGeneratorParameterMinNumber = new TestGeneratorParameter();

            testGeneratorParameterMinNumber.setName("min");
            ArrayList<String> minValues = new ArrayList<>();

            if (schema.getMinimum() != null) {
                minValues.add(schema.getMinimum().toString());
                testGeneratorParameterMinNumber.setValues(minValues);
            }

            testGeneratorParameters.add(testGeneratorParameterMinNumber);


            /*
             * Max Parameter Values
             */
            TestGeneratorParameter testGeneratorParameterMaxNumber = new TestGeneratorParameter();

            testGeneratorParameterMaxNumber.setName("max");
            ArrayList<String> maxValues = new ArrayList<>();

            if (schema.getMaximum() != null) {
                maxValues.add(schema.getMaximum().toString());
                testGeneratorParameterMaxNumber.setValues(maxValues);
            }

            testGeneratorParameters.add(testGeneratorParameterMaxNumber);
        }
        // TODO: Complete it
        else if (schema.getType().equals("object")) {
            System.out.println("ami object generate parameters ae achi.............................");

            TestGeneratorParameter schemaType = new TestGeneratorParameter();

            System.out.println(schema.getType());
            System.out.println(schema.getProperties());

            if (schema.get$ref() != null) {
                System.out.println("hoi hoi hoi ............");
                System.out.println(extractSchemaFromRequestBody(schema.get$ref()));
                schemaType.setName(extractSchemaFromRequestBody(schema.get$ref()).toString());
            }

            testGeneratorParameters.add(schemaType);
        }

        testGenerator.setGenParameters(testGeneratorParameters);
    }
}
