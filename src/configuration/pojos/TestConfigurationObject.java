package configuration.pojos;

public class TestConfigurationObject {
    private TestAuth auth;
    private TestConfiguration testConfiguration;

    public TestAuth getAuth() {
        return auth;
    }

    public void setAuth(TestAuth auth) {
        this.auth = auth;
    }

    public TestConfiguration getTestConfiguration() {
        return testConfiguration;
    }

    public void setTestConfiguration(TestConfiguration testConfiguration) {
        this.testConfiguration = testConfiguration;
    }

    @Override
    public String toString() {
        return "TestConfigurationObject{" + "\n\t" +
                "auth=" + auth + ",\n\t" +
                "testConfiguration=" + testConfiguration + "\n" +
                '}';
    }
}
