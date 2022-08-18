package configuration.pojos;

import java.util.List;

public class TestConfiguration {
    private List<Operation> operations = null;
    public List<Operation> getOperations() {
        return operations;
    }
    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    @Override
    public String toString() {
        return "TestConfiguration{\n" +
                "\t\toperations=" + operations +
                "\n\t}";
    }
}
