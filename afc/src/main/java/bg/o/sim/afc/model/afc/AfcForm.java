package bg.o.sim.afc.model.afc;

import java.util.List;
import java.util.Map;


public class AfcForm extends AfcNode {

    private List<String> required;
    private Map<String, AfcNode> properties;

    public List<String> getRequired() {
        return required;
    }

    public void setRequired(List<String> required) {
        this.required = required;
    }

    public Map<String, AfcNode> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, AfcNode> properties) {
        this.properties = properties;
    }

//    @Override
//    public FormField convert(String key, boolean mandatory) {
//        FormField formField = new FormField();
//        formField.setLabel(key);
//        FormFieldName formFieldName = new FormFieldName(key);
//        formField.setFieldName(formFieldName);
//        formField.setWidgetName("widget_complex_object");
//
//        List<FormField> fields = new ArrayList<>();
//        List<String> required = getRequired() != null ? getRequired() : new ArrayList<String>();
//
//        for (Map.Entry<String, AfcNode> property : getProperties().entrySet()) {
//            mandatory = required.contains(property.getKey());
//            FormField subField = property.getValue().convert(key + "." + property.getKey(), mandatory);
//            if (subField != null) {
//                subField.setLabel(property.getKey());
//                fields.add(subField);
//            }
//        }
//        formField.setFields(fields);
//
//        return formField;
//    }
}
