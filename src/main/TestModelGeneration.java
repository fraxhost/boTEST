package main;

public class TestModelGeneration {
    private static String openApiSpecificationPath= "src/resources/petstore/petstore.yaml";

    public static void main(String[] args) {
        OpenApiSpecification openApiSpecification = new OpenApiSpecification(openApiSpecificationPath);
    }
}
