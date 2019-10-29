package bg.o.sim.afc.model.afc;

public class AfcNodeInteger extends AfcNode {

    private Integer minimum;
    private Integer maximum;

    public Integer getMinimum() {
        return minimum;
    }

    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }

    public Integer getMaximum() {
        return maximum;
    }

    public void setMaximum(Integer maximum) {
        this.maximum = maximum;
    }

//    @Override
//    public FormField convert(String key, boolean mandatory) {
//        FormField formField = new FormField();
//        formField.setLabel(key);
//        FormFieldName formFieldName = new FormFieldName(key);
//        formField.setFieldName(formFieldName);
//        Validation validation = new Validation();
//        validation.setMandatory(mandatory);
//
//        formField.setWidgetName("widget_text_input");
//
//        validation.setType(Validation.ValidationType.number);
//        validation.setMinValue(String.valueOf(getMinimum()));
//        validation.setMaxValue(String.valueOf(getMaximum()));
//
//        formField.setValidation(validation);
//        return formField;
//    }
}
