package configuration.pojos;

import java.util.List;

public class TestConfiguration {
    private List<TestOperation> testOperations = null;
    public List<TestOperation> getOperations() {
        return testOperations;
    }
    public void setOperations(List<TestOperation> testOperations) {
        this.testOperations = testOperations;
    }

    @Override
    public String toString() {
        return "TestConfiguration{\n" +
                "\t\toperations=" + testOperations +
                "\n\t}";
    }
}
