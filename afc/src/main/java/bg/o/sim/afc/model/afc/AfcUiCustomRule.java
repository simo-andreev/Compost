package bg.o.sim.afc.model.afc;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        visible = true,
        property = "effect")
@JsonSubTypes({
        @JsonSubTypes.Type(value = AfcUiCustomRuleChangeDictionary.class, name = "CHANGE_DICTIONARY"),
        @JsonSubTypes.Type(value = AfcUiCustomRuleFilterDictionary.class, name = "FILTER_DICTIONARY")
})
public abstract class AfcUiCustomRule {

//    private FormFieldRule.Effect effect;

//    public FormFieldRule.Effect getEffect() {
//        return effect;
//    }

//    public void setEffect(FormFieldRule.Effect effect) {
//        this.effect = effect;
//    }
}
