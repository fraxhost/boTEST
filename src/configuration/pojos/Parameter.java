package configuration.pojos;

import java.util.List;

public class Parameter {
    private String name;
    private String in;
    private double weight;
    private List<Generator> generators;

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

    public List<Generator> getGenerators() {
        return generators;
    }

    public void setGenerators(List<Generator> generators) {
        this.generators = generators;
    }

    @Override
    public String toString() {
        return "TestParameter{\n" +
                " \t\t\t\tname='" + name + '\'' +
                ", \n\t\t\t\tin='" + in + '\'' +
                ", \n\t\t\t\tweight=" + weight +
                ", \n\t\t\t\ttestcases.generators=" + generators +
                "\n\t\t\t}";
    }
}
