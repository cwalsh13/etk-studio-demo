/**
 *
 * Form control definition for Yes/No/Maybe control
 *
 **/
package test.plugins.yesnomaybe;
 
import com.entellitrak.configuration.AbstractScriptBasedFormControlModel;
 
public class YesNoMaybeFormControl extends AbstractScriptBasedFormControlModel {
     
    public String getJsIncludeScript() {
        return null;
    }
     
    public String getEditableControlScript() {
        return getScriptCode("datatypes.yesnomaybe.control.YesNoMaybeControl");
    }
     
    public String getReadOnlyControlScript() {
        return getScriptCode("datatypes.yesnomaybe.control.YesNoMaybeControlReadOnly");
    }
     
    public String getAccessibleEditableControlScript() {
        return getScriptCode("datatypes.yesnomaybe.control.YesNoMaybeControl");
    }
     
    public String getAccessibleReadOnlyControlScript() {
        return getScriptCode("datatypes.yesnomaybe.control.YesNoMaybeControlReadOnly");
    }
     
    public String getSearchControlScript() {
        return getScriptCode("datatypes.yesnomaybe.control.YesNoMaybeControl");
    }
}