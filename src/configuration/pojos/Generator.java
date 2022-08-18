package configuration.pojos;

import java.util.List;

public class Generator {
    private String type;
    private List<GenParameter> genParameters = null;
    private Boolean valid = true; // Whether or not the generator generates valid data

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<GenParameter> getGenParameters() {
        return genParameters;
    }

    public void setGenParameters(List<GenParameter> genParameters) {
        this.genParameters = genParameters;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        return "Generator{" +
                "\n\t\t\t\t\ttype='" + type + '\'' +
                ", \n\t\t\t\t\tgenParameters=" + genParameters +
                ", \n\t\t\t\t\tvalid=" + valid +
                "\n\t\t\t\t}";
    }
}
