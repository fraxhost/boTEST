package configuration.pojos;

import java.util.List;

public class Operation {
    private String testPath;
    private String operationId;
    private String method;
    private List<Parameter> testParameters = null;
    private List<Parameter> bodyParameters = null;
    private String expectedResponse;

    public String getTestPath() {
        return testPath;
    }

    public void setTestPath(String testPath) {
        this.testPath = testPath;
    }

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public List<Parameter> getTestParameters() {
        return testParameters;
    }

    public void setTestParameters(List<Parameter> testParameters) {
        this.testParameters = testParameters;
    }

    public List<Parameter> getBodyParameters() {
        return bodyParameters;
    }

    public void setBodyParameters(List<Parameter> bodyParameters) {
        this.bodyParameters = bodyParameters;
    }

    public String getExpectedResponse() {
        return expectedResponse;
    }

    public void setExpectedResponse(String expectedResponse) {
        this.expectedResponse = expectedResponse;
    }

    @Override
    public String toString() {
        return "Operation{\n" +
                "\t\t\ttestPath='" + testPath + '\'' +
                ", \n\t\t\toperationId='" + operationId + '\'' +
                ", \n\t\t\tmethod='" + method + '\'' +
                ", \n\t\t\ttestParameters=" + testParameters +
                ", \n\t\t\texpectedResponse='" + expectedResponse + '\'' +
                "\n\t\t}";
    }
}
