package main;

import configuration.generators.DefaultTestConfigurationGenerator;
import configuration.pojos.TestConfigurationObject;
import runners.JUnitTestRunner;
import testcases.generators.AbstractTestCaseGenerator;
import helpers.BoTestIO;
import testcases.TestCase;
import writers.RestAssuredTestWriter;

import java.util.List;


public class TestConfigurationGeneration {
//    private static String openApiSpecificationPath= "src/resources/simple_api/simple-api.yaml";
    private static String openApiSpecificationPath= "src/resources/botest/botest.yaml";

    public static void main(String[] args) {
        // load specification
        OpenApiSpecification openApiSpecification = new OpenApiSpecification(openApiSpecificationPath);

        // generate test configuration
        DefaultTestConfigurationGenerator defaultTestConfigurationGenerator = new DefaultTestConfigurationGenerator(openApiSpecification);
        TestConfigurationObject testConfigurationObject = defaultTestConfigurationGenerator.generate();

        // generate test cases
        List<TestCase> testCases = new AbstractTestCaseGenerator(openApiSpecification, testConfigurationObject).generateTestCases();

        // write rest assured tests
        RestAssuredTestWriter testWriter = new RestAssuredTestWriter(openApiSpecification, testCases);
        String testClass = testWriter.writeTest();


        // write specification to file
//        BoTestIO.writeToFile("E:\\Programming\\Java\\BoTest\\target\\specification\\botest.txt",
//                openApiSpecification.getSpecification().toString());
        // write configuration to file
//        BoTestIO.writeToFile("E:\\Programming\\Java\\BoTest\\target\\test-configuration\\petstore.txt",
//                testConfigurationObject.toString());
        // write test-cases to file
//        BoTestIO.writeToFile("E:\\Programming\\Java\\BoTest\\target\\test-cases\\petstore.txt",
//                testCases.toString());
        // write test-class to file
//        BoTestIO.writeToFile("E:\\Programming\\Java\\BoTest\\target\\test-classes\\Petstore.java",
//                testClass);
        BoTestIO.writeToFile("E:\\Programming\\Java\\BoTest\\src\\generation\\"+ testWriter.getClassName()
                        + ".java", testClass);

        // execute tests
        JUnitTestRunner testRunner = new JUnitTestRunner(testWriter.getClassName());

        testRunner.execute();
    }
}
