package configuration.pojos;

public class TestConfigurationObject {
    private Auth auth;
    private TestConfiguration testConfiguration;

    public Auth getAuth() {
        return auth;
    }

    public void setAuth(Auth auth) {
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
