package main;

import configuration.generators.DefaultTestConfigurationGenerator;
import configuration.pojos.TestConfigurationObject;
import helpers.BoTestIO;
import helpers.JsonToYaml;
import org.apache.log4j.BasicConfigurator;
import runners.JUnitTestRunner;
import specification.OpenApiSpecification;
import testcases.TestCase;
import testcases.generators.AbstractTestCaseGenerator;
import writers.RestAssuredTestWriter;


import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    //private static String openApiSpecificationPath= "src/resources/petstore/small-petstore.yaml";
    private static String jsonOASPath = "src/resources/botest/botest.json";

    public static void main(String[] args) throws IOException, InterruptedException {
        /**
         * Logger Configuration
         */
        // BasicConfigurator.configure();

        /**
         * JSON to YAML
         */
        String yamlOASPath = JsonToYaml.yamlPath(jsonOASPath);


        /**
         * Load Specification
         */
        OpenApiSpecification openApiSpecification = new OpenApiSpecification(yamlOASPath);

        System.out.println("##########");
        System.out.println("Specification Loaded...");
        System.out.println("##########");
        BoTestIO.writeToFile("target\\api-specification\\" +
                        openApiSpecification.getSpecification().getInfo().getTitle() + ".js",
                        openApiSpecification.getSpecification().toString());


        /**
         * Generate Test Configuration
         */
        DefaultTestConfigurationGenerator defaultTestConfigurationGenerator = new DefaultTestConfigurationGenerator(
                openApiSpecification);
        TestConfigurationObject testConfigurationObject = defaultTestConfigurationGenerator.generate();

        System.out.println("##########");
        System.out.println("Test Configuration Generated...");
        System.out.println("##########");
        BoTestIO.writeToFile("target\\test-configuration\\" +
                        openApiSpecification.getSpecification().getInfo().getTitle() + ".js",
                        testConfigurationObject.getTestConfiguration().toString());


        /**
         * Generate Test Cases
         */
        AbstractTestCaseGenerator abstractTestCaseGenerator = new AbstractTestCaseGenerator(
                openApiSpecification,
                testConfigurationObject);
        List<TestCase> testCases = abstractTestCaseGenerator.generateTestCases();

        System.out.println("##########");
        System.out.println("Abstract Test Case Generated...");
        System.out.println("##########");
        BoTestIO.writeToFile("target\\test-cases\\" +
                        openApiSpecification.getSpecification().getInfo().getTitle() + ".js",
                        testCases.toString());


        /**
         * Write REST Assured Tests
         */
        RestAssuredTestWriter testWriter = new RestAssuredTestWriter(openApiSpecification, testCases);
        String testClass = testWriter.writeTest();
        BoTestIO.writeToFile("src\\generation\\" + testWriter.getClassName() + ".java", testClass);

        System.out.println("##########");
        System.out.println("REST Assured Tests Generated...");
        System.out.println("##########");
        BoTestIO.writeToFile("target\\test-classes\\" +
                        openApiSpecification.getSpecification().getInfo().getTitle() + ".js",
                testClass);

        TimeUnit.SECONDS.sleep(2);

        /**
         * Execute Tests
         */
        JUnitTestRunner testRunner = new JUnitTestRunner(testWriter.getClassName());
        testRunner.execute();

        System.out.println("##########");
        System.out.println("All Tests Executed...");
        System.out.println("##########");
    }
}
