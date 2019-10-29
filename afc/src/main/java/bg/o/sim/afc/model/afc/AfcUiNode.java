package bg.o.sim.afc.model.afc;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.List;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        visible = true,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = AfcUiVerticalLayout.class, name = "VerticalLayout"),
        @JsonSubTypes.Type(value = AfcUiHorizontalLayout.class, name = "HorizontalLayout"),
        @JsonSubTypes.Type(value = AfcUiGroup.class, name = "Group"),
        @JsonSubTypes.Type(value = AfcUiControl.class, name = "Control"),
        @JsonSubTypes.Type(value = AfcUiCategorization.class, name = "CategorizationObject")
})
public abstract class AfcUiNode {

    private List<AfcUiNode> elements;
    private String label;
    private AfcUiOptions options;
    private String type;
    private String title;
    private AFcUiSchemaRule rule;
    private String scope;
    private List<AfcUiCustomRule> customRules;


    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<AfcUiNode> getElements() {
        return elements;
    }

    public void setElements(List<AfcUiNode> elements) {
        this.elements = elements;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public AfcUiOptions getOptions() {
        return options;
    }

    public void setOptions(AfcUiOptions options) {
        this.options = options;
    }

    public AFcUiSchemaRule getRule() {
        return rule;
    }

    public void setRule(AFcUiSchemaRule rule) {
        this.rule = rule;
    }

    public List<AfcUiCustomRule> getCustomRules() {
        return customRules;
    }

    public void setCustomRules(List<AfcUiCustomRule> customRules) {
        this.customRules = customRules;
    }
}
