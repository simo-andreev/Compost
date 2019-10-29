package bg.o.sim.afc.model.afc;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;

public class AfcNodeString extends AfcNode {

    private List<String> dict;
    private String format;

    @JsonGetter("enum")
    public List<String> getDict() {
        return dict;
    }

    @JsonSetter("enum")
    public void setDict(List<String> dict) {
        this.dict = dict;
    }

    private Integer minLength;
    private Integer maxLength;

    public Integer getMinLength() {
        return minLength;
    }

    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

//    @Override
//    public FormField convert(String key, boolean mandatory) {
//        FormField formField = new FormField();
//        formField.setLabel(key);
//        FormFieldName formFieldName = new FormFieldName(key);
//        formField.setFieldName(formFieldName);
//
//        Validation validation = new Validation();
//        validation.setMandatory(mandatory);
//        if (getDict() != null) {
//            if (getDict().size() > 0) {
//                formField.setDictionary(getDict().get(0));
//            }
//            formField.setWidgetName("widget_dropdown");
//        } else if (getFormat() != null && getFormat().equals("date")) {
//            formField.setWidgetName("widget_date_picker");
//        } else {
//            formField.setWidgetName("widget_text_input");
//
//            validation.setType(Validation.ValidationType.text);
//            validation.setMinLength(getMinLength());
//            validation.setMaxLength(getMaxLength());
//
//            formField.setValidation(validation);
//        }
//
//        return formField;
//    }
}
