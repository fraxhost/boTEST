package configuration.pojos;

import java.util.List;

public class Generator {
    private String type; // Generator type
    private Boolean valid = true; // Whether or not the generator generates valid data
    private List<GeneratorParameter> generatorParameters = null;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<GeneratorParameter> getGenParameters() {
        return generatorParameters;
    }

    public void setGenParameters(List<GeneratorParameter> generatorParameters) {
        this.generatorParameters = generatorParameters;
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
                ", \n\t\t\t\t\tgenParameters=" + generatorParameters +
                ", \n\t\t\t\t\tvalid=" + valid +
                "\n\t\t\t\t}";
    }
}
