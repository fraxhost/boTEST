package configuration.pojos;

import java.util.List;

public class TestParameter {
    private String name;
    private String in;
    private double weight;
    private TestGenerator testGenerator;
    private List<TestParameter> parameters;

    public List<TestParameter> getParameters() { return parameters;}
    public void setParameters(List<TestParameter> parameters) {this.parameters = parameters;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public TestGenerator getGenerator() {
        return testGenerator;
    }

    public void setGenerator(TestGenerator testGenerator) {
        this.testGenerator = testGenerator;
    }

    @Override
    public String toString() {
        return "TestParameter{\n" +
                " \t\t\t\tname='" + name + '\'' +
                ", \n\t\t\t\tin='" + in + '\'' +
                ", \n\t\t\t\tweight=" + weight +
                ", \n\t\t\t\ttestcases.generators=" + testGenerator +
                "\n\t\t\t}";
    }
}
