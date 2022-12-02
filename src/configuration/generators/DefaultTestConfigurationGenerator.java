package configuration.generators;

import configuration.pojos.*;
import io.swagger.v3.oas.models.PathItem;
import io.swagger.v3.oas.models.media.Schema;
import specification.OpenApiSpecification;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
        List<Operation> operations = new ArrayList<>();

        testConfiguration.setOperations(operations);

        for (Map.Entry<String, PathItem> path: openApiSpecification.getSpecification().getPaths().entrySet()) {

            /*
             * GET
             */
            if (path.getValue().getGet() != null) {
                Operation operation = new Operation();
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
                Operation operation = new Operation();
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
                Operation operation = new Operation();
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
                Operation operation = new Operation();
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
                Operation operation = new Operation();
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
                Operation operation = new Operation();
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
                Operation operation = new Operation();
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
                Operation operation = new Operation();
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

    private void generateParameters(List<io.swagger.v3.oas.models.parameters.Parameter> parameters, String requestBodySchema, Operation operation) {
        List<Parameter> testParameters = new ArrayList<>();
        List<Parameter> bodyParameters = new ArrayList<>();

        /*
         * Path Parameter, Query Parameter
         */
        if (parameters != null) {
            for (io.swagger.v3.oas.models.parameters.Parameter parameter: parameters) {
                Parameter testParameter = new Parameter();

                testParameter.setName(parameter.getName());
                testParameter.setIn(parameter.getIn());
                testParameter.setWeight(0.5); // parameter is optional

                if (parameter.getRequired() != null) {
                    if (parameter.getRequired()) {
                        testParameter.setWeight(1); // parameter is required
                    }
                }

                generateGenerators(testParameter, parameter.getSchema());

                testParameters.add(testParameter);
            }
        }

        /*
         * Request Body Parameter
         */
        if (requestBodySchema != null) {


            Schema requestBodyParameterSchema = determineSchemaFromString(requestBodySchema);
            Map<String, Schema> properties = requestBodyParameterSchema.getProperties();


            for (Map.Entry<String, Schema> property: properties.entrySet()) {
                Parameter bodyParameter = new Parameter();

                bodyParameter.setName(property.getKey());
                bodyParameter.setIn("body");
                bodyParameter.setWeight(1); // parameter is required

                /*
                 * Generate Parameter Generators
                 */
                generateGenerators(bodyParameter, property.getValue());

                bodyParameters.add(bodyParameter);
            }
        }

        operation.setTestParameters(testParameters);
        operation.setBodyParameters(bodyParameters);
    }

    private Schema determineSchemaFromString(String requestBodySchema) {
        StringBuilder StringOfSchema = new StringBuilder();
        for (int i=requestBodySchema.length()-1; i>=0; i--) {
            if (requestBodySchema.charAt(i) == '/') break;
            StringOfSchema.insert(0, requestBodySchema.charAt(i));
        }

        return openApiSpecification.getSpecification().getComponents().getSchemas().get(StringOfSchema.toString());
    }

    private void generateGenerators(Parameter testParameter, Schema schema) {
        // List of generators because we may want to use an invalid generator with a valid generator
        // to create valid and invalid test cases
        List<Generator> generators = new ArrayList<>();

        Generator generator = new Generator();
        generator.setValid(true);

        System.out.println("dhuklammmmmmmmmmmmmmmmmmmmmmmmmm--------------------");
        System.out.println(schema.getType());

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
        generators.add(generator);
        testParameter.setGenerators(generators);
    }

    private void generateGenParameters(Generator generator, Schema schema) {
        List<GenParameter> genParameters = new ArrayList<>();

        if (schema.getType().equals("boolean")) {
            // gen parameters will be empty list
        }
        else if (schema.getType().equals("string")) {

            /*
              Min Length Parameter Values
             */
            GenParameter genParameterMinLength = new GenParameter();

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
            GenParameter genParameterMaxLength = new GenParameter();

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
            GenParameter genParameterType = new GenParameter();

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
            GenParameter genParameterMinNumber = new GenParameter();

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
            GenParameter genParameterMaxNumber = new GenParameter();

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
            System.out.println("ami object generate parameters ae achi.............................");

            GenParameter schemaType = new GenParameter();

            System.out.println(schema.getType());
            System.out.println(schema.getProperties());

            if (schema.get$ref() != null) {
                System.out.println("hoi hoi hoi ............");
                System.out.println(determineSchemaFromString(schema.get$ref()));
                schemaType.setName(determineSchemaFromString(schema.get$ref()).toString());
            }

            genParameters.add(schemaType);
        }

        generator.setGenParameters(genParameters);
    }

    private void generateAuth(TestConfigurationObject testConfigurationObject) {
        Auth auth = new Auth();

        // process auth
        openApiSpecification.getSpecification().getSecurity();
        testConfigurationObject.setAuth(new Auth());

        testConfigurationObject.setAuth(auth);
    }
}
