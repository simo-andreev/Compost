package bg.o.sim.afc.model.afc;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        visible = true,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = AfcForm.class, name = "object"),
        @JsonSubTypes.Type(value = AfcNodeString.class, name = "string"),
        @JsonSubTypes.Type(value = AfcNodeInteger.class, name = "integer"),
        @JsonSubTypes.Type(value = AfcNodeInteger.class, name = "number"),
        @JsonSubTypes.Type(value = AfcNodeBoolean.class, name = "boolean"),
        @JsonSubTypes.Type(value = AfcNodeArray.class, name = "array"),
})
public abstract class AfcNode {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public abstract FormField convert(String key, boolean mandatory);
}
