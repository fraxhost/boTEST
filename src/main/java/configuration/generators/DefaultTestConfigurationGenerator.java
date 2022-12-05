package configuration.generators;

import configuration.pojos.*;
import io.swagger.v3.oas.models.PathItem;
import io.swagger.v3.oas.models.media.BooleanSchema;
import io.swagger.v3.oas.models.media.IntegerSchema;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.media.StringSchema;
import specification.OpenApiSpecification;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class DefaultTestConfigurationGenerator {
    private final OpenApiSpecification openApiSpecification;

    public DefaultTestConfigurationGenerator(OpenApiSpecification openApiSpecification) {
        this.openApiSpecification = openApiSpecification;
    }

    public TestConfigurationObject generate() {
        TestConfigurationObject testConfigurationObject = new TestConfigurationObject();

        /*
         * Generate Auth
         */
        generateAuth(testConfigurationObject);

        /*
         * Generate Test Configuration
         */
        generateTestConfiguration(testConfigurationObject);

        return testConfigurationObject;
    }

    private void generateTestConfiguration(TestConfigurationObject testConfigurationObject) {
        TestConfiguration testConfiguration = new TestConfiguration();

        testConfigurationObject.setTestConfiguration(testConfiguration);

        /*
         * Generate Operations
         */
        generateOperations(testConfiguration);
    }

    private void generateOperations(TestConfiguration testConfiguration) {
        List<TestOperation> operations = new ArrayList<>();

        testConfiguration.setOperations(operations);

        for (Map.Entry<String, PathItem> path: openApiSpecification.getSpecification().getPaths().entrySet()) {

            /*
             * GET
             */
            if (path.getValue().getGet() != null) {
                TestOperation operation = new TestOperation();
                operation.setTestPath(path.getKey());
                operation.setMethod("GET");
                operation.setOperationId(path.getValue().getGet().getOperationId());

                /*
                 * Generate Parameters
                 */
                generateParameters(path.getValue().getGet().getParameters(), null, operation);
//                operation.setTestParameters();
//                operation.setExpectedResponse();

                operations.add(operation);
            }

            // operation.setOperationId(path.getValue().);

            /*
             * POST
             */
            if (path.getValue().getPost() != null) {
                TestOperation operation = new TestOperation();
                operation.setTestPath(path.getKey());
                operation.setMethod("POST");
                operation.setOperationId(path.getValue().getPost().getOperationId());

                /*
                 * Setting up request body parameter
                 */
                var requestBodySchemaString = "";
                try {
                    requestBodySchemaString = path.getValue().getPost().getRequestBody().getContent()
                                                .get("application/json").getSchema().get$ref();
                } catch (Exception e) {
                    System.out.println("No request body ...");
                }

                /*
                 * Generate Parameters
                 */
                generateParameters(path.getValue().getPost().getParameters(), requestBodySchemaString, operation);
//                operation.setTestParameters();
//                operation.setExpectedResponse();
//                generateRequestBody();

                operations.add(operation);
            }

            /*
             * PUT
             */
            if (path.getValue().getPut() != null) {
                TestOperation operation = new TestOperation();
                operation.setTestPath(path.getKey());
                operation.setMethod("PUT");
                operation.setOperationId(path.getValue().getPut().getOperationId());

                /*
                 * Setting up request body parameter
                 */
                var requestBodySchemaString = "";
                try {
                    requestBodySchemaString = path.getValue().getPut().getRequestBody().getContent()
                            .get("application/json").getSchema().get$ref();
                } catch (Exception e) {
                    System.out.println("No request body ...");
                }

                /*
                 * Generate Parameters
                 */
                generateParameters(path.getValue().getPut().getParameters(), requestBodySchemaString, operation);
//                operation.setTestParameters();
//                operation.setExpectedResponse();

                operations.add(operation);
            }

            /*
             * PATCH
             */
            if (path.getValue().getPatch() != null) {
                TestOperation operation = new TestOperation();
                operation.setTestPath(path.getKey());
                operation.setMethod("PATCH");
                operation.setOperationId(path.getValue().getPatch().getOperationId());

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
                generateParameters(path.getValue().getPatch().getParameters(), requestBodySchemaString, operation);

//                operation.setTestParameters();
//                operation.setExpectedResponse();

                operations.add(operation);
            }

            /**
             * OPTIONS
             */
            if (path.getValue().getOptions() != null) {
                TestOperation operation = new TestOperation();
                operation.setTestPath(path.getKey());
                operation.setMethod("OPTIONS");
                operation.setOperationId(path.getValue().getOptions().getOperationId());

                /*
                 * Generate Parameters
                 */
                generateParameters(path.getValue().getOptions().getParameters(), null, operation);
//                operation.setTestParameters();
//                operation.setExpectedResponse();

                operations.add(operation);
            }

            /**
             * HEAD
             */
            if (path.getValue().getHead() != null) {
                TestOperation operation = new TestOperation();
                operation.setTestPath(path.getKey());
                operation.setMethod("HEAD");
                operation.setOperationId(path.getValue().getHead().getOperationId());

                /*
                 * Generate Parameters
                 */
                generateParameters(path.getValue().getHead().getParameters(), null, operation);
//                operation.setTestParameters();
//                operation.setExpectedResponse();

                operations.add(operation);
            }

            /**
             * TRACE
             */
            if (path.getValue().getTrace() != null) {
                TestOperation operation = new TestOperation();
                operation.setTestPath(path.getKey());
                operation.setMethod("TRACE");
                operation.setOperationId(path.getValue().getTrace().getOperationId());

                /*
                 * Generate Parameters
                 */
                generateParameters(path.getValue().getTrace().getParameters(), null, operation);
//                operation.setTestParameters();
//                operation.setExpectedResponse();

                operations.add(operation);
            }

            /**
             * DELETE
             */
            if (path.getValue().getDelete() != null) {
                TestOperation operation = new TestOperation();
                operation.setTestPath(path.getKey());
                operation.setMethod("DELETE");
                operation.setOperationId(path.getValue().getDelete().getOperationId());

                /*
                 * Generate Parameters
                 */
                generateParameters(path.getValue().getDelete().getParameters(), null, operation);
//                operation.setTestParameters();
//                operation.setExpectedResponse();

                operations.add(operation);
            }
        }
    }

    private void generateParameters(List<io.swagger.v3.oas.models.parameters.Parameter> parameters, String requestBodySchema, TestOperation operation) {
        List<TestParameter> testParameters = new ArrayList<>();

        /*
         * Path Parameter, Query Parameter
         */
        if (parameters != null) {
            for (io.swagger.v3.oas.models.parameters.Parameter parameter: parameters) {
                TestParameter testParameter = new TestParameter();

                testParameter.setName(parameter.getName());
                testParameter.setIn(parameter.getIn());
                testParameter.setWeight(0.5); // parameter is optional

                if (parameter.getRequired() != null) {
                    if (parameter.getRequired()) {
                        testParameter.setWeight(1); // parameter is required
                    }
                }

                generateTestParameterGenerator(testParameter, parameter.getSchema());
                testParameters.add(testParameter);
            }
        }

        /*
         * Request Body Parameter
         */
        if (requestBodySchema != null) {
            String requestBodyParameterName = getSchemaNameFromReference(requestBodySchema);
            TestBodyParameter testBodyParameter = generateBodyParameter(requestBodyParameterName, requestBodySchema);
            operation.setBodyParameter(testBodyParameter);
        }

        operation.setTestParameters(testParameters);
    }

    private TestBodyParameter generateBodyParameter (String requestBodyParameterName, String requestBodySchema) {
        TestBodyParameter testBodyParameter = new TestBodyParameter();
        Schema requestBodyParameterSchema = determineSchemaFromString(requestBodySchema);

        testBodyParameter.setName(requestBodyParameterName);
        // Generate Parameter Generators
        generateBodyParameterGenerator(testBodyParameter, requestBodyParameterSchema);

        Map<String, Schema> properties = requestBodyParameterSchema.getProperties();

        if (Objects.nonNull(properties)) {
            List<TestBodyParameter> testBodyParameterProperties = new ArrayList<>();
            for (Map.Entry<String, Schema> property: properties.entrySet()) {
                // TODO: assign name of property
                testBodyParameterProperties.add(generateBodyParameter(property.getKey(), property.getValue().getType()));
            }
            testBodyParameter.setProperties(testBodyParameterProperties);
        }

        return testBodyParameter;
    }

    private Schema determineSchemaFromString(String requestBodySchema) {
        if (requestBodySchema.equals("integer")) return new IntegerSchema();
        if (requestBodySchema.equals("string")) return new StringSchema();
        if (requestBodySchema.equals("boolean")) return new BooleanSchema();

        return openApiSpecification.getSpecification().getComponents().getSchemas()
                .get(getSchemaNameFromReference(requestBodySchema));
    }

    private String getSchemaNameFromReference(String reference) {
        StringBuilder StringOfSchema = new StringBuilder();
        for (int i=reference.length()-1; i>=0; i--) {
            if (reference.charAt(i) == '/') break;
            StringOfSchema.insert(0, reference.charAt(i));
        }

        return StringOfSchema.toString();
    }

    private void generateTestParameterGenerator(TestParameter testParameter, Schema schema) {
        // List of generators because we may want to use an invalid generator with a valid generator
        // to create valid and invalid test cases
        TestGenerator generator = new TestGenerator();
        generator.setValid(true);

        /*
          Boolean Generator
         */
        if (schema.getType().equals("boolean")) {
            generator.setType("RandomBooleanGenerator");
        }
        /*
          Number Generator
         */
        else if (schema.getType().equals("integer")) {
            generator.setType("RandomNumberGenerator");
        }
        /*
          String Generator
         */
        else if (schema.getType().equals("string")) {
            generator.setType("RandomStringGenerator");
        }

        /*
         * Generate Parameter Generator Constraints
         */
        generateGenParameters(generator, schema);
        testParameter.setGenerator(generator);
    }

    private void generateBodyParameterGenerator(TestBodyParameter bodyParameter, Schema schema) {
        // List of generators because we may want to use an invalid generator with a valid generator
        // to create valid and invalid test cases
        TestGenerator generator = new TestGenerator();
        generator.setValid(true);

        /*
          Boolean Generator
         */
        if (schema.getType().equals("boolean")) {
            generator.setType("RandomBooleanGenerator");
        }
        /*
          Number Generator
         */
        else if (schema.getType().equals("integer")) {
            generator.setType("RandomNumberGenerator");
        }
        /*
          String Generator
         */
        else if (schema.getType().equals("string")) {
            generator.setType("RandomStringGenerator");
        }
        /*
          Object Generator
         */
        else if (schema.getType().equals("object")) {
            generator.setType("RandomObjectGenerator");
        }


        /*
         * Generate Parameter Generator Constraints
         */
        generateGenParameters(generator, schema);
        bodyParameter.setGenerator(generator);
    }

    private void generateGenParameters(TestGenerator generator, Schema schema) {
        List<TestGeneratorParameter> genParameters = new ArrayList<>();

        if (schema.getType().equals("boolean")) {
            // gen parameters will be empty list
        }
        else if (schema.getType().equals("string")) {

            /*
              Min Length Parameter Values
             */
            TestGeneratorParameter genParameterMinLength = new TestGeneratorParameter();

            genParameterMinLength.setName("minLength");
            ArrayList<String> minLengthValues = new ArrayList<>();

            if (schema.getMinLength() != null) {
                minLengthValues.add(schema.getMinLength().toString());
                genParameterMinLength.setValues(minLengthValues);
            }

            genParameters.add(genParameterMinLength);

            /*
              Max Length Parameter Values
             */
            TestGeneratorParameter genParameterMaxLength = new TestGeneratorParameter();

            genParameterMaxLength.setName("maxLength");
            ArrayList<String> maxLengthValues = new ArrayList<>();

            if (schema.getMaxLength() != null) {
                maxLengthValues.add(schema.getMaxLength().toString());
                genParameterMaxLength.setValues(maxLengthValues);
            }

            genParameters.add(genParameterMaxLength);

            // TODO: include alphabetic
            // TODO: include numbers
            // TODO: include special char

            generator.setGenParameters(genParameters);
        }
        else if (schema.getType().equals("integer")) {
            /*
              Data Type Values
             */
            TestGeneratorParameter genParameterType = new TestGeneratorParameter();

            genParameterType.setName("type");
            ArrayList<String> typeValues = new ArrayList<>();

            // if (schema.getType() != null) {
            //     typeValues.add(schema.getType());
            // }

            typeValues.add(schema.getType());
            genParameterType.setValues(typeValues);

            genParameters.add(genParameterType);

            /*
             * Min Parameter Values
             */
            TestGeneratorParameter genParameterMinNumber = new TestGeneratorParameter();

            genParameterMinNumber.setName("min");
            ArrayList<String> minValues = new ArrayList<>();

            if (schema.getMinimum() != null) {
                minValues.add(schema.getMinimum().toString());
                genParameterMinNumber.setValues(minValues);
            }

            genParameters.add(genParameterMinNumber);


            /*
             * Max Parameter Values
             */
            TestGeneratorParameter genParameterMaxNumber = new TestGeneratorParameter();

            genParameterMaxNumber.setName("max");
            ArrayList<String> maxValues = new ArrayList<>();

            if (schema.getMaximum() != null) {
                maxValues.add(schema.getMaximum().toString());
                genParameterMaxNumber.setValues(maxValues);
            }

            genParameters.add(genParameterMaxNumber);
        }
        // TODO: Complete it
        else if (schema.getType().equals("object")) {

            TestGeneratorParameter schemaType = new TestGeneratorParameter();

            if (schema.get$ref() != null) {
                schemaType.setName(determineSchemaFromString(schema.get$ref()).toString());
            }

            genParameters.add(schemaType);
        }

        generator.setGenParameters(genParameters);
    }

    private void generateAuth(TestConfigurationObject testConfigurationObject) {
        TestAuth auth = new TestAuth();

        // process auth
        openApiSpecification.getSpecification().getSecurity();
        testConfigurationObject.setAuth(new TestAuth());

        testConfigurationObject.setAuth(auth);
    }
}
