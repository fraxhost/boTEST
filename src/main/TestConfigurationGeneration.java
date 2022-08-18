package main;

import configuration.generators.DefaultTestConfigurationGenerator;

public class TestConfigurationGeneration {
    private static String openApiSpecificationPath= "src/resources/simple_api/simple-api.yaml";

    public static void main(String[] args) {
        OpenApiSpecification openApiSpecification = new OpenApiSpecification(openApiSpecificationPath);

        DefaultTestConfigurationGenerator defaultTestConfigurationGenerator = new DefaultTestConfigurationGenerator(openApiSpecification);
        defaultTestConfigurationGenerator.generate();

//        System.out.println(openApiSpecification.getSpecification());
    }
}
