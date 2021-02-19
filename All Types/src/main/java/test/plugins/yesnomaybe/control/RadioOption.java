/**
 * Class that represents a single radio button option.
 *
 * cwalsh 08/31/2015
 **/
 
package test.plugins.yesnomaybe.control;
 
public class RadioOption {
     
    private String optionName;
    private String optionLabel;
    private String optionValue;
    private boolean checked;
 
    public RadioOption(String name, String label, String value, boolean checked) {
        this.optionName = name;
        this.optionLabel = label;
        this.optionValue = value;
        this.checked = checked;
    }
     
    public String getOptionName() {
        return optionName;
    }
     
    public String getOptionLabel() {
        return optionLabel;
    }
     
    public String getOptionValue() {
        return optionValue;
    }
     
    public boolean isChecked() {
        return checked;
    }
}