package main;

import configuration.generators.DefaultTestConfigurationGenerator;
import configuration.pojos.TestConfigurationObject;
import generators.AbstractTestCaseGenerator;
import testcases.TestCase;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TestConfigurationGeneration {
    private static String openApiSpecificationPath= "src/resources/simple_api/simple-api.yaml";

    public static void main(String[] args) {
        OpenApiSpecification openApiSpecification = new OpenApiSpecification(openApiSpecificationPath);

        DefaultTestConfigurationGenerator defaultTestConfigurationGenerator = new DefaultTestConfigurationGenerator(openApiSpecification);

        TestConfigurationObject testConfigurationObject = defaultTestConfigurationGenerator.generate();
        List<TestCase> testCases = new AbstractTestCaseGenerator(openApiSpecification, testConfigurationObject).generateTestCases();

        System.out.println(testConfigurationObject);
        System.out.println(testCases);

        // TODO: print / remove later
        try {
            try {
                File myObj = new File("F:\\output\\configuration.txt");
                if (myObj.createNewFile()) {
                    System.out.println("File created: " + myObj.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }


            FileWriter myWriter = new FileWriter("F:\\output\\configuration.txt", true);

            try {
                myWriter.write(testConfigurationObject + "\n");
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            myWriter.close();
        } catch (IOException ex) {
            System.out.println("File Error: " + ex);
        }

        // TODO: print / remove later
        try {
            try {
                File myObj = new File("F:\\output\\testcases.txt");
                if (myObj.createNewFile()) {
                    System.out.println("File created: " + myObj.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }


            FileWriter myWriter = new FileWriter("F:\\output\\testcases.txt", true);

            try {
                myWriter.write(testCases + "\n");
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            myWriter.close();
        } catch (IOException ex) {
            System.out.println("File Error: " + ex);
        }
//        System.out.println(openApiSpecification.getSpecification());
    }
}
